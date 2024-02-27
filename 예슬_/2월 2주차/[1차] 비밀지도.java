import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i=0; i<n; i++){

            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = String.format("%" + n + "s", answer[i]);
            answer[i] = answer[i].replace("1", "#");
            answer[i] = answer[i].replace("0", " ");

        }

        return answer;
    }
}
/*
*
* 1. 2진법과 OR 연산

2. 포맷팅하기 (00001이 나오려면 포맷팅을 해주어야함)
*
* */