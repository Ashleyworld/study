import java.util.*;

public class Solution0204 {
    //N개의 최소 공배수
    public int solution01(int[] arr) {
        int answer = arr[0];

        for(int i = 1; i < arr.length; i++){
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }

    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    //최빈값 구하기
    public int solution02(int[] array) {
        int answer = 0;
        int maxCount = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : array){
            int count = map.getOrDefault(num, 0) + 1;

            if(count > maxCount){
                maxCount = count;
                answer = num;
            } else if(count == maxCount){
                answer = -1;
            }
            map.put(num, count);
        }

        return answer;
    }

    //추억 점수
    public int[] solution03(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++){
            for(int j = 0; j < photo[i].length; j++){
                for(int k = 0; k < name.length; k++){
                    if(photo[i][j].equals(name[k])) {
                        answer[i] += yearning[k];
                    }
                }
            }
        }
        return answer;
    }

    //멀리뛰기
    public long solution04(int n) {
        long[] answer = new long[2001];
        answer[1] = 1;
        answer[2] = 2;

        for(int i = 3; i < 2001; i++){
            answer[i] = (answer[i - 2] + answer[i - 1]) % 1234567;
        }

        return answer[n];
    }

    //명예의 전당
    public int[] solution05(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < score.length; i++){
            list.add(score[i]);

            if(list.size() > k){
                list.remove(Collections.min(list));
            }

            answer[i] = Collections.min(list);
        }
        return answer;
    }

    //귤 고르기 (https://ittrue.tistory.com/516)
    public int solution06(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        // Map에 귤의 크기별 개수 담기
        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // 귤의 크기 리스트 생성
        List<Integer> keyList = new ArrayList<>(map.keySet());
        // 귤의 개수별 내림차순 정렬
        keyList.sort(((o1, o2) -> map.get(o2) - map.get(o1)));

        // k의 개수 만큼 상자에 담기(종류의 최소값 추출)
        for (Integer i : keyList) {
            if (k <= 0) {
                break;
            }

            answer++;
            k -= map.get(i);
        }

        return answer;
    }

    //OX 퀴즈
    public String[] solution07(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i = 0 ; i < quiz.length; i++){
            String[] split = quiz[i].split(" ");
            int num1 = Integer.parseInt(split[0]);
            int num2 = Integer.parseInt(split[2]);

            if(split[1].equals("+")){
                if(num1 + num2 == Integer.parseInt(split[4])){
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if(split[1].equals("-")){
                if(num1 - num2 == Integer.parseInt(split[4])){
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }

    //연속 부분 수열 합의 개수 (https://velog.io/@sugyeonghh/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%97%B0%EC%86%8D-%EB%B6%80%EB%B6%84-%EC%88%98%EC%97%B4-%ED%95%A9%EC%9D%98-%EA%B0%9C%EC%88%98Java)
    public int solution08(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int len = elements.length;

        for (int size = 1; size <= len; size++) {
            for (int i = 0; i < len; i++) {
                int sum = 0;
                for (int j = i; j < i + size; j++) {
                    sum += elements[j % len];
                }
                set.add(sum);
            }
        }
        return set.size();
    }

    //카드 뭉치
    public String solution09(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0; // cards1 배열의 인덱스
        int idx2 = 0; // cards2 배열의 인덱스

        // goal 배열 순회
        for (String currentStr : goal) {
            // currentStr이 cards1[idx1] 또는 cards2[idx2]에 포함하는지 확인
            if (idx1 < cards1.length && currentStr.equals(cards1[idx1])) {
                idx1++; // cards1[idx1]에 포함하는 경우 idx1 증가
            } else if (idx2 < cards2.length && currentStr.equals(cards2[idx2])) {
                idx2++; // cards2[idx2]에 포함하는 경우 idx2 증가
            } else {
                return "No"; // 둘 다 포함하지 않는 경우
            }
        }

        return "Yes";
    }

    // 괄호 회전하기 (https://velog.io/@abcd4501/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4203)
    public int solution10(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {

            //매번 한 칸씩 뒤로 간 String을 만들기 위해서 매번 새로 만들기
            Stack<String> stack = new Stack<>();

            //한 칸씩 뒤로 간 String을 위한 int
            int cnt = i;

            //Stack만들기
            for (int j = 0; j < s.length(); j++) {
                //글자 수를 넘어가면 cnt를 다시 0으로 만들어서 앞의 단어 가져오기
                if (cnt >= s.length()) {
                    cnt = 0;
                }

                //만약 괄호가 완성되면 그 괄호는 삭제
                if ((s.charAt(cnt) == (')') || s.charAt(cnt) == ('}') || s.charAt(cnt) == (']')) && !stack.empty()) {
                    if (stack.peek().equals("(") && s.charAt(cnt) == (')')) {
                        stack.pop();
                    } else if (stack.peek().equals("{") && s.charAt(cnt) == ('}')) {
                        stack.pop();
                    } else if (stack.peek().equals("[") && s.charAt(cnt) == (']')) {
                        stack.pop();
                    }
                } else {
                    stack.add(String.valueOf(s.charAt(cnt)));
                }

                //매번 한 칸씩 밀린 스택을 만들기 위해 추가
                cnt++;

            }

            //한 번 다 돌았을 때 스택이 비어있으면 answer에 1씩 더하기
            if (stack.empty()) {
                answer++;
            }

        }

        return answer;
    }
}
