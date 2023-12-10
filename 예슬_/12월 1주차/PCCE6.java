public class PCCE6 {
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i]-1]) {
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}

/*
 * 6번 어려웠음!!!
 * 인터넷에서 푼 사람 풀이를 보니...
 * score_list[numbers[i]-1 이다.
 * i가 1일 때, our_score[1] 은 = 100, [numbers[1-1] -> 0 -> score_list[0] = 100 그래서 Same 출력
 * i가 3일 때, our_score[3] 은 = 85, [numbers[3-1] -> 2 -> socre_list[2] = 38 그래서 Different 출력
 * i가 4일 때, our_score[4] 는 = 93, [numbers[4-1] -> 3 - >socre_list[3] = 93 그래서 Same 출력!
 *
 *  */