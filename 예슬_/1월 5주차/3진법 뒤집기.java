class Solution {
    public int solution(int n) {
        String str = "";
        // 입력으로 주어진 10진수 정수 n을 3진법으로 변환하기 위해 3으로 나누어
        // 문자열 str에 추가

        while (n != 0) {
            str += n % 3;
            n /= 3;
        }

        return Integer.parseInt(str, 3);
        // str 문자열을 3진수로 해석하여 10진수로 변환한다.
    }
}

