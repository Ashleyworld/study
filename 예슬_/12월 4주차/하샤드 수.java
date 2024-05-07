class Solution {
    public boolean solution(int x) {
        int num = x;
        int sum = 0;

        while(num != 0){
            sum += num % 10;
            num /= 10;

        }
        return x % sum == 0 ? true : false;
    }
}


/*
* sum 변수를 선언해서 각 자릿수의 합을 저장할 것이다.
*
* while 루프 이용해서 num 이 될때까지 반복하며, 각 자릿수를 추출하여 sum에 더함
* - num /= 10 : num 을 10 으로 나누어 다음 자릿수를 추출할 수 있도록 업데이트
* 이때 소수점 이하는 버려지고 정수부분만 남음.
* /= 는 나누기 후에 값을 왼쪽 변수에 할당하는 축약 연산자.
* num /= 10 은 num = num/ 10과 동일함.
*
*
* */
