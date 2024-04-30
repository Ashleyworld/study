import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution0404 {

    //주사위 게임1
    public int solution01(int a, int b) {
        int answer = 0;

        if (a % 2 != 0 && b % 2 != 0) {
            answer = (a * a) + (b * b);
        } else if (a % 2 == 0 && b % 2 == 0) {
            answer = Math.abs(a - b);
        } else {
            answer = 2 * (a + b);
        }

        return answer;
    }

    //꼬리 문자열
    public String solution02(String[] str_list, String ex) {
        String answer = "";

        for(int i = 0; i < str_list.length; i++){
            if(!str_list[i].contains(ex)){
                answer += str_list[i];
            }
        }
        return answer;
    }

    //정수 찾기
    public int solution03(int[] num_list, int n) {
        int answer = 0;

        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] == n){
                return 1;
            }
        }
        return answer;
    }

    //부분 문자열인지 확인하기
    public int solution04(String my_string, String target) {
        int answer = 0;

        if(my_string.contains(target)){
            return 1;
        }
        return answer;
    }

    //부분 문자열
    public int solution05(String str1, String str2) {
        int answer = 0;
        if(str2.contains(str1)){
            return 1;
        }
        return answer;
    }

    //0떼기
    public String solution06(String n_str) {
        String answer = "";
        int num = Integer.parseInt(n_str);
        return Integer.toString(num);
    }

    //ad 제거하기
    public List<String> solution07(String[] strArr) {

        List<String> list = new ArrayList<>();

        for(String str : strArr){
            if(!str.contains("ad")){
                list.add(str);
            }
        }

        return list;
    }

}
