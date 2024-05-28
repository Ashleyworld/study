import java.util.Arrays;
import java.util.*;

public class Practice {

    //특정 문자 제거하기
    class Solution01{
        public String solution(String my_string, String letter) {
            String answer = "";

            answer = my_string.replace(letter, "");
            return answer;
        }
    }

    //문자 반복 출력하기
    class Solution02 {
        public String solution(String my_string, int n) {
            String str = "";
            for(int i=0; i<=my_string.length()-1; i++) {
                for(int j=0; j<=n-1; j++) {
                    str += my_string.charAt(i);
                }
            }
            return str;
        }
    }

    //배열뒤집기

    class Solution03 {
        public int[] solution(int[] num_list) {
            int[] answer = new int[num_list.length];
            for(int i = 0;i<num_list.length;i++){
                answer[i]=num_list[num_list.length-i-1];
            }
            return answer;
        }
    }
    //배열 두 배 만들기

    class Solution04 {
        public int[] solution(int[] numbers) {
            int[] answer = new int[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                answer[i] = numbers[i] * 2;
            }
            return answer;
        }
    }

    // 인덱스 바꾸기
    class solution05 {
        public String solution(String my_string, int num1, int num2) {
            List<String> list = new ArrayList<>(List.of(my_string.split("")));

            Collections.swap(list, num1, num2);

            String answer = String.join("", list);

            return answer;
        }
    }

    //짝수 홀수 개수
    class Solution06 {
        public int[] solution(int[] num_list) {
            int[] answer = new int[2];
            int left = 0;
            int right = 0;

            for(int i = 0; i < num_list.length; i++) {
                if (num_list[i] % 2 == 0) {
                    left++;
                }
                else {
                    right++;
                }
            }

            answer[0] = left;
            answer[1] = right;

            return answer;
        }
    }

    //배열 원소의 길이
    class Solution07 {
        public int[] solution(String[] strlist) {
            int[] answer = new int[strlist.length];

            int length = strlist.length;
            for(int i = 0; i<length; i++){
                answer[i] = strlist[i].length();
            }

            //map 활용 가능하다.
            return answer;
        }
    }

}
