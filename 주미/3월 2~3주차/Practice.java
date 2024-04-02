public class Practice {
    //겹치는 선분의 길이

    class Solution {
        public int solution(int[][] lines) {
            int[] rail = new int[200];
            for (int[] line : lines) {
                for (int j = (line[0] + 100); j < (line[1] + 100); j++) {
                    rail[j]++;
                }
            }

            int answer = 0;
            for (int value : rail) {
                if (value > 1) answer++;
            }
            return answer;
        }
    }



// 로또의 최고 순위와 최저 순위
import java.util.*;

    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = {0, 0};
            int zeroCnt = 0;

            Arrays.sort(lottos);
            for(int i = 0; i < 6; i++) {
                if(lottos[i] != 0) break;
                zeroCnt++;
            }

            Arrays.sort(win_nums);
            for(int j = 0; j < 6; j++) {
                for(int k = zeroCnt; k < 6; k++) {
                    if(win_nums[j] != lottos[k])    continue;
                    answer[0]++;
                    answer[1]++;
                }
            }

            answer[0] += zeroCnt;

            for(int i = 0; i < 2; i++) {
                if(answer[i] == 6) answer[i] = 1;
                else if(answer[i] == 5) answer[i] = 2;
                else if(answer[i] == 4) answer[i] = 3;
                else if(answer[i] == 3) answer[i] = 4;
                else if(answer[i] == 2) answer[i] = 5;
                else answer[i] = 6;
            }

            return answer;
        }
    }


    // 문자열 나누기
    class Solution {
        public int solution(String s) {
            int answer = 1;

            char x = s.charAt(0);
            int count = 1;
            for (int i = 1; i < s.length(); i++) {
                if (count == 0) {
                    answer++;
                    x = s.charAt(i);
                }

                if (x == s.charAt(i)) {
                    count++;
                } else {
                    count--;
                }
            }


            return answer;
        }
    }


//대충 만든 자판

import java.util.*;

    class Solution {
        public int[] solution(String[] keymap, String[] targets) {
            int[] answer = new int[targets.length];
            HashMap<Character, Integer> map = new HashMap<>();

            // keymap 위 모든 알파벳의 최소 클릭 수 구하기
            for(int i=0;i<keymap.length;i++){


                // 최소 클릭수로 덮어씌우기 위해 문자열 끝부터 시작
                for(int j=0;j<keymap[i].length();j++){


                    if (map.containsKey(keymap[i].charAt(j))) {
                        // 최소 클릭 수가 뒤에 나왔을 때 갱신
                        Integer nCurrCnt = map.get(keymap[i].charAt(j));
                        if (nCurrCnt > (j+1)){
                            map.put(keymap[i].charAt(j),j+1);
                        }
                    }
                    else {
                        map.put(keymap[i].charAt(j),j+1);
                    }

                }
            }


            // 모든 targets 단어에 대해 반복
            for(int i=0;i<targets.length;i++){
                int nCnt = 0;
                for(int j=0;j<targets[i].length();j++){
                    char alpha = (targets[i].charAt(j));
                    Integer nMinClick = map.get(alpha);
                    if ( nMinClick != null ) {
                        nCnt += nMinClick;
                    }
                    else{
                        nCnt = -1;  // i번째 단어는 작성할 수 없음
                        break;
                    }
                }
                answer[i] = nCnt;

            }



            return answer;
        }
    }

// 체육복
import java.util.Arrays;

    class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = 0;

            Arrays.sort(reserve);
            Arrays.sort(lost);

            // 도난 당하지 않은 학생 수
            answer = n - lost.length;

            // 여벌 체육복을 가져왔지만 도난당한 학생 수
            // 다른 학생에게 체육복을 빌려줄 수 없음
            for (int i = 0; i < lost.length; i++) {
                for (int j = 0; j < reserve.length; j++) {
                    if (lost[i] == reserve[j]) {
                        answer++;
                        lost[i] = -1;
                        reserve[j] = -1;
                        break;
                    }
                }
            }

            // 도난당했지만 체육복을 빌릴 수 있는 학생 수
            for (int i = 0; i < lost.length; i++) {
                for (int j = 0; j < reserve.length; j++) {
                    if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                        answer++;
                        reserve[j] = -1;
                        break;
                    }
                }
            }

            return answer;
        }
    }
//https://velog.io/@puclpu/프로그래머스-체육복-Java

// 숫자 짝꿍

    class Solution {
        public String solution(String X, String Y) {
            StringBuilder answer = new StringBuilder();
            int[] x = {0,0,0,0,0,0,0,0,0,0};
            int[] y = {0,0,0,0,0,0,0,0,0,0};
            for(int i=0; i<X.length();i++){
                x[X.charAt(i)-48] += 1;
            }
            for(int i=0; i<Y.length();i++){
                y[Y.charAt(i)-48] += 1;
            }

            for(int i=9; i >= 0; i--){
                for(int j=0; j<Math.min(x[i],y[i]); j++){
                    answer.append(i);
                }
            }
            if("".equals(answer.toString())){
                return "-1";
            }else if(answer.toString().charAt(0)==48){
                return "0";
            }else {
                return answer.toString();
            }
        }
    }

// 완주하지 못한 선수

import java.util.HashMap;

    class Solution {
        public String solution(String[] participant, String[] completion) {
            HashMap<String, Integer> hashMap = new HashMap();
            String answer = "";

            for (int i = 0; i < participant.length; i++) {
                if (hashMap.get(participant[i]) != null) {
                    hashMap.put(participant[i], hashMap.get(participant[i]) + 1);
                } else {
                    hashMap.put(participant[i], 1);
                }

            }

            for (int i = 0; i < completion.length; i++) {
                if (hashMap.get(completion[i]) != null) {
                    hashMap.put(completion[i], hashMap.get(completion[i]) - 1);
                }

            }

            for (String key : hashMap.keySet()) {
                if (hashMap.get(key) != 0) {
                    answer = key;
                }
            }

            return answer;
        }
    }




// 둘만의 암호
import java.util.*;
import java.lang.*;
    class Solution {
        public String solution(String s, String skip, int index) {
            String[] temp = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                    "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                    "w", "x", "y", "z"};
            List<String> alphabets = new ArrayList<>(Arrays.asList(temp));

            for(int i=0; i<skip.length(); i++){
                alphabets.remove(String.valueOf(skip.charAt(i)));
            } // 알파벳 삭제

            StringBuilder sb = new StringBuilder();
            for(int i=0; i<s.length(); i++){
                int sIdx = alphabets.indexOf(String.valueOf(s.charAt(i)));
                int nextSIdx = (sIdx+index)%alphabets.size();
                sb.append(alphabets.get(nextSIdx));
            }
            return sb.substring(0);
        }
    }

// 이웃한 칸


// 햄버거 만들기
import java.util.*;
    class Solution {
        public int solution(int[] ingredient) {
            int answer = 0;
            List<Integer> li = new ArrayList<>();

            for(int i :ingredient) {
                li.add(i);
                while(li.size() >= 4) {
                    int n = li.size();
                    if(!(li.get(n-1) == 1
                            && li.get(n-2)==3
                            && li.get(n-3) ==2
                            && li.get(n-4)==1)) break;
                    for(int j=0; j<4; j++) {
                        li.remove(li.size() -1);
                    }
                    answer++;
                }
            }
            return answer;
        }
    }



// 크레인 인형뽑기 게임
import java.util.*;
    class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;
            int len = board[0].length;
            Stack<Integer> st = new Stack<>();

            for(int mv:moves){
                mv -=1;
                for(int i=0; i<len; i++){
                    if(board[i][mv] != 0){     //인형집을 위치에 인형이 있는경우 board[mv][i]
                        if(st.size() > 0  && st.peek() == board[i][mv] ){  //지금 뽑은 인형과 마지막 인형이 같다면
                            st.pop();
                            answer += 2;
                        }else{
                            st.push(board[i][mv]); //인형 넣기
                        }
                        board[i][mv] = 0; //인형뽑았으니 0으로 세팅
                        break;
                    }
                }
            }
            return answer;
        }
    }
//https://velog.io/@e-7281998/프로그래머스Java-Lv1.크레인-인형뽑기-게임

// 키패드 누르기

import java.util.*;
    class Solution {
        public String solution(int[] numbers, String hand) {
            String answer = "";
            int left =10;
            int right =12;

            for(int tmp: numbers){
                if(tmp==1||tmp==4||tmp==7){
                    answer+="L";
                    left = tmp;
                }else if(tmp==3||tmp==6||tmp==9){
                    answer+="R";
                    right = tmp;
                }else {
                    if(tmp==0) tmp=11;
                    int leftdist = Math.abs(tmp-left)/3+Math.abs(tmp-left)%3;
                    int rightdist = Math.abs(tmp-right)/3+Math.abs(tmp-right)%3;

                    if(leftdist<rightdist){
                        answer+="L";
                        left = tmp;
                    }else if(leftdist>rightdist){
                        answer+="R";
                        right = tmp;
                    }else{
                        if(hand.equals("left")){
                            answer+="L";
                            left = tmp;
                        }else{
                            answer+="R";
                            right = tmp;
                        }
                    }
                }
            }
            return answer;
        }
    }
//https://velog.io/@kimmjieun/프로그래머스-키패드-누르기-Java-자바


    // 평행
    class Solution {
        public int solution(int[][] dots) {
            int x1 = dots[0][0];
            int y1 = dots[0][1];
            int x2 = dots[1][0];
            int y2 = dots[1][1];
            int x3 = dots[2][0];
            int y3 = dots[2][1];
            int x4 = dots[3][0];
            int y4 = dots[3][1];
            int answer = 0;

            double slope1 = (double) (y2 - y1) / (x2 - x1);
            double slope2 = (double) (y4 - y3) / (x4 - x3);
            if (slope1 == slope2) answer = 1;

            slope1 = (double) (y3 - y1) / (x3 - x1);
            slope2 = (double) (y2 - y4) / (x2 - x4);
            if (slope1 == slope2) answer = 1;

            slope1 = (double) (y4 - y1) / (x4 - x1);
            slope2 = (double) (y2 - y3) / (x2 - x3);
            if (slope1 == slope2) answer = 1;

            return answer;
        }
    }
//https://velog.io/@shin75492/프로그래머스JAVA-평행


// 성격 유형 검사하기
import java.util.*;

    class Solution {
        public String solution(String[] survey, int[] choices) {
            Map<Character, Integer> map = new HashMap<>();

            for(int i = 0; i< survey.length; i++) {
                int value = choices[i];

                if(value > 0 && value < 4) {
                    char ch = survey[i].charAt(0);
                    map.put(ch, map.getOrDefault(ch, 0) + 4 - value);
                } else if(value > 4) {
                    char ch = survey[i].charAt(1);
                    map.put(ch, map.getOrDefault(ch, 0) + value - 4);
                }

            }

            return new StringBuilder()
                    .append(map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? 'R' : 'T')
                    .append(map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? 'C' : 'F')
                    .append(map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? 'J' : 'M')
                    .append(map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? 'A' : 'N')
                    .toString();
        }
    }


//https://velog.io/@jp-share/코딩테스트-프로그래머스-성격-유형-검사하기

// 신규 아이디 추천
class Solution {
    public String solution(String new_id) {
        String answer;

        // 1단계
        String step1 = new_id.toLowerCase();

        // 2단계
        char[] step1_arr = step1.toCharArray();
        StringBuilder step2 = new StringBuilder();
        for (char c : step1_arr) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
                step2.append(c);
            }
        }

        // 3단계
        String step3 = step2.toString().replace("..", ".");
        while (step3.contains("..")) {
            step3 = step3.replace("..", ".");
        }

        // 4단계
        String step4 = step3;
        if (step4.length() > 0) {
            if (step4.charAt(0) == '.') {
                step4 = step4.substring(1, step4.length());
            }
        }
        if (step4.length() > 0) {
            if (step4.charAt(step4.length() - 1) == '.') {
                step4 = step4.substring(0, step4.length() - 1);
            }
        }

        // 5단계
        String step5 = step4;
        if (step5.equals("")) {
            step5 = "a";
        }

        // 6단계
        String step6 = step5;
        if (step6.length() >= 16) {
            step6 = step6.substring(0, 15);

            if (step6.charAt(step6.length() - 1) == '.') {
                step6 = step6.substring(0, step6.length() - 1);
            }
        }

        // 7단계
        StringBuilder step7 = new StringBuilder(step6);
        if (step7.length() <= 2) {
            char last = step7.charAt(step7.length() - 1);

            while (step7.length() < 3) {
                step7.append(last);
            }
        }

        answer = String.valueOf(step7);
        return answer;
    }
}

//https://velog.io/@hammii/프로그래머스-신규-아이디-추천-java-2021-KAKAO-BLIND-RECRUITMENT


}
