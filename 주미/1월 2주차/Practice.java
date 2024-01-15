import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Practice {

//제일 작은 수 제거하기
public int[] solution01(int[] arr) {

    //배열 길이가 1인 경우 -1 반환
    if(arr.length == 1){
        int[] answer = {-1};
        return answer;
    }

    //배열길이가 1보다 클 때 가장 작은 수를 뺀 길이의 배열로
    int[] answer = new int[arr.length-1];

    int min = arr[0]; //하나의 값을 기준으로 잡음.

    //가장 작은 수 구하기
    for(int i = 0; i < arr.length; i++) {
        min = Math.min(min, arr[i]);
    }

    int index = 0;  //반복문용 변수. 가장 작은 수가 여러개 일 수 있기 때문에 사용

    for(int i = 0; i < arr.length; i++) {
        if(arr[i] == min) {
            continue;
        }

        answer[index++] = arr[i];
    }

    return answer;
}

//배열의 길이를 2의 거듭제곱으로 만들기
public int[] solution02(int[] arr) {
    int n = arr.length;
    int targetLength = 1;

    // targetLength가 n보다 작거나 같은 2의 거듭제곱을 찾음
    while (targetLength < n) {
        targetLength *= 2;
    }

    // 0을 추가하여 targetLength 길이의 배열 생성
    int[] answer = new int[targetLength];
    Arrays.fill(answer, 0);

    // arr의 요소들을 answer로 복사
    System.arraycopy(arr, 0, answer, 0, n);

    return answer;
}
// 세개의 구분자

    public String[] solution03(String myStr) {
        List<String> result = new ArrayList<>();

        StringBuilder current = new StringBuilder();
        for (char c : myStr.toCharArray()) {
            if (c == 'a' || c == 'b' || c == 'c') {
                if (current.length() > 0) {
                    result.add(current.toString());
                    current = new StringBuilder();
                }
            } else {
                current.append(c);
            }
        }

        if (current.length() > 0) {
            result.add(current.toString());
        }

        if (result.isEmpty()) {
            return new String[]{"EMPTY"};
        } else {
            return result.toArray(new String[0]);
        }
    }

// 문자열 반복해서 출력하기
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int n = sc.nextInt();

    for(int i = 0; i < n; i++){

        System.out.print(str);

    }
}

//가운데 글자 가져오기
public String solution05(String s) {
    String answer = "";
    int length = s.length();

    if(length % 2 == 0) {
        answer = s.substring(length/2-1, length/2+1);
    } else {
        answer = s.substring(length/2, length/2+1);
    }


    return answer;
}
//내적
public int solution06(int[] a, int[] b) {
    int answer = 0;

    for(int i=0; i<a.length; i++) {
        answer += a[i] * b[i];
    }

    return answer;
}

// 수박수박
public String solution07(int n) {
    String answer = "";

    for (int i = 0; i < n; i++) {
        if(i%2 == 0) {
            answer += "수";
        }

        if(i%2 == 1) {
            answer += "박";
        }
    }

    return answer;
}


// 수열과 구간 쿼리4
public int[] solution08(int[] arr, int[][] queries) {
    for (int i=0; i<queries.length; i++) {
        int s = queries[i][0];
        int e = queries[i][1];
        int k = queries[i][2];

        for(int j=s; j<=e; j++) {
            if(j%k==0){
                arr[j] += 1;
            }
        }
    }
    return arr;
}


// 2의 영역

    public int[] solution09(int[] arr) {
        int firstIndex = -1;
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                firstIndex = i;
                break;
            }
        }
        if (firstIndex != -1) {
            for (int i = firstIndex; i < arr.length; i++) {
                if (arr[i] == 2) {
                    lastIndex = i;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        if (firstIndex == -1) {
            list.add(-1);
        } else if (firstIndex == lastIndex) {
            list.add(2);
        } else {
            for (int i = firstIndex; i <= lastIndex; i++) {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }



//https://sigfriede.tistory.com/191

// 문자열 묶기

    public int solution10(String[] strArr) {
        int answer = 0;
        Map<Integer,Integer> cnt = new HashMap<>();
        for(String str : strArr){
            cnt.merge(str.length(),1,(v1,v2) -> {
                return v1+1;
            });
        }
        for(int key : cnt.keySet()){
            answer = Math.max(answer,cnt.get(key));
        }
        return answer;
    }

// 리스트 자르기
public int[] solution11(int n, int[] slicer, int[] num_list) {
    List<Integer> list = new ArrayList<>();
    int a = slicer[0];
    int b = slicer[1];
    int c = slicer[2];
    if(n == 1) {
        for(int i =0; i<b+1; i++) {
            list.add(num_list[i]);
        }
    }else if(n == 2) {
        for(int i = a; i<num_list.length; i++) {
            list.add(num_list[i]);
        }
    }else if(n ==3) {
        for(int i = a; i<b+1; i++) {
            list.add(num_list[i]);
        }
    }else if(n == 4) {
        for(int i = a; i<b+1; i+=c) {
            list.add(num_list[i]);

        }
    }
    int[] answer = list.stream().mapToInt(x -> x).toArray();
    return answer;
}


// 7의 개수

    public int solution12(int[] array) {
        int answer = 0;
        String str = Arrays.toString(array);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '7'){
                answer++;
            }
        }
        return answer;
    }

// 컨트롤 제트
public int solution13(String s) {
    String[] sArray = s.split(" ");
    int result = 0;
    for (int i = 0; i < sArray.length; i++) {
        if (sArray[i].equals("Z")) {
            result -= Integer.parseInt(sArray[i - 1]);
            continue;
        }
        result += Integer.parseInt(sArray[i]);
    }
    return result;
}
// 커피 심부름
public int solution14(String[] order) {
    int money = 0;
    String[] m4500 = {"iceamericano", "americanoice","hotamericano", "americanohot", "americano", "anything"};
    String[] m5000 = {"icecafelatte", "cafelatteice","hotcafelatte", "cafelattehot", "cafelatte"};

    for(int i = 0 ; i < order.length; i++){
        boolean tf = Arrays.asList(m4500).contains(order[i]);

        //4500원인 메뉴
        if(tf == true){
            money += 4500;
        } else {
            money += 5000;
        }
    }
    return money;
}

// 이진수 더하기
public String solution15(String bin1, String bin2) {
    String answer = "";
    answer = Integer.toBinaryString(Integer.parseInt(bin1,2) + Integer.parseInt(bin2,2));
    return answer;

}



//https://dhdh-study.tistory.com/116

// 약수의 개수와 덧셈
public int solution16(int left, int right) {
    int answer = 0;

    for(int i = left; i <= right; i++) {
        int cnt = 0;

        for(int j = 1; j <= i; j++) {
            if(i % j == 0) cnt++;
        }

        if(cnt % 2 == 0) answer += i;
        else answer -= i;
    }

    return answer;
}



/*

※ 이번 문제는 이중 for문을 이용하여 풀면 쉽게 풀립니다.

i를 left부터, right까지 순회하고

j를 1부터 i까지 순회하여 i를 j로 나누어 떨어지는 수를 cnt에 증가시켜 홀수개의 약수를 가진 수인지, 짝수개의 약수를 가진 수인지 구분하면 되는 문제입니다.
*/

// qr code
public String solution17(int q, int r, String code) {
    StringBuilder answer = new StringBuilder();

    for (int i = 0; i < code.length(); i++) {
        if (i % q == r) {
            answer.append(code.charAt(i));
        }
    }

    return answer.toString();

}

//https://tiny-stone.com/122

// 산책
public int[] solution18(String route) {
    int east = 0;
    int north = 0;
    int[] answer = new int [2];
    for(int i=0; i<route.length(); i++){
        switch(route.charAt(i)){
            case 'N':
                north++;
                break;
            case 'S':

                north--
                ;
                break;
            case 'E':

                east++
                ;
                break;
            case 'W':

                east--
                ;

                break
                        ;
        }
    }
    answer[0] = east;
    answer[1] = north;
    return answer;
}

// 조건에 맞게 수열 변환하기 2
public int[] solution19(int[] arr) {
    int answer = 0;
    boolean bool = true;
    while (bool) {
        answer++;
        bool = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] /= 2;
                bool = true;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                arr[i] = arr[i] * 2 + 1;
                bool = true;
            }
        }
    }
    return new int[]{answer - 1};

}
//https://sigfriede.tistory.com/261

// 특수문자 출력하기
public static void main01(String[] args) {

    System.out.print("!@#$%^&*(\\'\"<>?:;");

}

}
