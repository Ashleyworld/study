import java.util.*;

public class Solution0304 {

    //둘만의 암호
    public String solution01(String s, String skip, int index) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < index; j++) {
                c += 1;
                if (c > 'z') {
                    c -= 26;
                }
                if (skip.contains(String.valueOf(c))) {
                    j--;
                }
            }
            answer += c;
        }

        return answer;
    }

    //햄버거 만들기
    public int solution02(int[] ingredient) {
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

    //크레인 인형뽑기 게임(https://velog.io/@e-7281998/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4Java-Lv1.%ED%81%AC%EB%A0%88%EC%9D%B8-%EC%9D%B8%ED%98%95%EB%BD%91%EA%B8%B0-%EA%B2%8C%EC%9E%84)
    public int solution03(int[][] board, int[] moves) {
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

    //키패드 누르기
    public String solution04(int[] numbers, String hand) {
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

    //평행 (https://velog.io/@shin75492/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4JAVA-%ED%8F%89%ED%96%89)
    public int solution05(int[][] dots) {
        int answer = 0;

        List<Double> slopes = new ArrayList<>();

        for (int i = 0; i < dots.length - 1; i++) {
            for (int j = i+1; j < dots.length; j++) {

                double sideX = dots[i][1] - dots[j][1];
                double sideY = dots[i][0] - dots[j][0];

                double slop = sideY / sideX;

                if (!slopes.contains(slop)) {
                    slopes.add(slop);
                } else {
                    answer = 1;
                    break;
                }
            }
            if(answer==1) {
                break;
            }
        }
        return answer;
    }

    //성격 유형 검사하기 (https://velog.io/@jp-share/%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%84%B1%EA%B2%A9-%EC%9C%A0%ED%98%95-%EA%B2%80%EC%82%AC%ED%95%98%EA%B8%B0)
    public String solution06(String[] survey, int[] choices) {
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

    //신규 아이디 추천(https://velog.io/@hammii/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%8B%A0%EA%B7%9C-%EC%95%84%EC%9D%B4%EB%94%94-%EC%B6%94%EC%B2%9C-java-2021-KAKAO-BLIND-RECRUITMENT)
    public String solution07(String new_id) {
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
