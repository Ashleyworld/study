import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        // 중복되는 숫자를 제거하고 남은 값을 저장할 동적 배열을 생성

        int value = -1;
        // 현재까지 처리한 숫자 중 마지막으로 처리한 숫자를 기억하기 위해
        // 변수 초기화

        for(int i = 0; i<arr.length; i++){
            if(arr[i] != value){
                list.add(arr[i]);
                value = arr[i];
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i<answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}