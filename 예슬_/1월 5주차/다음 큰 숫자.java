class Solution {
    public int solution(int n) {
        int answer = n;
        int originCnt = Integer.bitCount(n);

        while(true){
            int oneCnt = Integer.bitCount(++answer);

            if(oneCnt == originCnt){
                break;
            }
        }

        return answer;
    }
}
/*
 * bitCount()
 * 메소드는 주어진 정수의 true bit의 개수를 찾아 준다.
 * 이 메소드를 사용하니 정확성과 효율성 모두 통과됨
 *
 * */
