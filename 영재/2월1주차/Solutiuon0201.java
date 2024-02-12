import java.util.*;

public class Solutiuon0201 {

    //로그인 성공?
    public String solution01(String[] id_pw, String[][] db) {
        String answer = "";

        for(int i = 0; i < db.length; i++){
            String id = id_pw[0];
            String pw = id_pw[1];

            if(id.equals(db[i][0])){
                if(pw.equals(db[i][1])){
                    answer = "login";
                    break;
                } else {
                    answer = "wrong pw";
                    break;
                }
            }
        }

        if(answer.equals("")){
            answer = "fail";
        }
        return answer;
    }

    //3진법 뒤집기
    public int solution02(int n) {
        String str = "";
        while (n != 0) {
            str += n % 3;
            n /= 3;
        }
        return Integer.parseInt(str, 3);
    }

    //숫자의 표현
    public int solution03(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;

                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }
        return answer;
    }

    //예산
    public int solution04(int[] d, int budget) {
        int answer = 0;
        int result = 0;
        Arrays.sort(d);

        for(int i = 0; i < d.length; i++){
            result += d[i];

            if (result > budget) {
                answer = i;
                break;
            }
        }
        if (result <= budget) {
            answer = d.length;
        }
        return answer;
    }

    //대소문자 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String answer = "";

        for(int i = 0; i< a.length();i++){
            char c = a.charAt(i);
            if(Character.isUpperCase(c)){
                answer += Character.toLowerCase(c);
            } else{
                answer += Character.toUpperCase(c);
            }
        }
        System.out.println(answer);
    }

    //이상한 문자 만들기
    public String solution06(String s) {
        String answer = "";
        String[] str = s.split("");

        int idx = 0;
        for(int i=0; i<str.length; i++) {
            if(str[i].equals(" ")) {
                idx = 0;
            } else if(idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } else if(idx % 2 != 0) {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer += str[i];
        }
        return answer;
    }

    //크기가 작은 부분 문자열
    public int solution07(String t, String p) {
        int length = t.length() - p.length() + 1;
        long pNum = Long.parseLong(p);
        int answer = 0;

        for (int i = 0; i < length; i++) {
            String temp = t.substring(i, i + p.length());

            if (Long.parseLong(temp) <= pNum) {
                answer++;
            }
        }
        return answer;
    }

    //등수 매기기
    public int[] solution08(int[][] score) {
        List<Integer> scoreList = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            scoreList.add(score[i][0] + score[i][1]);
        }
        scoreList.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;
        }

        return answer;
    }

    //치킨 쿠폰
    public int solution09(int chicken) {
        int service = 0;

        while (chicken >= 10) {
            service += chicken / 10;
            chicken = (chicken / 10) + (chicken % 10);
        }
        return service;
    }

    //전국 대회 선발 고사
    public int solution10(int[] rank, boolean[] attendance) {
        int answer = 0;
        int sort[] = new int[rank.length];
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                sort[i] = rank[i];
            } else {
                rank[i] = Integer.MAX_VALUE;
            }
        }
        Arrays.sort(rank);

        for (int i = 0; i < sort.length; i++) {
            if (rank[0] == sort[i]) {
                answer += i * 10000;
            } else if (rank[1] == sort[i]) {
                answer += i*100;
            } else if (rank[2] == sort[i]) {
                answer += i;
            }
        }

        return answer;
    }

    //삼총사
    public int solution11(int[] number) {
        int answer = 0;

        for(int i = 0; i < number.length; i++) {
            for(int j = i + 1; j < number.length; j++) {
                for(int k = j + 1; k < number.length; k++) {
                    if(number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    //다음 큰 숫자
    public int solution12(int n) {
        int answer = n;
        int originCnt = Integer.bitCount(n); // 정수를 매개변수로 넣었을때 1의 개수 반환

        while(true){
            int oneCnt = Integer.bitCount(++answer);

            if(oneCnt == originCnt){
                break;
            }
        }

        return answer;
    }

    //PCCE 6번
    public String[] solution13(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i] - 1]) {
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }

    //유한소수 판별하기
    public int solution14(int a, int b) {
        int newB = b / gcd(a, b);

        while (newB != 1) {
            if (newB % 2 == 0) {
                newB /= 2;
            } else if (newB % 5 == 0) {
                newB /= 5;
            } else {
                return 2;
            }
        }

        return 1;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    //저주의 숫자3
    public int solution15(int n) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer++;
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
            }
        }
        return answer;
    }

    //최소직사각형
    public int solution16(int[][] sizes) {
        int answer = 0;
        int max_v=0;
        int max_h=0;
        for(int i=0;i<sizes.length;i++){
            int v=Math.max(sizes[i][0],sizes[i][1]);
            int h=Math.min(sizes[i][0],sizes[i][1]);
            max_v=Math.max(max_v,v);
            max_h=Math.max(max_h,h);
        }
        return max_v*max_h;
    }

    //피보나치 수 (https://tmdrl5779.tistory.com/279)
    public int solution17(int n) {
        int answer = 0;

        int[] dp = new int[n+1];

        for(int i = 0; i < dp.length; i++){
            if(i == 0){
                dp[i] = 0;
            }else if(i == 1){
                dp[i] = 1;
            }else{
                dp[i] = (dp[i-1] % 1234567) + (dp[i-2] % 1234567) % 1234567;
            }
        }

        answer = dp[dp.length-1] % 1234567;

        return answer;
    }

    //문자열 밀기
    public int solution18(String A, String B) {
        int answer = 0;
        String copy = A;

        for (int i = 0; i < A.length(); i++) {
            if (copy.equals(B)) {
                return answer;
            }

            String a = copy.substring(copy.length() - 1);
            copy = a + copy.substring(0, copy.length() - 1);
            answer++;
        }

        return -1;
    }

    //시저 암호
    public String solution19(String s, int n) {
        String answer = "";

        char[] ch = s.toCharArray();

        for(char c : ch) {
            if(c == 32) answer += " ";
            else {
                if(c <= 90) {
                    c += n;
                    if(c > 90) c -= 26;
                } else {
                    c += n;
                    if(c > 122) c -= 26;
                }
                answer += c;
            }
        }

        return answer;
    }

    //배열 만들기2
    public int[] solution20(int l, int r) {
        List<Integer> result = new ArrayList<>();

        for (;l<=r;l++){
            if ( containsOnly05(l) ) {
                result.add(l);
            }
        }

        int[] answer = new int[result.size()];

        if (result.isEmpty()) {
            answer = new int[]{-1};
        } else {
            for (int i = 0; i < result.size(); i++) {
                answer[i] = result.get(i);
            }
        }
        return answer;
    }

    private boolean containsOnly05(int number){
        while(number > 0) {
            int digit = number % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            number = number / 10;
        }
        return true;
    }
}
