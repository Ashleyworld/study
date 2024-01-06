
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;

        for(int i = 0; i<answer.length; i++){
            answer[i] = num;
            num += x;
        }
        return answer;
    }
}

/*
long[n] answer = new long[n]; 길이가 n인 long타입의 배열 answer를 선언


*
* */