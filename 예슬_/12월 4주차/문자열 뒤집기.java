class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb_mid = new StringBuilder(my_string.substring(s, e+1));
        // 주어진 부분 문자열을 StringBuilder로 변환
        sb_mid.reverse();
    // 부분 문자열을 뒤집음

        return my_string.substring(0,s) + sb_mid+ my_string.substring(e+1, my_string.length());
    }   // 문자열의 앞부분(0~s 이전까지 ) + 뒤집은부분 문자열 + 문자열의 뒷부분(e 이후부터 끝까지)
}

/*
* s~e까지 부분 문자열을 뒤집은 후, 원래 문자열의 해당 부분을 뒤집은 문자열로 대체하여 반환함
*
* 해당 코드에서 사용된 StringBuilder 는 가변적인 문자열을 다룸,
* 문자열의 길이가 길어지거나 문자열을 빈번하게 수정할 때 stringBuilder를 사용하면 성능 상의 이점
*
*
* */