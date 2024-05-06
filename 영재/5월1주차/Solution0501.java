import java.util.Arrays;
import java.util.Collections;

public class Solution0501 {

    //배열 자르기
    public int[] solution01(int[] numbers, int num1, int num2) {
        int[] answer = Arrays.copyOfRange(numbers, num1 , num2 + 1);
        return answer;
    }

    //문자열 정수의 합
    public int solution02(String num_str) {
        int answer = 0;

        String[] arr = num_str.split("");

        for(String str : arr){
            answer += Integer.parseInt(str);
        }

        return answer;
    }

    //점의 위치 구하기
    public int solution03(int[] dot) {
        int answer = 0;

        if(dot[0] > 0 && dot[1] > 0){
            answer = 1;
        } else if(dot[0] < 0 && dot[1] > 0){
            answer = 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        } else if (dot[0] > 0 && dot[1] < 0) {
            answer = 4;
        }
        return answer;
    }

    //조건에 맞게 수열 변환하기 3
    public int[] solution04(int[] arr, int k) {
        int[] answer = new int[arr.length];

        if(k % 2 == 0){
            for(int i = 0; i < arr.length; i++){
                answer[i] = arr[i] + k;
            }
        } else {
            for(int i = 0; i < arr.length; i++){
                answer[i] = arr[i] * k;
            }
        }
        return answer;
    }

    //x사이의 개수
    public int[] solution05(String myString) {
        String[] parts = myString.split("x", -1);
        int[] answer = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            answer[i] = parts[i].length();
        }

        return answer;
    }

    //뒤에서 5등 위로
    public int[] solution06(int[] num_list) {
        Arrays.sort(num_list);

        int[] answer = Arrays.copyOfRange(num_list, 5, num_list.length);

        return answer;
    }

    //최댓값 만들기1
    public int solution(int[] numbers) {

        Arrays.sort(numbers);

        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
