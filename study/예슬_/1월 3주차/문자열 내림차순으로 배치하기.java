

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String[] arr = s.split(""); // 문자열 하나씩 자름

        StringBuilder sb = new StringBuilder();

        Arrays.sort(arr);
        // 배열 arr을 오름차순으로 정렬
        // 가장 작은 문자부터 큰 문자순서로 배열
// ["Z", "b", "c", "d", "e", "f", "g"] 로 배열됨

        // 대문자가 더 큰숫자, 소문자가 작은 숫자!!!

        for(int i=arr.length-1; i>= 0; i--){
            sb.append(arr[i]);
            // 정렬된 배열을 역순으로 순회하면서 StringBuilder에
            //문자를 추가한다.
            // 큰 문자부터 작은 문자순서로 추가됨

        }

        String answer = sb.toString();


        return answer;
    }
}

/*
*
* length() 와 length의 차이
* length는 배열(Array)의 크기이며
* length()는 사용되는 문자열의 길이를 나타낸다.
*
*
*
*
*
*
* */