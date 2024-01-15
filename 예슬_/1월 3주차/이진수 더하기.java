class Solution {
    public String solution(String bin1, String bin2) {
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int result = num1 + num2;
        String answer = Integer.toBinaryString(result);

        return answer;
    }
}

/*
* Integer.parseInt(x, y)
* 진수로 표현된 문자열을 정수로 변환할 때 사용한다.
* x  변환하려는 문자열 String
* y  해당 문자열이 어떤 진법(진수)로 표현되어 있는지 나타냄
*
*
* */



