class Solution {
    public int solution(int[][] lines) {
        int answer = 0;

        //  선분의 겹침을 카운트할 배열 생성
        int[] count = new int[201];

        // 각 선분에 대해 시작점과 끝점을 이용하여 겹치는 부분 판단
        for(int[] i : lines){
            int start = i[0]+100; //시작점
            int end = i[1]+100; //끝점

            for(int k = start; k < end; k++){
                count[k] += 1;
            }
        }

        // 겹치는 부분이 2 이상인 경우, 해당 부분의 길이를 answer 에 더함
        for(int i : count){
            if(i>1) answer++;
        }

        return answer;
        // 두 개 이상의 선분이 겹치는 부분의 길이 반환
    }
}