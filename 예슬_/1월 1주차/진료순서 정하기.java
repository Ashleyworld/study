class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < emergency.length; i++){

            // 배열 값 비교, 자신보다 응급도가 높은 값이 있으면
            // 순서 배열에 +1 해줌

            for(int j = 0; j <emergency.length; j++){
                if(emergency[i] < emergency[j]) {
                    answer[i]++;
                }
            }
            /* 순서 배열의 모든 값에 +1 해줌
            * (순서를 나타내야 하기 때문에 0이 아닌 1부터 하기 위함) */
            answer[i]++;
        }
        return answer;
        // 순서를 나타낸 배열 return
    }
}

