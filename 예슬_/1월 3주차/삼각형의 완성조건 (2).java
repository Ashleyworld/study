import java.util.Arrays;


class Solution {
    public int solution(int[] sides) {

        int answer = 0;
        Arrays.sort(sides);
        int min = sides[0];
        int max = sides[1];
        for(int i = max-min+1; i<= max; i++){
            // 가장 긴 변의 범위에 대해 반복
            //max 까지의 범위는 가장 짧은 변과 가장 긴변을 제외한 범위

            answer++;
        }
        for(int i = max+1; i<max+min; i++){
            answer++;
        }


        return answer;
    }
}