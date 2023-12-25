import java.util.*;

public class Solution00 {
    public int solution01(int n) { //자릿수 더하기
        int answer = 0;
        String [] arr = String.valueOf(n).split("");

        for(String a : arr) {
            answer += Integer.parseInt(a);
        }
        return answer;
    }

    public int[] solution02(int[] numbers, int num1, int num2) { // 배열 자르기
        int[] answer = Arrays.copyOfRange(numbers, num1 , num2 + 1);
        //Arrays.copyOfrange(복사할 배열, 시작 위치, 배열 크기)
        return answer;
    }

    public int[] solution03(int money) { // 아이스 아메리카노
        int[] answer = new int[2];

        answer[0] = money / 5500;
        answer[1] = money % 5500;

        return answer;
    }

    public List solution04(int n) { //짝수 실허요
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i <= n; i++){
            if(i % 2 != 0){
                answer.add(i);
            }
        }
        return answer;
    }

    public int solution05(int n) { //순서쌍 개수
        int answer = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer ++;
            }
        }
        return answer;
    }

    public int solution06(int number, int n, int m) { // 공배수
        int answer = 0;

        if(number % n == 0 && number % m ==0){
            answer = 1;
        }
        return answer;
    }

    public int solution07(int slice, int n) { // 피자나눠먹기
        int answer = 0;

        if(n % slice == 0){
            answer = n / slice;
        } else {
            answer = n / slice + 1;
        }
        return answer;
    }

    public int solution08(int n) { //제곱수 판별
        int answer = 0;

        if(Math.sqrt(n) % 1 == 0){
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }

    public int solution09(String n_str) { // 문자열 정수 변환
        int answer = Integer.parseInt(n_str);
        return answer;
    }

    public List solution10(int[] num_list, int n) { //n개ㅏ 간격 원소
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < num_list.length; i += n){
            answer.add(num_list[i]);
        }

        return answer;
    }

    public String solution11(String my_string, int n) { //문자열 앞의 n글자
        String answer = "";
        return my_string.substring(0,n);
    }

    public String solution12(String a, String b){ //문자열 붙여 출력
        return a.replace(" ","") + b.replace(" ","");
    }

    public String solution13(String my_string, int k) { //문자열 곱하기
        String answer = "";
        for(int i = 0; i < k; i++){
            answer += my_string;
        }
        return answer;
    }

    public int solution14(int num, int n){ // n의 뱃수
        return num % n == 0 ? 1 : 0;
    }

    public int solution15(int a, int b) { // 더크게 합치기
        int answer = 0;
        int result1 = Integer.parseInt("" + a + b) ;
        int result2 = Integer.parseInt("" + b + a);

        return result1 > result2 ? result1 : result2;
    }

    public String solution16(int n){ // 홀짝 구분
        String answer = "";

        if(n % 2 == 0){
            answer += n + " is even";
        } else {
            answer += n + " is odd";
        }
        return answer;
    }

    public int solution17(double flo) { // 정수 부분
        int answer = (int) flo;
        return answer;
    }

    public int solution18(int n) { //홀짝에 따라 다른값 반환
        int answer = 0;

        if(n % 2 != 0){
            for(int i = 1; i <= n; i++){
                if(i % 2 != 0) {
                    answer += i;
                }
            }
        } else {
            for(int i = 1; i <= n; i++){
                if(i % 2 == 0){
                    answer += i * i;
                }
            }
        }
        return answer;
    }

    public int[] solution19(int[] arr) { // 조건에 맞게 수열 변환
        int[] answer = new int[arr.length];

        for (int i = 0; i < answer.length; i++) {
            if (arr[i] < 50 && arr[i] % 2 != 0) {
                answer[i] = arr[i] * 2;
            } else if (arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[i] = arr[i] / 2;
            } else {
                answer[i] = arr[i];
            }
        }

        return answer;
    }

    public String solution20(String my_string, String alp) { //특정 문자 대문자로 바꾸기
        String answer = my_string.replace(alp, alp.toUpperCase());
        return answer;
    }

}


