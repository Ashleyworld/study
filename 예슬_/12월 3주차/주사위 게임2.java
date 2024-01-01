class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;

        if(a != b && a != c && b != c){
            answer =  (a + b + c);
        }else if(a == b && b == c){
            answer = (a + b + c) * (a*a + b*b + c*c ) * (a*a*a + b*b*b + c*c*c);
        }else {
            answer =  (a + b + c) * (a*a + b*b + c*c );
        }

        return answer;

    }
}


/*
* int answer는 a의 길이, 입력된 예씨는 abcde 그래서 answer = 5
*    i는 5만큼 돌아가고
*   println 한다. a를 5개
* */