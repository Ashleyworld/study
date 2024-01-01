
class Solution {
    public String solution(int age) {
        String answer = "";
        String age962 = "abcdefghij";
        String[] ageArr = String.valueOf(age).split("");

        for(int i = 0; i<ageArr.length; i++){
            answer += age962.charAt(Integer.valueOf(ageArr[i]));
        }
        return answer;
    }
}
/*
* String[] ageArr = String.valueOf(age).split(""); 입력으로 받은
* age를 문자열로 변환한 후, 각 자릿수를 배열로 만듭니다.
* 예를 들어, age가 123이면 ageArr 은 ["1", "2", "3"]이 됩니다.
*
* for루프를 사용하여 ageArr 에 있는 각 자릿수를 해당하는 age962
* 문자열의 인덱스에 매핑하여 answer에 추가합니다.
* ageArr의 각 요소를 가져와 Integer.valueOf()를 사용하여 정수로 변환
*
* charAt() 메서드
* */