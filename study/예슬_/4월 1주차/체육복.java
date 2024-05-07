// 최대한 많은 학생이 체육수업을 들을 수 있는 경우를 찾는 것
import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌 체육복을 가져온 학생이 도난당한 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    //초기에 체육복을 가진 학생들의 수를 answer 변수에 저장
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        // 도난당한 학생에게 체육복 빌려주는 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){
                    answer++;
                    reserve[j] = -1;
                    break;
                    // lost 배열과 reserve 배열을 순회하며
                    // 체육복을 빌려줄 수 있는 조건을 만족하는 경우
                    // 해당 학생의 번호를 -1로 변경하여 체육복을 빌려준 상태로 처리
                }
            }
        }
        return answer;
        // 최종적으로 answer 변수에는 체육수업을 들을 수 있는 학생의 최대 수가 저장되어 반환
    }
}