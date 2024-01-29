class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();

        if(length % 2 == 0){
            answer = s.substring(length/2-1, length/2+1);
        }
        else{
            answer = s.substring(length/2, length/2+1);
        }
        return answer;
    }
}

/*
* String substring(int beginIndex)
* beginIndex 이후의 문자열을 반환합닏.
*
* String substring(int beginIndex, int endIndex)
*
*String str = "Hello, World!";

// 인덱스 7 이후의 문자열 반환
String result1 = str.substring(7);  // "World!"

// 인덱스 0 이상 5 미만까지의 부분 문자열 반환
String result2 = str.substring(0, 5);  // "Hello"
*
* */




