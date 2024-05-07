import java.util.Scanner;

public class Solution0403 {

    //마지막 두 원소
    public int[] solution01(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int last = 0;
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            last = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            last = num_list[num_list.length - 1] * 2;
        }

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        answer[answer.length - 1] = last;
        return answer;
    }

    //이어 붙인 수
    public int solution02(int[] num_list) {
        int answer = 0;
        String evenStr = "";
        String oddStr = "";

        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                evenStr += num_list[i];
            } else {
                oddStr += num_list[i];
            }
        }

        return Integer.parseInt(evenStr) + Integer.parseInt(oddStr);
    }

    //원소들의 곱과 합
    public int solution03(int[] num_list) {
        int answer = 0;
        int multi = 1;
        int pow = 0;

        for(int i = 0; i < num_list.length; i++){
            multi *= num_list[i];
            pow += num_list[i];
        }

        pow *= pow;

        return multi < pow ? 1 : answer;
    }

    //flag에 따라 다른 값 반환
    public int solution04(int a, int b, boolean flag) {
        int answer = 0;


        return flag ? a + b : a - b;
    }

    //두 수의 연산값 비교하기
    public int solution05(int a, int b) {
        int answer = 0;
        int result1 = Integer.parseInt("" + a + b);
        int result2 = 2 * a * b;

        return Math.max(result1, result2);
    }

    //특별한 이차원 배열2
    public int solution06(int[][] arr) {
        int answer = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] != arr[j][i]){
                    return 0;
                }
            }
        }
        return 1;
    }

    //l로 만들기
    public String solution07(String myString) {
        String answer = "";

        for(int i = 0; i < myString.length(); i++){
            char c = myString.charAt(i);

            if(c < 'l'){
                answer += "l";
            } else {
                answer += c;
            }
        }
        return answer;
    }

    //직각삼각형 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
