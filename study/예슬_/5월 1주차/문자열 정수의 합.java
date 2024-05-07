class Solution{
    pulbic int solution(String num_str) {
        int answer = 0;

        for (int i = 0; i < num_str.length(); i++) {
            answer += Integer.parseInt(num_Str.substirng(i, i + 1));
        }
        return answer;
    }

}

//substring(i, i+3)을 사용하면 num_str에서 i번째 문자부터
// i+2번째 문자까지를 추출합니다.
// 예를 들어, i가 0일 때는 substring(0, 3)이 되어
// "123"을 반환하고, i가 1일 때는 substring(1, 4)가
// 되어 "234"를 반환합니다.
// 이런 식으로 인덱스가 증가할수록 추출되는 문자열의
// 길이도 증가합니다.