import java.util.*;

class Solution {
    public int solution(String s) {
        // 스플릿 이용해서 변경!
        String[] list = s.split(" ");
        int answer = 0;
        for(int i = 0; i < list.length; i++){
            if(list[i].equals("Z")){
                answer -= Integer.parseInt(list[i-1]);
                /*
                * Z 가 나오면 바로 이전에 나온 숫자는 뺀다
                * */
            }else {
                answer += Integer.parseInt(list[i]);
            }
        }
        return answer;
    }
}