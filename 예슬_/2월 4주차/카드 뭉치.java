class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0; // cards1 배열의 인덱스
        int idx2 = 0; // cards2 배열의 인덱스

        // goal 배열 순회
        for (String currentStr : goal) {
            // currentStr이 cards1[idx1] 또는 cards2[idx2]에 포함하는지 확인
            if (idx1 < cards1.length && currentStr.equals(cards1[idx1])) {
                idx1++; // cards1[idx1]에 포함하는 경우 idx1 증가
            } else if (idx2 < cards2.length && currentStr.equals(cards2[idx2])) {
                idx2++; // cards2[idx2]에 포함하는 경우 idx2 증가
            } else {
                return "No"; // 둘 다 포함하지 않는 경우
            }
        }

        return "Yes";
    }
}
/*

배열 cards1, cards2를 차례대로 확인하여 goal 배열의 요소와 정확하게 일치하는지 확인하는 문제다.
배열 cards1과 cards2에 해당하는 인덱스 idx1, idx2를 선언한다.
for-each 문을 통해 goal 배열을 순회하면서 goal의 요소를 currentStr에 담는다.
currentStr이 cards1[idx1] 또는 cards[idx2]에 존재하는지 확인하여 존재하는 경우 해당 idx를 증가시킨다.
위 조건을 만족시키지 못하는 경우 goal 배열과 완벽히 일치하게 만들 수 없으므로 "No"를 반환하고, 반복문을 무사히 마치면 "Yes"를 반환한다.
출처: https://ittrue.tistory.com/463 [IT is True:티스토리]


*/
