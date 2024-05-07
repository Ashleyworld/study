public class Practice {

    //문자열 곱하기
    class Solution {
        public String solution(String my_string, int k) {
            String answer = "";

            answer = my_string.repeat(k);



            return answer;
        }
    }

    //수 조작하기 1
    class Solution {
        public int solution(int n, String control) {
            int answer = n;
            String[] control_list = control.split("");

            for(int i = 0; i<control_list.length; i++){
                if(control_list[i].equals("w")){
                    answer += 1;
                }else if(control_list[i].equals("s")){
                    answer -= 1;
                }else if(control_list[i].equals("d")){
                    answer += 10;
                }else if(control_list[i].equals("a")){
                    answer -= 10;
                }
            }
            return answer;
        }
    }

    //n번째 원소까지
    class Solution {
        public int[] solution(int[] num_list, int n) {
            int[] answer =new int[n];

            for(int i=0; i<n; i++){
                answer[i]=num_list[i];
            }

            return answer;
        }
    }


    // 뒤에서 5등까지

    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[5];
            Arrays.sort(num_list);
            for(int i=0; i<5;i++){
                answer[i] = num_list[i];
            }
            return answer;
        }
    }

    // A 강조하기
    class Solution {
        public String solution(String myString) {
            myString = myString.toLowerCase();
            myString = myString.replaceAll("a", "A");
            return myString;
        }
    }

    // n번째 원소부터
    class Solution {
        public int[] solution(int[] num_list, int n) {
            int[] answer = new int[num_list.length - n + 1];

            for(int i = 0; i < answer.length; i++){
                answer[i] = num_list[n-1];
                n++;	// n을 1씩 증가시켜서 anser[i+1]에는 num_list[n]이 오도록 한다
            }
            return answer;
        }
    }

    // 배열 만들기1

    class Solution {
        public List<Integer> solution(int n, int k) {
            List<Integer> answer = new ArrayList<>();
            for (int i = 1; k * i <= n; i++) {
                answer.add(k * i);
            }
            return answer;
        }
    }

    // rny_string

    class Solution {
        public String solution(String rny_string) {
            String answer = rny_string.replaceAll("m","rn");
            return answer;
        }
    }
}
