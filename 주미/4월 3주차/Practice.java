public class Practice {

    // 주사위게임 1

    class Solution {
        public int solution(int a, int b) {
            int answer = 0;

            if (a % 2 != 0 && b % 2 != 0) {
                answer = (a * a) + (b * b);
            } else if (a % 2 == 0 && b % 2 == 0) {
                answer = Math.abs(a - b);
            } else {
                answer = 2 * (a + b);
            }

            return answer;
        }
    }


    // 꼬리 문자열
    class Solution {
        public String solution(String[] str_list, String ex) {
            StringBuilder sb = new StringBuilder();

            for (String str : str_list) {
                if (!str.contains(ex)) {
                    sb.append(str);
                }
            }

            return sb.toString();
        }
    }

// 직각삼각형 출력하기

import java.util.Scanner;

    public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }




// 정수 찾기

    class Solution {
        public int solution(int[] num_list, int n) {
            int answer = 0;
            for(int i=0; i<num_list.length; i++){
                if(num_list[i]==n){
                    answer = 1;
                }
            }
            return answer;
        }
    }

// 부분 문자열인지 확인하기

    class Solution {
        public int solution(String my_string, String target) {
            int answer = 0;
            if(my_string.contains(target)){
                answer = 1;
            }
            return answer;
        }
    }


    // 부분 문자열
    class Solution {
        public int solution(String str1, String str2) {
            int answer = 0;

            if (str2.contains(str1)) {
                answer = 1;
            } else {
                answer = 0;
            }

            return answer;
        }
    }

    // 0 떼기
    class Solution {
        public String solution(String n_str) {
            int i = Integer.parseInt(n_str);
            String answer = i+"";
            return answer;
        }
    }

// ad 제거하기

import java.util.List;
import java.util.ArrayList;

    class Solution {
        public String[] solution(String[] strArr) {
            List<String> answer = new ArrayList<>();

            for (String str : strArr) {
                if (!str.contains("ad")) {
                    answer.add(str);
                }
            }
            return answer.toArray(new String[0]);
        }
    }
}
