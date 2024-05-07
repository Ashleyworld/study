class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for (String s : str){
            if (!s.equals("")){
                answer += Integer.parseInt(s);
            }
        }

        return answer;
    }
}
/*
* replaceAll 을 사용하여 영문 알파벳을 먼저 찾고
* 해당 알파벳들을 공백으로 치환한다.
*
* split를 이용하여 숫자 기준으로 문자열을 분리하여 str 배열에 저장
*
*
* */