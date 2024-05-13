import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution0502 {

    //특정 문자 제거하기
    public String solution01(String my_string, String letter) {
        String answer = "";


        return my_string.replace(letter,"");
    }

    //문자 반복 출력하기
    public String solution02(String my_string, int n) {
        String answer = "";

        for(int i = 0; i < my_string.length(); i++){
            for(int j = 0; j < n; j++){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    //배열 뒤집기
    public int[] solution03(int[] num_list) {
        int[] answer = new int[num_list.length];

        for(int i = num_list.length; i > 0; i--){
            answer[num_list.length - i] = num_list[i - 1];
        }
        return answer;
    }

    //배열 두배 만들기
    public int[] solution04(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){

            answer[i] = numbers[i] * 2;
        }

        return answer;
    }

    //인덱스 바꾸기
    public String solution05(String my_string, int num1, int num2) {
        String[] arr = my_string.split("");

        String temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;

        return String.join("", arr);
    }

    //짝수 홀수 개수
    public int[] solution06(int[] num_list) {
        int[] answer = new int[2];

        for(int num : num_list){
            if(num % 2 == 0){
                answer[0] += 1;
            } else {
                answer[1] += 1;
            }
        }
        return answer;
    }

    //배열 원소의 길이
    public int[] solution07(String[] strlist) {
        int[] answer = new int[strlist.length];

        for(int i = 0; i < strlist.length; i++){
           answer[i] = strlist[i].length();
        }
        return answer;
    }
}
