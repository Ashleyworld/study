import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int minDiff = Integer.MAX_VALUE;
        // n과의 최소 차이를 저장하기 위한 변수

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            int diff = Math.abs(n - array[i]);
            // 현재 값과 n과의 차이 계산
            if (diff < minDiff) {
                minDiff = diff;
                answer = array[i];
                // 현재 값이 더 작은 차이를 가지면 answer를 업데이트
            } else if (diff == minDiff) {
                answer = Math.min(answer, array[i]);
                // 동일한 차이를 가지면 작은 수를 선택
            }
        }

        return answer;
    }
}