import java.util.*;

public class Practice {

    //배열의 원소 삭제하ㄱㅣ
    class Solution {
        public List solution(int[] arr, int[] delete_list) {
            List<Integer> answer = new ArrayList<>();
            for (int num : arr) {
                answer.add(num);
            }

            for(int del : delete_list){
                int index = answer.indexOf(del);

                if (index != -1) {
                    answer.remove(index);
                }
            }

            return answer;
        }
    }

    //소문자로 바꾸기
    class Solution {
        public String solution(String myString) {
            String answer = "";
            int tmp;
            for(int i=0; i<myString.length(); i++){
                tmp = (int)myString.charAt(i);
                if((65<=tmp)&&(tmp<=90)){
                    answer += (char)(tmp+32);
                }else{
                    answer += (char)tmp;
                }
            }
            return answer;
        }
    }

    //할 일 목록
    class Solution {
        public String[] solution(String[] todo_list, boolean[] finished) {
            List<String> answerList = new ArrayList<>();

            for (int i = 0; i < finished.length; i++) {
                if (!finished[i]) {
                    answerList.add(todo_list[i]);
                }
            }

            String[] answer = new String[answerList.size()];
            answer = answerList.toArray(answer);
            return answer;
        }
    }

    //배열에서 문자열 대소문자 변환하기
    class Solution {
        public String[] solution(String[] strArr) {
            String[] answer = new String[strArr.length];

            for(int i=0; i<strArr.length; i++){
                if(i%2==0){
                    answer[i] = strArr[i].toLowerCase();
                }else{
                    answer[i] = strArr[i].toUpperCase();
                }
            }

            return answer;
        }
    }

    //공백으로 구분하기1
    class Solution {
        public String[] solution(String my_string) {
            return my_string.split(" ");
        }
    }

    //길이에 따른 연산
    class Solution {
        public int solution(int[] num_list) {
            int sum = 0;
            int mul = 1;
            int answer = 0;
            for(int i = 0; i<num_list.length;i++){
                if(num_list.length>=11){
                    sum+=num_list[i];
                    answer = sum;
                }
                else {
                    mul*=num_list[i];
                    answer = mul;
                }
            }
            return answer;
        }
    }

    //부분 문자열 이어 붙여 문자열 만들기
    class Solution {
        public String solution(String[] my_strings, int[][] parts) {
            String answer = "";

            for(int i=0; i<my_strings.length; i++){
                String str = my_strings[i];

                answer += str.substring(parts[i][0], parts[i][1]+1);
            }

            return answer;
        }
    }


}
