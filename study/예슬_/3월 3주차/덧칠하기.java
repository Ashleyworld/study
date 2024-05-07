
import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        // 시작점과 끝점을 초기 설정합니다.

        int start = section[0];
        int end = section[0] + (m-1);
        // 페인트칠 횟수를 저장할 변수를 초기화합니다.

        int ans = 1;

        // 모든 구역을 순회합니다.
        for(int i : section){
            // 현재 구역이 시작점부터 끝점까지의 범위 안에 있다면 다음 구역으로 넘어감
            if(i>=start && i<=end)
                continue;
            else{
                // 그렇지 않다면, 새롭게 페인트칠해야 하는 구역이 시작되는 것이
                start = i;
                end = i + (m-1);
                ans++;
            }
        }
        // 최소 페인트칠 횟수를 반환합니다.
        return ans;
    }
}

https://velog.io/@iamjinseo/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EB%A0%88%EB%B2%A81%EB%8D%A7%EC%B9%A0%ED%95%98%EA%B8%B0-Java