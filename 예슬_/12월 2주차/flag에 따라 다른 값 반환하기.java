class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag == true){
            answer = a+b;
        }else{
            answer = a-b;
        }
        return answer;
    }

/*
* int n 있어서 String str = ""; 새로 선언하고
* answer 에 n + str 해서 answer를 반환하였다.
*
*
* */