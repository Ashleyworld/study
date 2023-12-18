class Solution {
    public int solution(double flo) {
        int answer = 0;
        answer = (int)flo;
        return answer;
    }
}

/*
* 실수를 정수로 바꾸어야 하므로 강제 형변환을 한다
* 강제 형 변환을 할 때에는 더 작은 범위를 나타내는 데이터형으로 변환해야 하므로 long이
* 아닌 int나 short, byte로 변경해주어야 한다.
*
* */