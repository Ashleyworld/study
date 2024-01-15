import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0; /* 요소의 개수를 파악하기위해 카운트*/
        int number = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor ==0){
                count++;
            }
        }
        if(count == 0){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[count];
/* count 길이만큼 가지는 answer 배열을 생성*/

        for(int i = 0; i <arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[number] = arr[i];
                number++;
                /*
                number++ 는 나누어 떨어지는 값을 answer배열에 저장할 때 사용
                * 나누어 떨어지는 값을 찾을 때 마다 number 값을 증가시킴
                * answer 배열의 다음 인덱스에 저장하게 됨
                * */
            }
        }

        Arrays.sort(answer);
        /* 배열을 오름차순으로 정렬*/
        return answer;
    }
}