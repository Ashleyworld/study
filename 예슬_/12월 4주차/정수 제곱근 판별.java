class Solution {
    public long solution(long n) {
        long answer = 0;
        Double x = Math.sqrt(n);
        if(x == x.intValue()){
            answer = (long) Math.pow(x + 1, 2);

        }else {
            answer = -1;
        }
        return answer;
    }
}

/*
* Math.sqrt(); 제곱근을 찾는 메서드
* intValue(); double 값을 int 타입으로 변환
* Math.pow(x+1, 2); x의 제곱근이라면 x+1의 제곱을 리턴!
* */