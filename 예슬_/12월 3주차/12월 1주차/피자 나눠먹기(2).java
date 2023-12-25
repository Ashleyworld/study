
class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=6*n; i++){

            if( 6*i%n == 0){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
/*
* break 문은 if 조건문에 해당하는 조건을 찾으면 바로 종료시키기 위해서 존재
*
* */