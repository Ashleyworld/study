class Solution {
    public int[] solution(int[] arr) {
        // 배열 길이가 1인 경우 -1로 반환하고 끝
        if (arr.length==1) {
            int[] answer_one = {-1};
            return answer_one;
        }

        // 가장 작은 수 하나를 뺴야하니까 총 배열 길이에서 -1 함
        int[] answer = new int[arr.length-1];

        int min = Integer.MAX_VALUE;
        // int의 최대값을 나타내는 상수
        // 인데, 왜 최대값을 나타내는 상수를 왜 min에 넣는건지?
        //  최소값은 제외하고!최대값을 채우는 배열을 만들어야 하니까.
        for (int i=0; i<arr.length; i++){
            min = Math.min(min, arr[i]); // 최소값 찾는 과정
        }

        int answer_num = 0;
        for (int j=0; j< arr.length; j++){
            if (arr[j]==min){   //최대값이 맞으면 컨티뉴
                continue;
            }
            else{
                answer[answer_num++] = arr[j];
            }
        }
        return answer;
    }
}