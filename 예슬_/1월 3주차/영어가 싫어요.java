class Solution {
    public long solution(String numbers) {
        long answer = 0;

        numbers = numbers.replace("zero","0");
        numbers = numbers.replace("one","1");
        numbers = numbers.replace("two","2");
        numbers = numbers.replace("three","3");
        numbers = numbers.replace("four","4");
        numbers = numbers.replace("five","5");
        numbers = numbers.replace("six","6");
        numbers = numbers.replace("seven","7");
        numbers = numbers.replace("eight","8");
        numbers = numbers.replace("nine","9");

        answer = Long.parseLong(numbers);

        return answer;

    }
}

/*
* replace 메소드를 사용하여 각 영어단어를 해당하는 숫자로 변환
*
* 변환된 문자열을 Long.parseLong 메소드를 사용해서 long 타입의 숫자로 변환
*
* */