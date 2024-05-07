import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = Arrays.toString(array);
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) =='7'){
                answer++;
            }
        }
        return answer;
    }
}
/*
* Arrays로 바꾸는 이유는?
* 배열을 문자열로 변환하기 위해서
* 문자열이 맞는지 확인하려면 charAt을 쓴다.
*
*
* */



