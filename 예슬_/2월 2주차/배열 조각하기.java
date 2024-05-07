import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        for(int i =0; i<query.length; i++) {
            if(i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            }else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }
}

/*
* 주어진 배열의 일부분을 복사하여 새로운 배열을 생성하는 메서드
*
*public static int[] copyOfRange(int[] original, int from, int to)
*
*
*
* */



