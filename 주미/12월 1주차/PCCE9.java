public class PCCE9 {

    public int solution(String[][] board, int h, int w) {
        int answer = 0;

        int n = board.length;

        int[][] dboard = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};


        for (int[] b : dboard) {

            int hc = h + b[0];
            int wc = w + b[1];

            if (hc < 0 || hc >= n || wc < 0 || wc >=n ) continue;
            if (board[h][w].equals(board[hc][wc])) answer++;
        }



        return answer;
    }
}
