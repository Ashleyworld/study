public class PCCE6 {
    public static void main(String[] args) {

        int[] numbers = {3,4};
        int[] our_score = {85,93};
        int[] score_list = {85,92,38,93,48,85,92,56};
        String[] answer = solution(numbers, our_score, score_list);

        for (int i = 0; i <answer.length; i++){
            System.out.println(answer[i]);
        }
    }

    public static String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i] - 1]) {
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}
