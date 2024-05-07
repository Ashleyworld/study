import java.util.Arrays;
import java.util.List;

public class Practice {

// 음양더하기
public int solution01(int[] absolutes, boolean[] signs) {
    int answer = 0;

    for (int i = 0; i < signs.length; i++) {
        if (signs[i]) {
            answer += absolutes[i];
        } else {
            answer -= absolutes[i];
        }
    }

    return answer;
}

// 콜라츠 추측
public int solution02(long num) {
    int answer = 0;

    while(num != 1) {
        if(num % 2 == 0)
            num /= 2;
        else
            num = num * 3 + 1;
        answer++;

        if(answer >= 500) {
            answer = -1;
            break;
        }
    }

    return answer;
}
// 1로 만들기
public int solution03(int[] num_list) {
    int answer = 0;
    for (int i = 0 ;i < num_list.length;i++) {
        while(num_list[i] != 1) {
            if (num_list[i] % 2 == 0) {
                num_list[i] /= 2;
            } else {
                num_list[i] -= 1;
                num_list[i] /= 2;
            }
            answer++;
        }
    }
    return answer;
}

// 서울에서 김서방찾기
public String solution04(String[] seoul) {
    String answer = "";
    for(int i=0; i<seoul.length; i++) {
        if(seoul[i].equals("Kim")) {
            answer = "김서방은 " + i + "에 있다";
        }
    }
    return answer;
}
// 2차원으로 만들기
public int[][] solution05(int[] num_list, int n) {
    int[][] answer = new int[num_list.length / n][n];
    int count = 0;
    for (int i = 0; i < answer.length; i++) {
        for (int j = 0; j < answer[i].length; j++, count++) {
            answer[i][j] = num_list[count];
        }
    }
    return answer;
}
// 배열 만들기5
public int[] solution06(String[] intStrs, int k, int s, int l) {
    List<Integer> result = new ArrayList<>();

    for (String str : intStrs) {
        int i = Integer.parseInt(str.substring(s, s + l));
        if (i > k) {
            result.add(i);
        }
    }

    return result.stream().mapToInt(i->i).toArray();
}
// 나누어 떨어지는 숫자 배열
public int[] solution07(int[] arr, int divisor) {
    int count = 0;
    int number = 0;

    for(int i = 0; i < arr.length; i++){
        if(arr[i] % divisor == 0){
            count++;
        }
    }

    if(count == 0){
        int[] answer = {-1};
        return answer;
    }

    int[] answer = new int[count];

    for(int i = 0; i < arr.length; i++){
        if(arr[i] % divisor == 0){
            answer[number] = arr[i];
            number++;
        }
    }

    Arrays.sort(answer);
    return answer;

}
// A로 B만들기
public int solution08(String before, String after) {
    char[] arr1 = before.toCharArray();
    char[] arr2 = after.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    String str1 = new String(arr1);
    String str2 = new String(arr2);

    return str1.equals(str2) ? 1 : 0;
}
// 수열과 구간 쿼리3
public int[] solution09(int[] arr, int[][] queries) {
    int a,b,temp;

    for(int i=0; i<queries.length; i++){
        a = queries[i][0];
        b = queries[i][1];

        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    return arr;

}
// 팩토리얼
public int solution10(int n) {
    int answer = 0;
    int factorial = 1;

    //n의 범위값이 정해져 있으므로 최대 팩토리얼은 10
    for(int i=1; i<=10; i++){
        factorial *= i;

        if(factorial == n){
            answer = i;
            break;
        }else if(n < factorial){
            answer = (i-1);
            break;
        }
    }
    return answer;
}
// k의 개수
public int solution11(int i, int j, int k) {
    int count = 0;
    String strK = String.valueOf(k);
    for (int l = i; l <= j; l++) {
        String value = String.valueOf(l);
        if (value.contains(strK)) {
            String[] array = value.split("");
            for (String alpha : array) {
                if (alpha.equals(strK)) count++;
            }
        }
    }
    return count;

}
// 없는 숫자 더하기
public int solution12(int[] numbers) {
    int answer = 0;
    int[] answ = new int[10];

    for(int i=0; i<numbers.length; i++) {
        answ[numbers[i]] = 1;
    }

    for(int i=0; i<answ.length; i++) {
        if(answ[i] == 0) answer += i;
    }



    return answer;
}
// 모스부호1
public String solution13(String letter) {
    String[] morse = {".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..","--","-.",
            "---",".--.","--.-",".-.","...","-","..-","...-",
            ".--","-..-","-.--","--.."};
    String[] morseString;
    morseString = letter.split(" ");

    StringBuilder sb = new StringBuilder();
    for (String word : morseString) {
        for (int i = 0; i < morse.length; i++) {
            if (word.equals(morse[i])) sb.append(Character.toString(i + 'a'));
        }
    }
    return sb.toString();
}
// 문자열이 몇번 등장하는지 세기
public int solution14(String myString, String pat) {
    int answer = 0;

    for(int i = myString.length()-1; i>=0; i--){
        String subStr = myString.substring(0, i+1);
        if(subStr.endsWith(pat)){
            answer++;
        }
    }

    return answer;
}

}



/*

- boolean startsWith(String prefix)
- startsWith() 함수는 대상 문자열이 특정 문자 또는 문자열로 시작하는지 체크하는 함수이다.
- 해당 문자열로 시작되는지 여부를 확인하고 boolean에 맞춰 true/false 값을 리턴한다.
*/


// 핸드폰 번호 가리기
public String solution15(String phone_number) {
    String answer = "";
    String decrypt = phone_number.substring(phone_number.length()-4, phone_number.length());
    for (int i = 0; i < phone_number.length()-4 ; i++)
        answer += "*";
    answer += decrypt;
    return answer;
}
// 숨어있는 숫자의 덧셈2
public int solution16(String my_string) {
    int answer = 0;
    String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

    for (String s : str) {
        if (!s.equals("")) {
            answer += Integer.parseInt(s);
        }
    }

    return answer;
}
// 가까운 수
public int solution17(int[] array, int n) {
    int answer = 0;
    int diff = 0;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < array.length; i++) {
        diff = Math.abs(n - array[i]);
        if (diff < min) {
            min = diff;
            answer = array[i];

        } else if (diff == min && array[i] < answer) {
            answer = array[i];
        }
    }

    return answer;
}
// 간단한 논리연산
public boolean solution18(boolean x1, boolean x2, boolean x3, boolean x4) {
    boolean answer = (x1 || x2) && (x3 || x4);

    return answer;
}
// 진료순서 정하기
public int[] solution19(int[] emergency) {
    int[] answer = new int[emergency.length];

    for (int i = 0; i < emergency.length; i++) {
        for (int j = 0; j < emergency.length; j++) {
            if (emergency[i] < emergency[j]) {
                answer[i]++;
            }
        }

        answer[i]++;
    }

    return answer;
}
// 배열의 길이를 2의 거듭제곱으로 만들기
public int[] solution20(int[] arr) {
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
}


