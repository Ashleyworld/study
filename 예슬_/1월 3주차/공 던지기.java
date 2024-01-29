class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;

        int i = 0;
        while (k>0){ // 주어진 횟수 k 가 0보다 큰 동안 반복
            answer = numbers[i%numbers.length];
            /* 현재 인덱스 i 를 이용하여
            * numbers 배열에 공을 던질 사람의 번호를 찾습니다.
            * % 연산자를 사용하여 배열의 길이에 맞게 순환*/

            i += 2;
            // 공을 던진 후, 오른쪽으로 한명 건너뛰기 위해

            k--;
            // 던진 횟수를 감소시킴
        }
        return answer;
    }
}