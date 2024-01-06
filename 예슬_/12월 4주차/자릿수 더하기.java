


public class Solution {
    public int solution(int n) {
        int answer = 0;

        String s = Integer.toString(n); // int n 을 String으로 변환

        for(int i = 0; i < s.length(); i++){
            answer += Integer.parseInt(s.substring(i, i+1));
        }

        return answer;
    }
}

/*
* s를 int형을 문자형으로 떼어내고 substring으로 자른 후 int형으로 변환해 더하는 방식
* substring 말고도 chatAt으로 변환하여 for문으로 한 문자식 더하는 방법도 존재함.
* */