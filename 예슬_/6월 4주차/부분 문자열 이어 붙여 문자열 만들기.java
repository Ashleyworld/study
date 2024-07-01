class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        // 문자열 배열과 parts 배열을 순회합니다.
        for (int i = 0; i < my_strings.length; i++) {
            // 현재 문자열을 가져옵니다.
            String str = my_strings[i];

            // 해당 문자열에서 parts[i]로 지정된 부분 문자열을 추출합니다.
            answer += str.substring(parts[i][0], parts[i][1] + 1);
        }

        return answer;
    }
}