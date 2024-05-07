import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
        // 결과를 담을 배열 선언
        int[] answer = new int[score.length];

        // 순위를 담을 List 선언
        List<Integer> rank = new ArrayList<>();

        // score를 반복
        for (int i = 0; i < score.length; i++) {
            // score 추가
            rank.add(score[i]);

            // rank 리스트의 크기가 k보다 크면 가장 낮은 점수 제거
            if (rank.size() > k) {
                rank.remove(Collections.min(rank));
            }

            // 남은 점수 중 가장 작은 점수 answer에 담기
            answer[i] = Collections.min(rank);
        }
        return answer;
    }
}
/*
* score 배열에서 가장 작은 k개의 점수를 반환하는 문제다.
List와 Collections를 활용하여 문제를 쉽게 풀 수 있다.
반복문을 통해 score[i]를 rank 리스트에 추가(add)한 뒤  rank 리스트의 사이즈가 k보다 큰지 검사한다.
rank의 사이즈가 k보다 클 경우 rank에 존재하는 점수 중 가장 작은 점수를 제거(remove)한다.
rank 리스트에 남은 점수들 중 가장 작은 점수를 answer 배열에 담는다.
출처: https://ittrue.tistory.com/461 [IT is True:티스토리]
*
* */