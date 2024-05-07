class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        int a, b, temp;
        for(int i = 0; i<queries.length; i++){
            a = queries[i][0];
            b = queries[i][1];

            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        return arr;
    }
}

/*
*
* queries의 각 원소 [i, j]에 대해 arr[i]와 arr[j]의 값을 서로 바꿉니다.
queries의 길이만큼 반복하여 각 쿼리에 해당하는 인덱스의 원소를 서로 교환합니다.
예를 들어, [0, 3], [1, 2], [1, 4]의 순서대로 쿼리가 주어졌다면:

[0, 3]에 해당하는 쿼리는 arr[0]과 arr[3]의 값을 바꿉니다.
[1, 2]에 해당하는 쿼리는 arr[1]과 arr[2]의 값을 바꿉니다.
[1, 4]에 해당하는 쿼리는 arr[1]과 arr[4]의 값을 바꿉니다.
*
* */