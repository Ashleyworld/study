class Solution {
    public String solution(String phone_number) {
        String answer = "";

        for(int i = 0; i < phone_number.length(); i++){

            // if 문을 이용하여 i 가 phone_number의 길이에서 -4 를
            // 뺀 수보다 작을때까지 answer 변수에 *를 넣어준다.


            if(i < phone_number.length() - 4){
                answer += "*";
            }else{
                answer += phone_number.charAt(i);
                // 위 조건이 아니라면 .charAt() 메소드를 통해 문자를 하나씩 순서대로 넣음
            }
        }
        return answer;
    }
}

