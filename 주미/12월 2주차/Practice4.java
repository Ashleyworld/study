import java.util.Scanner;

public class Practice4 {

    // 홀짝 구분하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.print(n+" is even");
        }else{
            System.out.print(n+" is odd");
        }


    }

    //정수 부분
    public int solution17(double flo) {
        int answer = 0;
        answer=(int)Math.floor(flo);
        return answer;
    }

    //홀짝에 따라 다른 값 반환하기
    public int solution18(int n) {
        int answer = 0;

        if(n%2 == 1){
            for(int i=1;i<=n;i+=2){
                answer += i;
            }
        }
        else{
            for(int i=2;i<=n;i+=2){
                answer += i*i;
            }
        }
        return answer;
    }

    // 조건에 맞게 수열 변환하기1

    public int[] solution19(int[] arr) {
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

    // 특정한 문자를 대문자로 바꾸기
    public String solution20(String my_string, String alp) {
        String answer = my_string.replace(alp, alp.toUpperCase());
        return answer;
    }

}
