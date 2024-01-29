import java.math.BigInteger;
import java.util.*;

public class Solution0103 {

    // 소인수 분해
    public List<Integer> solution01(int n) {
        List<Integer> answer = new ArrayList<>();

        for(int i = 2; i <= n; i++){
            if (n % i == 0) {
                while(n % i == 0){
                    n /= i;
                }
                answer.add(i);
            }
        }
        return answer;
    }

    // 문자열 내림차순으로 배치
    public String solution02(String s) {
        String answer = "";

        String[] sArr = s.split("");
        Arrays.sort(sArr, Collections.reverseOrder());

        for(String str : sArr){
            answer += str;
        }
        return answer;
    }

    //잘라서 배열로 저장하기
    public List<String> solution03(String my_str, int n) {
        List<String> answer = new ArrayList<>();

        for(int i = 0; i < my_str.length() / n; i++){
            answer.add(my_str.substring((n * i), (n * (i + 1))));
        }

        if (my_str.length() % n != 0) {
            answer.add(my_str.substring((my_str.length() / n) * n));
        }
        return answer;
    }

    //문자 개수 세기
    public int[] solution04(String my_string) {
        int[] answer = new int[52];


        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                answer[c - 'A']++;
            } else if (c >= 'a' && c <= 'z') {
                answer[26 + c - 'a']++;
            }
        }

        return answer;
    }

    //부족한 금액 계산하기
    public long solution05(int price, int money, int count) {
        long answer = 0;
        long sum = 0;

        for(int i = 1; i <= count; i++){
            sum += price * i;
        }

        if(sum > money){
            answer = sum - money;
        }

        return answer;
    }

    // 배열 만들기4
    public int[] solution06(int[] arr) {
        List<Integer> tmp= new ArrayList<>();

        int i=0;
        while(i<arr.length){

            if(tmp.isEmpty()){
                tmp.add(arr[i]);
                i=i+1;
            }
            else{
                int last=tmp.get(tmp.size()-1);
                if(last<arr[i]){
                    tmp.add(arr[i]);
                    i=i+1;
                }
                else if(last>=arr[i]){
                    tmp.remove(tmp.size()-1);
                }
            }

        }

        int[] stk =new int[tmp.size()];
        for(int k=0;k<tmp.size();k++){
            stk[k]= tmp.get(k);
        }
        return stk;
    }

    // 공 던지기
    public int solution07(int[] numbers, int k) {
        return numbers[2 * (k - 1) % numbers.length];
    }

    //문자열 계산하기
    public int solution08(String my_string) {
        String[] arr = my_string.split(" ");
        int answer = Integer.valueOf(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].equals("+")) {
                answer += Integer.valueOf(arr[i + 1]);
            } else if (arr[i].equals("-")) {
                answer -= Integer.valueOf(arr[i + 1]);
            }else {
                continue;
            }
        }
        return answer;
    }

    //영어가 싫어요
    public long solution09(String numbers) {
        long answer = 0;

        numbers = numbers.replace("zero","0");
        numbers = numbers.replace("one","1");
        numbers = numbers.replace("two","2");
        numbers = numbers.replace("three","3");
        numbers = numbers.replace("four","4");
        numbers = numbers.replace("five","5");
        numbers = numbers.replace("six","6");
        numbers = numbers.replace("seven","7");
        numbers = numbers.replace("eight","8");
        numbers = numbers.replace("nine","9");

        answer = Long.parseLong(numbers);

        return answer;
    }

    //PCCE4번
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {
            money +=
                    before
            ;
            month++;
        }
        while (
                money
                        < 100) {

            money += after;
            ;
            month++;
        }

        System.out.println(month);
    }

    // 두 수의 합
    public String solution10(String a, String b){
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        return num1.add(num2).toString();
    }

    // 문자열 다루기 기본
    public boolean solution11(String s) {
        if(s.length() != 4 && s.length() != 6){
            return false;
        }
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }

    // 왼쪽 오른쪽
    public String[] solution12(String[] str_list) {
        String[] answer = {};
        for (int i = 0; i < str_list.length;i++) {
            if (str_list[i].equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }
        return answer;
    }

    //배열 만들기6
    public List solution13(int[] arr){
        List<Integer> stk = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(stk.size() == 0){
                stk.add(arr[i]);
            } else if(stk.get(stk.size() - 1) == arr[i]){
                stk.remove(stk.size() - 1);
            } else if(stk.get(stk.size() - 1) != arr[i]){
                stk.add(arr[i]);
            }
        }

        if(stk.size() == 0){
            stk.add(-1);
        }
        return stk;
    }

    //조건 문자열
    public int solution14(String ineq, String eq, int n, int m) {
        int answer = 0;

        if(ineq.equals(">")){
            if(eq.equals("=")){
                answer = n >= m ? 1 : 0;
            } else if(eq.equals("!")){
                answer = n > m ? 1 : 0;
            }
        } else if(ineq.equals("<")){
            if(eq.equals("=")){
                answer = n <= m ? 1 : 0;
            } else if(eq.equals("!")){
                answer = n < m ? 1 : 0;
            }
        }
        return answer;
    }

    //문자열 여러 번 뒤집기
    public StringBuilder solution15(String my_string, int[][] queries) {
        StringBuilder str = new StringBuilder(my_string);

        for(int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            StringBuilder s = new StringBuilder(str.substring(start, end+1));
            s.reverse();
            str.replace(start, end+1, s.toString());
        }

        return str;
    }

    // 행렬의 덧셈
    public int[][] solution16(int[][] arr1, int[][] arr2) {

        for(int i=0; i<arr1.length;i++){
            for(int j=0; j<arr1[0].length;j++){
                arr1[i][j] += arr2[i][j];
            }
        }
        return arr1;
    }

    //구슬을 나누는 경우의 수
    public int solution17(int balls, int share) {
        long answer = 1;
        int shareIndex = 1;
        for(int i = share+1; i <= balls; i++){
            answer *= i;
            answer /= shareIndex;
            shareIndex++;
        }

        return (int)answer;
    }

    //삼각형의 완성조건2
    public int solution18(int[] sides) {
        int bigValue = Math.max(sides[0], sides[1]);
        int smallValue = Math.min(sides[0], sides[1]);

        int lowLimit = bigValue - smallValue;
        int highLimit = bigValue + smallValue;

        return highLimit - lowLimit - 1;
    }

    // 수열과 구간 쿼리2
    public int[] solution19(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, Integer.MAX_VALUE);

        for (int j = 0; j < queries.length; j++) {
            for (int i = queries[j][0]; i <= queries[j][1]; i++) {
                if (arr[i] > queries[j][2]) {
                    answer[j] = Math.min(answer[j], arr[i]);
                }
            }
            if (answer[j] == Integer.MAX_VALUE) {
                answer[j] = -1;
            }
        }
        return answer;
    }
}
