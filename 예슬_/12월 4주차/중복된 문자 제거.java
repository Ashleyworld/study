class Solution {
    public String solution(String my_string) {
        String answer = "";

        for(int i = 0; i<my_string.length(); i++){
            if(my_string.indexOf(my_string.charAt(i)) == i){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}




/*
* indexOf() 메소드는 특정 문자열의 위치를 찾고자 할때 사용
* 주어진 문자열이 시작되는 인덱스 값을 리턴
*
* my_string.charAt(i) 인덱스 값이 i와 일치한다면, 그 문자는
* 앞에 있는 문자들과 중복되지 않았음을 의미하므로
* answer 에 추가해준다.
* */