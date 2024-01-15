/*
* 2차원 배열로 변경합니다 라는 것부터 막힘
* */

import java.util.Arrays;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n]; /*배열길의*/
        int count=0;
        for(int i = 0; i <answer.length; i++){
            for(int j = 0; j < answer[i].length; j++, count++){
                answer[i][j] = num_list[count];
                /* 여기부분 이해가 잘 안됨*/
            }
        }
        return answer;
    }
}