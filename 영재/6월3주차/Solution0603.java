import java.util.ArrayList;
import java.util.List;

public class Solution0603 {

    //배열의 원소 삭제하기
    public int[] solution01(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    list.remove(Integer.valueOf(arr[i]));
                }
            }
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    //소문자로 바꾸기
    public String solution02(String myString) {
        String answer = myString.toLowerCase();
        return answer;
    }

    //할 일 목록
    public String[] solution03(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();

        for(int i = 0; i < todo_list.length; i++) {
            if(!finished[i]){
                list.add(todo_list[i]);
            }

        }
        String[] answer = new String[list.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    //배열에서 문자열 대소문자 변환하기
    public String[] solution04(String[] strArr) {
        String[] answer = new String[strArr.length];

        for(int i = 0; i < strArr.length; i++){
            answer[i] = i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
        }
        return answer;
    }

    //공백으로 구분하기 1
    public String[] solution05(String my_string) {
        String[] answer = my_string.split(" ");
        return answer;
    }

    //길이에 따른 연산
    public int solution06(int[] num_list) {
        int answer = 0;

        if(num_list.length >= 11){
            for(int num : num_list){
                answer += num;
            }
        } else {
            answer++;
            for(int num : num_list){
                answer *= num;
            }
        }
        return answer;
    }

    //부분 문자열 이어 붙여 문자열 만들기
    public String solution07(String[] my_strings, int[][] parts) {
        String answer = "";

        for(int i=0; i<my_strings.length; i++){
            String str = my_strings[i];

            answer += str.substring(parts[i][0], parts[i][1]+1);
        }

        return answer;
    }
}
