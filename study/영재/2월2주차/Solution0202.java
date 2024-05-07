import java.util.*;

public class Solution0202 {

    //배열 만들기2
    public int[] solution01(int l, int r) {
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

    //짝지어 제거하기
    public int solution02(String s){
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch)
                stack.pop();
            else
                stack.push(ch);
        }
        return stack.isEmpty() ? 1 : 0;
    }

    //다항식 더하기
    public String solution03(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" +");
        int strNum = 0;
        int num = 0;

        for (String s : arr) {
            if (s.equals("x")) {
                strNum += 1;
            } else if (s.contains("x")) {
                strNum += Integer.parseInt(s.substring(0, s.length() - 1));
            } else if (!s.equals("+")) {
                num += Integer.parseInt(s);
            }
        }

        if (strNum != 0 && num == 0) {
            if (strNum == 1) {
                answer = "x";
            } else {
                answer = strNum + "x";
            }
        }

        if (strNum != 0 && num != 0) {
            if (strNum == 1) {
                answer = "x" + " + " + num;
            } else {
                answer = strNum + "x" + " + " + num;
            }
        }

        if (strNum == 0 && num != 0) {
            answer = String.valueOf(num);
        }

        return answer;
    }

    //카펫 (https://yeoeun-ji.tistory.com/136)
    public int[] solution04(int brown, int yellow) {
        int[] answer = new int[2];

        for(int i=3;i<brown+yellow;i++){
            int width = (brown+yellow)/i;
            if(width>=i){
                if ((i - 2) * (width - 2) == yellow) {
                    answer[0] = width;
                    answer[1] = i;
                    break;
                }
            }
        }
        return answer;
    }

    //가장 가까운 같은 글자
    public int[] solution05(String s) {
        int[] answer = new int[s.length()];

        for(int i=0;i<s.length();i++){
            if(i !=0){
                int idx = s.substring(0,i).lastIndexOf(s.charAt(i));
                if(idx != -1){
                    answer[i] = i-idx;

                }
                else{
                    answer[i] = idx;
                }
            }
            else{
                answer[i] = -1;
            }
        }

        return answer;
    }

    //숫자 문자열과 영단어
    public int solution06(String s) {
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < 10; i++) {
            s = s.replace(word[i], num[i]);
        }
        return Integer.parseInt(s);
    }

    //코드 처리하기
    public String solution07(String code) {
        String answer = "";
        int mode = 0;

        for(int i = 0; i < code.length(); i++){
            if(code.charAt(i) == '1'){
                mode = 1 - mode;
            } else if (i % 2 == mode){
                answer += code.charAt(i);
            }
        }
        return "".equals(answer) ? "EMPTY" : answer;
    }

    //푸드 파이트 대회 (https://isshosng.tistory.com/165)
    public String solution08(int[] food) {
        String answer = "";
        String left = "";
        String right = "";

        for (int i = 1; i<food.length; i++){
            if(food[i] !=0){
                for (int j=0; j < (food[i]/2); j++){
                    left += Integer.toString(i);
                }
            }
        }

        StringBuffer sb = new StringBuffer(left);
        right = sb.reverse().toString();
        answer = left + "0" + right;

        return answer;
    }

    //K번째 수
    public int[] solution09(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }

    //문자열 내 마음대로 정렬하기
    public String[] solution10(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<>();

        for(int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(list);

        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }

        return answer;
    }

    //두 개 뽑아서 더하기
    public int[] solution11(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<numbers.length; i++){
            for(int j=i+1;j<numbers.length; j++){
                int a = numbers[i]+numbers[j];
                if (list.indexOf(a) < 0){
                    list.add(a);
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }

    //1차 비밀지도
    public String[] solution12(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String temp;

        for(int i = 0 ; i < n ; i++){
            temp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
            temp = temp.substring(temp.length() - n);
            temp = temp.replaceAll("1", "#");
            temp = temp.replaceAll("0", " ");
            answer[i] = temp;
        }

        return answer;
    }

    //영어 끝말잇기(https://zzang9ha.tistory.com/198)
    public int[] solution13(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<String>();
        boolean flag = true;

        for(int i=0; i<words.length; i++){
            if(list.contains(words[i])){   // 이전에 등장한 단어인경우
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                flag = false;
                break;
            }

            list.add(words[i]); // 현재 단어 리스트에 넣기

            // 이전 끝단어와 현재 첫단어가 다른경우 - 끝말잇기가 아닌경우
            if(i>0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                flag = false;
                break;
            }
        }
        if(flag) return new int[]{0, 0};
        return answer;
    }

    //점프와 순간이동
    public int solution14(int n) {
        int ans = 0;

        while(n != 0){
            if(n % 2 == 0){
                n /= 2;
            } else {
                n--;
                ans++;
            }
        }

        return ans;
    }

    //PCCE 1번
    public static void main(String[] args) {
        String msg =
                "Spring is beginning"
                ;
        int val1 =
                3
                ;
        String val2 =
                "3"
                ;

        System.out.println(msg);
        System.out.println(val1 + 10);
        System.out.println(val2 + "10");
    }

    //구명보트
    public int solution16(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int min = 0;

        for (int max = people.length - 1; min <= max; max--) {
            if (people[min] + people[max] <= limit) min++;
            answer++;
        }

        return answer;
    }

    //배열 조각하기
    public int[] solution17(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            } else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }

    //문자열 출력하기
    public static void solution18(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();


        System.out.println(a);
    }

    //콜라 문제 (https://isshosng.tistory.com/171)
    public int solution19(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            answer += (n/a) * b;
            n = (n/a) * b + (n%a);
        }
        return answer;
    }

    //예상 대진표 (https://velog.io/@js4183/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-Lv.2-%EC%98%88%EC%83%81-%EB%8C%80%EC%A7%84%ED%91%9C.java)
    public int solution20(int n, int a, int b) {
        int round = 0;
        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            round++;
        }
        return round;
    }
}
