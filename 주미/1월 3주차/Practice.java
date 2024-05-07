public class Practice {


    // 소인수분해
    public int[] solution01(int n) {
        List<Integer> list = new ArrayList<>();

        for(int i=2; i<=n; i++){
            if(n%i == 0){
                while(n%i==0){
                    n/=i;
                }
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for(int i =0 ; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }


    // 문자열 내림차순으로 배치하기
    public String solution02(String s) {

        String answer = "";

        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());

        for(String a : str)
            answer += a;

        return answer;
    }


    //잘라서 배열로 저장하기
    public String[] solution03(String my_str, int n) {
        int cnt = (my_str.length() + n - 1) / n;
        String[] answer = new String[cnt];

        for(int i = 0; i < cnt; i++){
            int start = n * i;
            int end = 0;
            if(start + n >= my_str.length()){
                end = my_str.length();
            } else {
                end = start + n;
            }
            answer[i] = my_str.substring(start, end);
        }
        return answer;
    }


    //문자 개수 세기
    public int[] solution04(String my_string) {
        int[] answer = new int[52];


        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                answer[c - 'A']++;
            } else if (c >= 'a' && c <= 'z') {
                answer[26 + c - 'a']++;
            }
        }

        return answer;
    }

//부족한 금액 계산하기

    public long solution05(int price, int money, int count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }

/*
*    public long solution(long price, long money, long count) {
        long number = 0;
        for(int i = 1; i <= count; i++)
        {
            number += i * price;
        }

        if (number > money)
            return number-money;

        else return 0;

    }*/

//배열만들기 4
public int[] solution06(int[] arr) {
    ArrayList<Integer> tmp= new ArrayList();

    int i=0;
    while(i<arr.length){

        if(tmp.size()==0){
            tmp.add(arr[i]);
            i=i+1;
        }
        else{
            int last=tmp.get(tmp.size()-1);
            if(tmp.size()!=0 && last<arr[i]){
                tmp.add(arr[i]);
                i=i+1;
            }
            else if(tmp.size()!=0 && last>=arr[i]){
                tmp.remove(tmp.size()-1);
            }
        }

    }

    int stk[]=new int[tmp.size()];
    for(int k=0;k<tmp.size();k++){
        stk[k]=tmp.get(k).intValue();
    }
    return stk;
}

//공 던지기
public int solution07(int[] numbers, int k) {
    return numbers[2 * (k - 1) % numbers.length];
}

//문자열 계산하기
public int solution08(String my_string) {
    String[] arr = my_string.split(" ");
    int answer = Integer.valueOf(arr[0]);
    for (int i = 1; i < arr.length; i++) {
        if (arr[i].equals("+")) {
            answer += Integer.valueOf(arr[i + 1]);
        } else if (arr[i].equals("-")) {
            answer -= Integer.valueOf(arr[i + 1]);
        }else {
            continue;
        }
    }
    return answer;
}

//영어가 싫어요

    public long solution09(String numbers) {
        long answer = 0;

        numbers = numbers.replace("zero","0");
        numbers = numbers.replace("one","1");
        numbers = numbers.replace("two","2");
        numbers = numbers.replace("three","3");
        numbers = numbers.replace("four","4");
        numbers = numbers.replace("five","5");
        numbers = numbers.replace("six","6");
        numbers = numbers.replace("seven","7");
        numbers = numbers.replace("eight","8");
        numbers = numbers.replace("nine","9");

        answer = Long.parseLong(numbers);

        return answer;


    }

    // 저축
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {
            money +=
                    before
            ;
            month++;
        }
        while (
                money
                        < 100) {

            money+= after
            ;
            month++;
        }

        System.out.println(month);
    }

    //두 수의 합

    public String solution11(String a, String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);

        BigInteger sum = numA.add(numB);

        return sum.toString();
    }



    /*
    java.math.BigInteger 클래스를 사용하여 매우 큰 정수를 다룰 수 있습니다.
    주어진 문자열 a와 b를 BigInteger 객체로 변환한 후, add 메서드를 사용하여 두 숫자를 더합니다.
    그리고 toString 메서드를 호출하여 덧셈 결과를 문자열로 변환하여 반환합니다.*/



    //문자열 다루기 기본
    public boolean solution12(String s) {
        if(s.length() != 4 && s.length() != 6) return false;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') return false;
        }
        return true;
    }


    //왼쪽 오른쪽
    public String[] solution13(String[] str_list) {
        String[] answer = {};
        for (int i = 0; i < str_list.length;i++) {
            if (str_list[i].equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }
        return answer;
    }

    // 배열만들기6

    public int[] solution14(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size() - 1) == arr[i]) {
                stk.remove(stk.size() - 1);
                i++;
            } else {
                stk.add(arr[i]);
                i++;
            }
        }

        if (stk.isEmpty()) {
            return new int[]{-1};
        }

        int[] answer = new int[stk.size()];
        for (int j = 0; j < stk.size(); j++) {
            answer[j] = stk.get(j);
        }

        return answer;
    }

    //조건 문자열
    public int solution15(String ineq, String eq, int n, int m) {
        if (ineq.equals(">")) {
            if (eq.equals("=")) {
                return n >= m ? 1 : 0;
            } else if (eq.equals("!")) {
                return n > m ? 1 : 0;
            }
        } else if (ineq.equals("<")) {
            if (eq.equals("=")) {
                return n <= m ? 1 : 0;
            } else if (eq.equals("!")) {
                return n < m ? 1 : 0;
            }
        }

        return 0; // 기본적으로 0을 반환 (조건에 맞지 않는 경우)
    }


//https://heidi-mood.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-lv0-%EC%A1%B0%EA%B1%B4-%EB%AC%B8%EC%9E%90%EC%97%B4


//문자열 여러 번 뒤집기
public String solution16(String my_string, int[][] queries) {
    char[] arr = my_string.toCharArray(); // 문자열을 문자 배열로 변환

    for (int[] query : queries) {
        int start = query[0];
        int end = query[1];

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    return new String(arr); // 문자 배열을 문자열로 변환하여 반환
}
//https://velog.io/@js4183/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-Lv.0-%EB%AC%B8%EC%9E%90%EC%97%B4-%EC%97%AC%EB%9F%AC-%EB%B2%88-%EB%92%A4%EC%A7%91%EA%B8%B0.java

// 행렬의 덧셈
public int[][] solution17(int[][] arr1, int[][] arr2) {
    int[][] answer = {};

    answer = arr1;
    for(int i=0; i<arr1.length;i++){
        for(int j=0; j<arr1[0].length;j++){
            answer[i][j] += arr2[i][j];
        }
    }
    return answer;
}

//구슬을 나누는 경우의 수
public int solution18(int balls, int share) {
    long answer = 1;
    int shareIndex = 1;
    for(int i = share+1; i <= balls; i++){
        answer *= i;
        answer /= shareIndex;
        shareIndex++;
    }

    return (int)answer;
}

//https://ulmu0426.tistory.com/6


    //삼각형의 완성조건(2)
    public int solution19(int[] sides) {
        int bigValue = Math.max(sides[0], sides[1]);
        int smallValue = Math.min(sides[0], sides[1]);

        int lowLimit = bigValue - smallValue;
        int highLimit = bigValue + smallValue;

        return highLimit - lowLimit - 1;
    }

    //https://velog.io/@as9587/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8-%EC%9E%85%EB%AC%B8-%EC%82%BC%EA%B0%81%ED%98%95%EC%9D%98-%EC%99%84%EC%84%B1%EC%A1%B0%EA%B1%B4-2-JAVA-22%EB%85%84-10%EC%9B%94-4%EC%9D%BC



    //수열과 구간쿼리2
    public int[] solution20(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1); // 초기값으로 -1을 채워놓습니다.

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            int minGreaterValue = Integer.MAX_VALUE; // 최소값을 저장할 변수, 일단 최대값으로 초기화합니다.

            for (int j = s; j <= e; j++) {
                if (arr[j] > k && arr[j] < minGreaterValue) {
                    minGreaterValue = arr[j];
                }
            }

            if (minGreaterValue != Integer.MAX_VALUE) {
                answer[i] = minGreaterValue;
            }
        }

        return answer;
    }

    //https://megak.tistory.com/153
}
