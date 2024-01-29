class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};

        for(int i = 0; i < keyinput.length; i++) {
            if(keyinput[i].equals("left")) {
                answer[0]--;
                if(answer[0] < -(int)(board[0] / 2))
                    // 맵의 가로 크기의 반을 계산
                    // 맵의 가로 중심을 기준으로 왼쪽 끝의 좌표를 구함
                    /* 이 부분은 캐릭터의 x 좌표가 왼쪽 끝을 벗어난 경우를
                    * 체크한다. 만약 그렇다면 answer[0] 를 왼쪽 끝
                    * 좌표로 설정해줍니다. 이렇게 함으로써 캐릭터가 맵의
                    * 좌측을 벗어나지 않도록 보정하는 역할*/


                    answer[0] = -(int)(board[0] / 2);
            } else if (keyinput[i].equals("right")) {
                answer[0]++;
                if(answer[0] > (int)(board[0] / 2))
                    answer[0] = (int)(board[0] / 2);
            } else if (keyinput[i].equals("up")) {
                answer[1]++;
                if(answer[1] > (int)(board[1] / 2))
                    answer[1] = (int)(board[1] / 2);
            } else {
                answer[1]--;
                if(answer[1] < -(int)(board[1] / 2))
                    answer[1] = -(int)(board[1] / 2);
            }
        }

        return answer;
    }
}