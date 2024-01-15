import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        int targetLength = 1;

        while(targetLength < n){
            targetLength *= 2;
        }

        int[] answer = new int[targetLength];
        Arrays.fill(answer, 0);

        // Arrays.fill() 을 사용하여 배열을 0으로 채웁니다
        System.arraycopy(arr, 0, answer, 0, n);

        // arr 배열의 내용을 answer 배열로 복사한다.
        // arr 배열의 값은 그대로 유지되고 남은 공간은 0으로 채워진 배열 만들 수 있음

        return answer;
    }
}/*
public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
src: 복사할 원본 배열입니다.
srcPos: 원본 배열에서 복사를 시작할 위치입니다.
dest: 복사된 데이터를 저장할 대상 배열입니다.
destPos: 대상 배열에서 데이터를 저장할 위치입니다.
length: 복사할 요소의 개수입니다.



영재꺼 코드

    //배열의 길이를 2의 거듭제곱으로 만들기
    public int[] solution20(int[] arr) {
        int pow = 0;
        while(arr.length > Math.pow(2, pow)){
            pow++;
        }

        int[] answer = new int[(int) Math.pow(2, pow)];

        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }

}
*/