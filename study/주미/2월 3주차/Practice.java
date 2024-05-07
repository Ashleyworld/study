public class Practice {

    // 최빈값구하기
    public int solution01(int[] array) {
        int answer = array[0];
        int max = 0; int frequent[] = new int[1000];

        for(int i = 0; i < array.length; i++) {
            frequent[array[i]]++;

            if(max < frequent[array[i]]) {
                max = frequent[array[i]];
                answer = array[i];
            }
        }

        int temp = 0; // 여러 개인 지
        for(int j = 0; j < 1000; j++) {
            if(max == frequent[j]) temp++;
            if(temp > 1) answer = -1;
        }

        return answer;
    }

    // 추억점수
    public int[] solution02(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        for(int i=0; i<photo.length; i++) { // photo 요소
            for(int j=0; j<photo[i].length; j++) { // photo 요소의 요소? 뭐라 부르지;
                for(int k=0; k<name.length; k++) {
                    if(photo[i][j].equals(name[k])) answer[i] += yearning[k];
                }
            }
        }
        return answer;

        //https://kdw999.tistory.com/138
    }

    // 멀리뛰기
    public long solution03(int n) {
        int[] dp = new int[2001];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<2001; i++){
            dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
        }
        return dp[n];
    }
    //https://zzang9ha.tistory.com/138#google_vignette

    // 명예의 전당(1)
    public int[] solution04(int k, int[] score) {
        // 결과를 담을 배열 선언
        int[] answer = new int[score.length];

        // 순위를 담을 List 선언
        List<Integer> rank = new ArrayList<>();

        // score를 반복
        for (int i = 0; i < score.length; i++) {
            // score 추가
            rank.add(score[i]);

            // rank 리스트의 크기가 k보다 크면 가장 낮은 점수 제거
            if (rank.size() > k) {
                rank.remove(Collections.min(rank));
            }

            // 남은 점수 중 가장 작은 점수 answer에 담기
            answer[i] = Collections.min(rank);
        }
        return answer;
//https://ittrue.tistory.com/461 [IT is True:티스토리]
    }

    // 귤고르기
    public int solution05(int k, int[] tangerine) {
        int sum = 0; // 고를 귤의 개수
        int cnt = 0; // 최솟값 카운트

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : tangerine) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> valueList = new ArrayList<>(map.values());
        Collections.sort(valueList, Collections.reverseOrder());
        for (int v : valueList) {
            if (sum + v >= k) {
                cnt++;
                break;
            } else {
                sum += v;
                cnt++;
            }
        }
        return cnt;

        //https://velog.io/@rlvy98/프로그래머스-귤-고르기Java-자바
    }

    // OX퀴즈
    public String[] solution06(String[] quiz) {
          /*
        1. 문자열 배열 quiz의 각 수식을 숫자와 연산자만 남겨 새로운 2차열 배열에 담음
        2. 배열 0, 2번째를 1번째 부호로 계산 -> 배열 4번째랑 같다면 "O" / 다르다면 "X"
        */

        String[][] str_arr = new String[quiz.length][5];
        String[] answer = new String[quiz.length];

        for(int i=0; i<quiz.length; i++){
            str_arr[i] = quiz[i].split(" ");

            int result = 0;
            if(str_arr[i][1].equals("+")){
                result = Integer.parseInt(str_arr[i][0]) + Integer.parseInt(str_arr[i][2]);
                if(result == Integer.parseInt(str_arr[i][4])){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }else if(str_arr[i][1].equals("-")){
                result = Integer.parseInt(str_arr[i][0]) - Integer.parseInt(str_arr[i][2]);
                if(result == Integer.parseInt(str_arr[i][4])){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }
        }
        return answer;
// 출처: https://dhdh-study.tistory.com/111 [dh.log:티스토리]
    }

    //연속 부분 수열 합의 개수
    public int solution07(int[] elements) {
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


//https://velog.io/@sugyeonghh/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%97%B0%EC%86%8D-%EB%B6%80%EB%B6%84-%EC%88%98%EC%97%B4-%ED%95%A9%EC%9D%98-%EA%B0%9C%EC%88%98Java

    // 카드 뭉치
    public String solution08(String[] cards1, String[] cards2, String[] goal) {
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
// 출처: https://ittrue.tistory.com/463 [IT is True:티스토리]
    }

    // 괄호 회전하기
    static public int solution09(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            String str = s.substring(i, s.length()) + s.substring(0, i);
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (stack.isEmpty()) {
                    stack.push(c);
                } else if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            if (stack.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }

    //https://m.blog.naver.com/sosow0212/222890622722


    //N개의 최소공배수

    public int solution10(int[] arr) {
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }

    // 최대공약수
    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    // 최소공배수
    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    //https://hstory0208.tistory.com/entry/Java%EC%9E%90%EB%B0%94-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-Lv2-N%EA%B0%9C%EC%9D%98-%EC%B5%9C%EC%86%8C%EA%B3%B5%EB%B0%B0%EC%88%98-%EC%9C%A0%ED%81%B4%EB%A6%AC%EB%93%9C-%ED%98%B8%EC%9E%AC%EB%B2%95

}
