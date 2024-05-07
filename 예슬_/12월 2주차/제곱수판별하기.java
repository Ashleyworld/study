class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=1000; i++){
            if(i*i == n){
                answer = 1;
                break;
            }else {
                answer = 2;
            }
        }
        return answer;
    }
}

/*
* n의 범위가 1 ~ 1,000,000 라서 i는 1000으로 뒀다.
*  i*i가 일치하다면(=제곱수라면) answer를 1로 저장하고 break로 반복문을 종료한다.
*
* */