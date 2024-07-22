import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution0703 {

    //첫 번째로 나오는 음수
    public int solution01(int[] num_list) {
        int answer = -1;

        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] < 0){
                answer = i;
                break;
            }
        }
        return answer;
    }

    //카운트 다운
    public int[] solution02(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];
        int idx = 0;

        for(int i = start_num; i >= end_num; i--){
            if(idx != answer.length){
                answer[idx] = i;
                idx++;
            }
        }
        return answer;
    }

    //접두사인지 확인하기
    public int solution03(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }

    //접미사인지 확인하기
    public int solution04(String my_string, String is_suffix) {
        int answer = 0;

        return my_string.endsWith(is_suffix) ? 1 : 0;
    }

    //문자열의 뒤의 n글자
    public String solution05(String my_string, int n) {
        String answer = "";
        return my_string.substring(my_string.length()-n);
    }

    //글자 이어 붙여 문자열 만들기
    public String solution06(String my_string, int[] index_list) {
        String answer = "";

        for(int i=0; i<index_list.length; i++){
            answer += my_string.charAt(index_list[i]);
        }

        return answer;
    }

    //콜라츠 수열 만들기
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            list.add(n);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
