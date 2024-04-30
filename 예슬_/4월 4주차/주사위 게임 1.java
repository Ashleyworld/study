class Solution {
    public int solution(int a, int b){
        int answer = 0;
        if(a%2==1 && b%2==1){
            answer = a * a + b * b;
        }
        else if (a % 2 == 1 || b % 2 == 1){
            answer = 2* (a + b);
        }
        else answer = Math.abs(a-b);
        return answer;
    }
}

/*
*
* Mat.abs(a-b) 는 두 정수 a 와 b 사이의 절대값을 반환하는 메서드
* */