import java.util.*;

public class Practice {

    class Solution01 {
        public String solution(String my_string) {

            StringBuffer str = new StringBuffer(my_string);

            return str.reverse().toString();
        }
    }

    //배열의 유사도
    class Solution02 {
        public int solution(String[] s1, String[] s2) {
            int answer = 0;

            for (int i = 0; i < s1.length; i++) {
                for (int j = 0; j < s2.length; j++) {
                    if (s1[i].equals(s2[j])) {
                        answer++;
                    }
                }
            }

            return answer;
        }
    }

    //주사위의 개수
    class Solution03 {
        public int solution(int[] box, int n) {
            int answer = 0;
            int a = box[0] / n;
            int b = box[1] / n;
            int c = box[2] / n;
            answer = a * b * c;
            return answer;
        }
    }

    //삼각형의 완성조건

    class Solution04 {
        public int solution(int[] sides) {
            int answer = 0;
            Arrays.sort(sides);

            if( sides[2] < (sides[0] + sides[1]) ) {
                answer = 1;
            } else {
                answer = 2;
            }


            return answer;
        }
    }

    //특별한 이차원 배열1
    class Solution05 {
        public int[][] solution(int n) {
            int[][] answer = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        answer[i][j] = 1;
                    } else {
                        answer[i][j] = 0;
                    }
                }
            }

            return answer;
        }
    }

    // 간단한 식 계산하기
    class Solution06 {
        public int solution(String binomial) {
            int answer = 0;

            // 이항식을 공백을 기준으로 분리
            String[] parts = binomial.split(" ");

            int a = Integer.parseInt(parts[0]);
            String op = parts[1];
            int b = Integer.parseInt(parts[2]);

            // 연산자에 따라 계산 수행
            if (op.equals("+")) {
                answer = a + b;
            } else if (op.equals("-")) {
                answer = a - b;
            } else if (op.equals("*")) {
                answer = a * b;
            }

            return answer;
        }
    }

    //접미사 배열

    class Solution07 {
        public String[] solution(String my_string) {
            String[] answer = new String[my_string.length()]; //1.
            for(int i =0; i< my_string.length(); i++){
                //2.
                answer[i] = my_string.substring(i,my_string.length());
            }

            Arrays.sort(answer); //3.

            return answer;
        }
    }

}
