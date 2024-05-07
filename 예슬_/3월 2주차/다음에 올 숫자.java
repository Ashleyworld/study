class Solution {
    public int solution(int[] common) {
        int answer = 0;

        if((common[1] - common[0]) == (common[2] - common[1]))
            // 등차수열일 경우
            answer = common[common.length-1] + (common[1] - common[0]);
        else // 등비수열일 경우
            answer = common[common.length-1] * (common[1] / common[0]);

        return answer;
    }
}

/*
* 등차수열
* 각 항들이 이전 항에 일정한 값을 더하여 얻어지는 수열
* a(n) = a1 + (n-1)*d
* a(n) <- 수열의 n번째 항, a1 = 첫번째항, d는 공차
*
*
* 등비수열
* 각 항들이 이전 항에 일정한 값을 곱하여 얻어지는 수열
* a(n) = a1 * r(n-1)
* a는 수열의 n번째 항, a1첫번째항, r는 공비
* 괄호에 있는건 다 작은 수들*
*
* */



