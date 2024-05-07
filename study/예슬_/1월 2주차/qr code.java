/*
*
* StringBuilder
* 문자열을 효율적으로 처리하기 위한 클래스
*
* 사용예시
* StringBuilder sb = new StringBuilder();
sb.append("Hello").append(" ").append("World");
String result = sb.toString(); // "Hello World"
* */

class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i<code.length; i++){
            if(i % q ==r){
                answer.append(code.charAt(i));
            }
        }
        return answer;
    }
}
/*
* 문자열의 길이를 나타내는 속성은 메소드이기 때문에 length()
* */