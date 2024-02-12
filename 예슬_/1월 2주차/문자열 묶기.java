import java.util.Arrays;

class Solution {
    public int solution(String[] strArr) {
        int[] count = new int [100000];

        for(int i = 0; i<strArr.length; i++){
            count[strArr[i].length()]++;
            // 문자열 길이별로 개수 세기
            // strArr 배열을 순회하면서 각 문자열의 길이에 해당하는
            // count배열의 값을 1씩 증가시킨다.
            // 즉 길이별로 몇개의 문자열이 있는지 세고있다.
        }
        return Arrays.stream(count).max().getAsInt();
    }
}
//getAsInt()를 이용해서 최대값을 정수형으로 반환