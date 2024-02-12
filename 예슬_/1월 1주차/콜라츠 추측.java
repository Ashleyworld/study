class Solution {
    public int solution(long num) {
        int answer = 0;

        while(num != 1){

            if(num%2==0){
                num /= 2;
            }else{
                num = num*3+1;

            }answer++;

            if(answer >= 500){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}

/*
* 마지막 result 값이 안나와서 long 으로 바꾸는게 핵심...
*
*
* asnwer++; 의 의미?
* 1이 되기까지의 횟수를 answer로 계산함!
* */