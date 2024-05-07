class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        String[] number_list = number.split("");
        for(int i = 0; i < number_list.length; i++){
            sum+=Integer.parseInt(number_list[i]);
        }

        answer = sum%9;
        return answer;
    }
}

/*
* split 이용해서 한글자씩 쪼갠다 -> String[] number_list 에 저장
* 숫자의 각 자리수가 배열의 요소로 들어가게 됨
* for 루프 로 number_list 길이만큼 돌아감
* sum 에 한개씩 쪼개진 숫자 배열들이 더해진다.
*
* */