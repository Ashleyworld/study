public class practice {
    //로그인 성공
    public String solution01(String[] id_pw, String[][] db) {
        for(int i = 0; i<db.length; i++) {
            if(id_pw[0].equals(db[i][0])) {
                if(id_pw[1].equals(db[i][1])) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }
        return "fail";
    }



//3진법 뒤집기
    public int solution02(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        // 10진법 -> 3진법
        while(n != 0) {
            list.add(n%3);
            n /= 3;
        }
        // 3진법 -> 10진법
        int tmp = 1;
        for(int i=list.size()-1;i>=0;i--) {
            answer += list.get(i)*tmp;
            tmp *= 3;
        }
        return answer;
    }


/*
N진법 -> 10진법
Integer.parseInt(i, N);
10진법 -> N진법
Integer.toBinaryString(number); // 2진법
Integer.toOctalString(number); // 8진법
Integer.toHexString(number); // 16진법


*/

//숫자의 표현
    public int solution03(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++) {
            int sum = 0;
            for(int j=i; j<=n; j++) {
                sum += j;

                if(sum==n) {
                    answer++;
                    break;
                } else if(sum>n) {
                    break;
                }
            }
        }
        return answer;
    }


//예산
    public int solution04(int[] d, int budget) {
        int answer = 0;
        int total = 0;
        Arrays.sort(d);//오름차순 정렬
        for(int i=0;i<d.length; i++){
            if(total+d[i]<=budget) {
                total += d[i]; //배열의 값을 하나 씩 더한다
                answer++;
            }
        }
        return answer;
    }


//대소문자 바꿔서 출력하기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String res = "";

        for(int i = 0; i< a.length();i++){
            char c = a.charAt(i);
            if(Character.isUpperCase(c)){
                res += Character.toLowerCase(c);
            } else{
                res += Character.toUpperCase(c);
            }
        }
        System.out.println(res);

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
        int len = p.length();
        long num = Long.parseLong(p);
        int result = 0;

        for (int i = 0; i < t.length() - len + 1; i++) {
            long diff = Long.parseLong(t.substring(i, i + len));
            if (diff <= num) result++;
        }
        return result;
    }

//등수 매기기
    public int[] solution08(int[][] score) {
        double[] avg = new double[score.length];
        int[] answer = new int[score.length];

        for(int i=0; i<score.length; i++) {
            avg[i] = (double)(score[i][0] + score[i][1]) / 2;
        }

        for(int i=0; i<avg.length; i++) {
            int rank = 1;
            for(int j=0; j<avg.length; j++) {
                if(avg[i] < avg[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }

//치킨 쿠폰
    public int solution09(int chicken) {
        int coupon = chicken;
        int count = 0;

        while (coupon >= 10) {
            int leftCoupon = coupon % 10;
            count += coupon / 10;
            coupon = leftCoupon + coupon / 10;
        }
        return count;
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
        int answer = 0;
        // 1. n을 2진수 변환.
        String str = Integer.toBinaryString(n);
        // 2. n의 1인 비트의 수를 저장하는 변수.
        int cnt =0;
        // 3. 1인 비트의 수를 카운팅.
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '1') cnt++;
        }
        // 4. n+1부터 반복.
        for(int i =n+1;i<1000000;i++){
            // 5. 위 과정을 반복.
            String temp = Integer.toBinaryString(i);
            int temp_cnt = 0;
            for(int j =0;j<temp.length();j++){
                if(temp.charAt(j) == '1') temp_cnt++;
            }
            // 6. 1인 비트의 수가 일치하면 해당 수를 담아 반복문 종료.
            if(temp_cnt == cnt) {
                answer = i;
                break;
            }
        }

        return answer;
    }


//가채점
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i]-1]) {
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }


//최소직사각형
    public int solution14(int[][] sizes) {
        int answer = 0;
        int max_v=0;
        int max_h=0;
        for(int i=0;i<sizes.length;i++){
            int v=Math.max(sizes[i][0],sizes[i][1]);
            int h=Math.min(sizes[i][0],sizes[i][1]);
            max_v=Math.max(max_v,v);
            max_h=Math.max(max_h,h);
        }
        return answer=max_v*max_h;
    }
    //https://taehoung0102.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4%EC%9E%90%EB%B0%94-Level1-%EC%B5%9C%EC%86%8C%EC%A7%81%EC%82%AC%EA%B0%81%ED%98%95-%EC%9C%84%ED%81%B4%EB%A6%AC-8%EC%A3%BC%EC%B0%A8

//피보나치 수
    public int solution15(int n) {
        int answer = fibo(n);
        System.out.println(answer);
        return answer;
    }

    public int fibo(int n) {
        int[] cache = new int[n+1];

        cache[0] = 0;
        cache[1] = 1;

        for (int i=2; i<= n; i++){
            // 99999와 같이 큰 수를 넣을 경우 int와 long타입의 범위를 넘어
            // 값들을 문제 조건에 맞게 1234567로 나눈 나머지로 저장
            cache[i] = (cache[i-1] + cache[i-2]) % 1234567;
        }

        return cache[n] % 1234567;
    }
    //https://velog.io/@seongwon97/프로그래머스-피보나치-수-Java

//문자열 밀기
    public int solution16(String A, String B) {
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
    //https://king-ja.tistory.com/38

    //시저 암호
    public String solution17(String s, int n) {
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
    public int[] solution18(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int a = 0;
        for(int i = l; i <= r; i++) {
            String num =  String.valueOf(i);
            String[] nums = num.split("");
            int numLength =  nums.length;
            int count = 0;
            for (int j = 0; j < numLength; j++) {
                if (nums[j].equals("0")  nums[j].equals("5")) {
                    count++;
                }
            }
            if(count == numLength) {
                list.add(i);
            }
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        if(answer.length == 0) {
            answer = new int[] {-1};
            return answer;
        }
        return answer;
    }



}
