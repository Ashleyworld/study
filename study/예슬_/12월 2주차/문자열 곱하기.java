class Solution {
    public String solution(String my_string, int k) {
        String answer = "";

        for(int i = 0; i < k; i++){
            answer += my_string;
        }
        return answer;
    }

/*
* int n 있어서 String str = ""; 새로 선언하고
* answer 에 n + str 해서 answer를 반환하였다.
*
*
* */