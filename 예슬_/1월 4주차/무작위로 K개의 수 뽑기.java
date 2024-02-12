import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        List<Integer> list = new ArrayList<>();

        // 중복을 제거한 배열 kArr 을 만들기위해 stream 사용
        // 인트 배열 만듬
        int[] kArr = Arrays.stream(arr).distinct().toArray();
        int len = kArr.length;  // 배열의 길이 선언
        for(int i = 0; i<answer.length; i++){
            if(len != 0){ // 0 이 아니면 answer[i]에 넣어준다.
                len --;
                answer[i] = kArr[i];
            }else {
                answer[i] = -1;
            }
        }
        return answer;

    }
}