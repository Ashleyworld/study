import java.util.*;

public class Solution01 {

    public String solution01(int a, int b) { //덧셈식 출력
        String result = a + " + " + b + " = " + (a + b);
        return result;
    }

    public String[] solution02(String myString) { // 문자열 잘라서정렬
        List<String> list = new ArrayList<>();
        String[] split = myString.trim().split("x");

        for(String str : split){
            if(!str.isEmpty()) {
                list.add(str);
            }
        }
        String[] answer = list.toArray(new String[list.size()]);
        Arrays.sort(answer);
        return answer;
    }

    public int[] solution03(int[] numbers, String direction) { // 배열 회전
        int[] answer = new int[numbers.length];

        if(direction.equals("right")){
            answer[0] = numbers[numbers.length - 1];
            for(int i = 1; i < numbers.length; i++){
                answer[i] = numbers[i-1];
            }
        } else if(direction.equals("left")) {
            answer[numbers.length - 1] = numbers[0];
            for(int i = 0; i < numbers.length-1; i++){
                answer[i] = numbers[i+1];
            }
        }
        return answer;
    }

    public List solution04(int[] arr, int[][] intervals) { //배열 만들기3
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < intervals.length; i++){
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++){
                answer.add(arr[j]);
            }
        }

        return answer;
    }

    public String solution05(int age) { // 외계행성의 나이
        String answer = "";
        String temp = Integer.toString(age);

        for(int i = 0; i < temp.length(); i++){
            answer += (char) ((char)temp.charAt(i) + 49);
        }

        return answer;
    }

    public List solution06(int n) { // 약수 구하기
        List<Integer> answer = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer.add(i);
            }
        }
        return answer;
    }

    public String solution07(String[] arr) { //문자 리스트 문자열로 변환
        String answer = "";
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }

    public String solution08(int[] numLog) { //수 조작하기2
        String answer = "";
        for(int i = 1; i < numLog.length; i++){
            if(numLog[i] - numLog[i - 1] == 1)
                answer += 'w';
            else if(numLog[i] - numLog[i - 1] == -1)
                answer += 's';
            else if (numLog[i] - numLog[i - 1] == 10)
                answer += 'd';
            else
                answer += 'a';
        }
        return answer;
    }

    public char[] solution09(String a){ // 문자열 돌리기
        char[] c = new char[a.length()];

        for (int i = 0; i < a.length(); i++) {
            c[i] = a.charAt(i);
        }

        return c;
    }

    public int solution10(int n) { //피자 나눠먹기
        int answer = 1;

        while((6 * answer) % n != 0){
            answer++;
        }
        return answer;
    }

    public int solution11(int a, int b, int c) { //주사위 게임
        int answer = 0;
        if (a != b && a != c && b != c) {
            answer = a + b + c;
        } else if (a == b && a == c) {
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else {
            answer = (a + b + c) * (a * a + b * b + c * c);
        }
        return answer;
    }

    public int solution12(int num, int k) { //숫자 찾기
        int answer = 0;

        String str = Integer.toString(num);
        String[] arr = str.split("");

        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(Integer.toString(k))){
                return i + 1;
            }
        }
        return -1;
    }

    public int solution13(int order) { //369게임
        int answer = 0;

        String[] str = Integer.toString(order).split("");

        for(int i = 0; i < str.length; i++){
            if(str[i].equals("3") || str[i].equals("6") || str[i].equals("9")){
                answer++;
            }
        }
        return answer;
    }

    public String solution14(int num) { //짝수와 홀수
        String answer = "";
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public double solution15(int[] arr) { //평균 구하기
        double answer = 0;

        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }

        answer /= arr.length;
        return answer;
    }

    public int solution16(int n) { //약수의 합
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer += i;
            }
        }
        return answer;
    }

    public int solution17(String s) { //문자열 정수로 바꾸기
        int answer = 0;

        return Integer.parseInt(s);
    }

    public int solution18(int n) { //나머지가 1이 되는 수 찾기
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }

    public long[] solution19(int x, int n) {//x만큼 간격이 있는 n개의 숫자
        long[] answer = new long[n];
        for(int i = 0; i < answer.length; i++){
            answer[i] = (long)x * (i + 1);
        }

        return answer;
    }

    boolean solution20(String s) { //문자열 내 p와 y 개수
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;

        for(int i = 0; i < s.length(); i++){

            if(s.toLowerCase().charAt(i) == 'p'){
                pCount++;
            } else if (s.toLowerCase().charAt(i) == 'y') {
                yCount++;
            }
        }

        if(pCount != yCount){
            answer = false;
        }

        return answer;
    }
}


