class Solution {
    public int solution(String s) {
        int answer = 1;

        char x = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (count == 0) {
                // 만약 count가 0이라면,
                // 이전에 읽은 문자열의 분해가 끝났으므로
                // 새로운 문자열을 시작

                answer++;
                x = s.charAt(i);
                //  새로운 문자를 x에 할당합니다.
            }

            if (x == s.charAt(i)) {
                count++;
            } else {
                count--;
            }
        }


        return answer;
    }
}
// "aaabbaccccabba"의 경우:
//
//첫 글자는 'a'입니다. 'a'와 'a'가 아닌 다른 글자는 'b', 'c'입니다. 따라서 첫 번째 분해된 문자열은 "aaabbaccc"가 됩니다.
//남은 문자열은 "cccabba"입니다.
//다시 첫 글자는 'c'입니다. 'c'와 'c'가 아닌 글자는 'a', 'b'입니다. 따라서 두 번째 분해된 문자열은 "ccab"가 됩니다.
//남은 문자열은 "ba"입니다.
//다시 첫 글자는 'b'입니다. 'b'와 'b'가 아닌 글자는 없습니다. 따라서 세 번째 분해된 문자열은 "ba"가 됩니다.
//따라서 분해된 문자열의 개수는 3입니다.


// 주어진 문자열을 분해하여 문자열의 개수를 반환하는 Java 함수