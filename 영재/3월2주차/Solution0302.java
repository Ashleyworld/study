import java.util.*;

public class Solution0302 {

    //덧칠하기
    public int solution01(int n, int m, int[] section) {
        int answer = 0;
        int start = section[0];
        answer++;
        for (int item : section) {
            if (start + m > item) {
                continue;
            }
            start = item;
            answer++;
        }
        return answer;
    }

    //분수의 덧셈
    public int[] solution02(int numer1, int denom1, int numer2, int denom2) {

        int nummer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        for (int i = nummer - 1; i > 1; i--) {
            // 기약분수로 만들기
            if (nummer % i == 0 && denom % i == 0) {
                nummer /= i;
                denom /= i;
            }
        }

        int[] answer = {nummer, denom};
        return answer;
    }

    //실패율(https://ittrue.tistory.com/469)
    public int[] solution03(int N, int[] stages) {
        // 스테이지별 도달했으나 클리어하지 못한 사람 수
        int[] currentStages = new int[N + 1];
        // 스테이지별 도달한 사람 수
        int[] clearStages = new int[N + 1];

        for (int i = 0; i < stages.length; i++) {
            // 스테이지에 도달한 플레이어 수 증가
            for (int j = 0; j < stages[i]; j++) {
                clearStages[j] += 1;
            }
            // 도달 했으나 클리어하지 못한 플레이어 수 증가
            currentStages[stages[i] - 1] += 1;
        }

        // 스테이지 번호와 실패율을 저장할 map
        Map<Integer, Double> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            // 스테이지에 도달한 사람이 없거나 클리어한 사람이 없는 경우
            if (currentStages[i] == 0 || clearStages[i] == 0) {
                map.put(i + 1, 0.0);
            } else {
                // 실패율 계산하여 맵에 저장
                map.put(i + 1, (double) currentStages[i] / (double) clearStages[i]);
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        // 실패율을 기준으로 내림차순 정렬
        list.sort((o1, o2) -> Double.compare(map.get(o2), map.get(o1)));

        // 리스트를 배열로 변환하여 반환
        return list.stream().mapToInt(i -> i).toArray();
    }

    //안전 지대
    public int solution04(int[][] board) {
        ArrayList<int[]> list = new ArrayList<>();
        int answer = 0;
        int[] dx = {0, 1, -1, 0, -1, 1, 1, -1};
        int[] dy = {1, 0, 0, -1, -1, 1, -1, 1};

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    int[] temp = {i, j};
                    list.add(temp);
                }
            }
        }

        for (int a = 0; a < list.size(); a++) {
            int i = list.get(a)[0];
            int j = list.get(a)[1];
            for (int k = 0; k < 8; k++) {
                if (dx[k] + i >= 0 && dy[k] + j >= 0 && dx[k] + i <= board.length - 1 && dy[k] + j <= board.length - 1)
                    board[dx[k] + i][dy[k] + j] = 1;
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 0) answer += 1;
            }
        }
        return answer;
    }

    //주사위 게임3
    public int solutio05n(int a, int b, int c, int d) {

        if (a == b && b == c && c == d) { // abcd 모두 같다면
            return 1111 * a;
        } else if (a == b && b == c) {
            return ((10 * a + d) * (10 * a + d));
        } else if (a == c && c == d) {
            return ((10 * a + b) * (10 * a + b));
        } else if (a == b && b == d) {
            return ((10 * a + c) * (10 * a + c));
        } else if (b == c && c == d) {
            return ((10 * b + a) * (10 * b + a));
        } else if (a == b && c == d) {
            return ((a + c) * (Math.abs(a - c)));
        } else if (a == c && b == d) {
            return ((a + b) * (Math.abs(a - b)));
        } else if (a == d && b == c) {
            return ((a + b) * (Math.abs(a - b)));
        } else if (a == b && c != d) {
            return (c * d);
        } else if (a == c && b != d) {
            return (b * d);
        } else if (a == d && b != c) {
            return (b * c);
        } else if (b == c && a != d) {
            return (a * d);
        } else if (b == d && a != c) {
            return (a * c);
        } else if (c == d && a != b) {
            return (a * b);
        } else {
            return Math.min(Math.min(a, b), Math.min(c, d));
        }
    }

    //옹알이 2
    public int solution06(String[] babbling) {
        int ans = 0;

        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("ayaaya", "1");
            babbling[i] = babbling[i].replace("yeye", "1");
            babbling[i] = babbling[i].replace("woowoo", "1");
            babbling[i] = babbling[i].replace("mama", "1");


            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");

            babbling[i] = babbling[i].replace(" ", "");


            if (babbling[i].length() == 0) {
                ans++;
            }
        }

        return ans;
    }

    //다트게임
    public int solution07(String dartResult) {
        int answer = 0;
        int[] dart = new int[3];

        int n = 0, idx = 0;
        String numstr = "";

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            //숫자일 때
            if (c >= '0' && c <= '9') {
                numstr += String.valueOf(c);

            }
            //보너스일 때
            else if (c == 'S' || c == 'D' || c == 'T') {
                n = Integer.parseInt(numstr);
                if (c == 'S') {
                    dart[idx++] = (int) Math.pow(n, 1);
                } else if (c == 'D') {
                    dart[idx++] = (int) Math.pow(n, 2);
                } else {
                    dart[idx++] = (int) Math.pow(n, 3);
                }
                numstr = "";
            }
            //옵션일 때
            else {
                if (c == '*') {
                    dart[idx - 1] *= 2;
                    if (idx - 2 >= 0) dart[idx - 2] *= 2;
                } else {
                    dart[idx - 1] *= (-1);
                }
            }
        }

        answer = dart[0] + dart[1] + dart[2];

        return answer;
    }
}
