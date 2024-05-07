class Solution {
    public int solution(int n) {
        int answer = 0;

        // 1부터 n까지 자연수 중 합성수의 개수를 찾기위한 반복문
        for(int i = 1; i<= n; i++){
            int count = 0; // 약수의 개수 count, 각 수마다 count 초기화
            for(int j = 1; j <= i; j++){
                // 약수의 개수를 세는 작업을 수행
                count += (i % j == 0) ? 1 : 0;
                // 나누어 떨어지면 약수이기 때문에 약수야? count+1
            }
            answer += (count >= 3) ? 1 : 0;
        }
        return answer;
    }
}

/*
* 약수가 3개 이상인 수를 합성수
*
* */