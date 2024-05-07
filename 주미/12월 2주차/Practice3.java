import java.util.Scanner;

public class Practice3 {


    //문자열 붙여서 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(a+b);
    }

    //문자열의 앞의 n글자
    public String solution12(String my_string, int n) {
        String answer = "";

        answer = my_string.substring(0,n);
        return answer;
    }

    //문자열 곱하기

    public String solution13(String my_string, int k) {
        String answer = "";

        answer = my_string.repeat(k);



        return answer;
    }

    // n의 배수

    public int solution14(int num, int n) {
        int answer = 0;

        if(num % n == 0){
            answer = 1;

        }else{answer = 0;}

        return answer;
    }

    //더 크게 합치기
    public int solution15(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);

        if (Integer.parseInt(ab) >= Integer.parseInt(ba)) {
            return Integer.parseInt(ab);
        } else {
            return Integer.parseInt(ba);
        }

    }

}
