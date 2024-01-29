class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (int i =0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
// 주어진 문자열에서 한문자씩 가져옴


            if (c >= 'A' && c <= 'Z'){
                answer[c -'A']++;
                /*대문자인 경우, 해당 문자가 대문자 A-Z까지 사이에
                * 있으면 배열의 인덱스 c-A위치에 해당 알파벳의
                * 개수를 증가시킴*/


            } else if (c >= 'a' && c <= 'z'){
                answer[26 + c - 'a']++;
                // 해당 문자가 소문자 a부터 z까지 사이에 있으면
                /* 배열의 인덱스 26 + c - a 위치에 해당 알파벳의
                * 개수를 증가시킨다.*/

            }
        }
        return answer;
    }
}

/* 문제 :  0부터 시작해서 A-Z, 0부터 시작해서 a-z 나열됨
* 	"Programmers"
기댓값 〉
* [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
*  0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
*  1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2,
*  0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0]
*
* */