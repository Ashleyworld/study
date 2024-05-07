import java.util.Arrays;
class Solution {
    public String solution(String my_string) {

        //1.소문자로 바꾸는 메서드?
        my_string = my_string.toLowerCase();

        char[] chArr = my_string.toCharArray();
        Arrays.sort(chArr);

        String answer = new String(chArr);

        return answer;
    }
}

/* 포인트
*1.소문자로 바꾸는 메서드?
*2. 알파벳순으로 정렬해주는 메서드??
* - 일단 소문자로 변환된 문자열을 toCharArray() 메소드를 사용하여
* char배열인 chArr로 변환
*
* Array.sort(chArr); 를 사용하여 char배열을 오름차순으로 정렬
*
* String 클래스의 String(char[] value) 생성자를 사용하여 정렬된
* 문자 배열을 다시 문자열로 변환
*
* */