class Solution {
    public int solution(int[] number) {
        int answer = 0;

        for(int i = 0; i < number.length; i++) {
            for(int j = i + 1; j < number.length; j++) {
                for(int k = j + 1; k < number.length; k++) {
                    if(number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}

/*
* bitCount()
* 메소드는 주어진 정수의 true bit의 개수를 찾아 준다.
* 이 메소드를 사용하니 정확성과 효율성 모두 통과됨
*
* */


