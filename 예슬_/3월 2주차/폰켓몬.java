import java.util.*;


class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> type = new HashSet<>();

        for(int i = 0; i < nums.length; i++)
            type.add(nums[i]);
        // for 루프를 통해 주어진 배열을 순회하면서 각 포켓몬의 종류 번호를
        //type 에 추가합니다. 이를 통해 중복을 제거하고,
        //어떤 종류의 포켓몬이 있는지 확인

        if(type.size() >= nums.length/2)
            answer = nums.length/2;
        // type의 크기가 포켓몬의 전체 개수인 nums.length의 절반이상이라면
        // 선택할 수 있는 포켓몬의 종류가 전체의 절반이상이라면

        else
            answer = type.size();

        return answer;
    }
}