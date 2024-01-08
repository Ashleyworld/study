import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Solution0101 {

    //음양더하기
    public int solution01(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i = 0; i < absolutes.length; i++){
            if(signs[i]){
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }

    //콜라츠 추측
    public int solution02(long num) {
        int answer = 0;

        while(num != 1){
            if(num % 2 == 0){
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;

            if(answer >= 500){
                answer = -1;
                break;
            }
        }

        return answer;
    }

    //1로 만들기
    public int solution03(int[] num_list) {
        int answer = 0;

        for(int i = 0; i < num_list.length; i++){
            while(num_list[i] != 1){
                if (num_list[i] % 2 == 0) {
                    num_list[i] /= 2;
                } else {
                    num_list[i] = (num_list[i] - 1) / 2;
                }

                answer++;
            }
        }
        return answer;
    }

    //서울에서 김서방 찾기
    public String solution04(String[] seoul) {
        String answer = "";

        for(int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer += "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }

    // 2차원으로 만들기

    public int[][] solution05(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int index = 0;

        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < answer[i].length; j++){
                answer[i][j] = num_list[index];
                index++;
            }
        }
        return answer;
    }

    //배열 만들기5
    public int[] solution06(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            int num = Integer.parseInt(intStrs[i].substring(s, s + l));
            if(num > k){
                list.add(num);
            }
        }
        int[] answer =  new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    //나누어 떨어지는 숫자배열
    public List solution07(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer.add(arr[i]);
            }
        }

        if(answer.isEmpty()){
            answer.add(-1);
        }

        answer.sort((o1, o2) -> o1 - o2);
        return answer;
    }

    //A로 B 만들기
    public int solution08(String before, String after) {
        int answer = 0;
        char[] cArr1 = before.toCharArray();
        char[] cArr2 = after.toCharArray();

        Arrays.sort(cArr1);
        Arrays.sort(cArr2);

        String str1 = String.valueOf(cArr1);
        String str2 = String.valueOf(cArr2);

        if(str1.equals(str2)){
            answer = 1;
        }
        return answer;
    }

    //수열과 구간 쿼리 3
    public int[] solution09(int[] arr, int[][] queries) {
        int[] answer = {};
        int n = 0;
        for(int i =0; i<queries.length; i++){
            n = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = n;
        }
        return arr;
    }

    //팩토리얼
    public int solution10(int n) {
        int answer = 0;
        int factorial = 1;

        for(int i = 1; i <= 10; i++){
            factorial *= i;

            if(factorial == n){
                answer = i;
                break;
            } else if(n < factorial){
                answer = (i - 1);
                break;
            }
        }
        return answer;
    }

    //k의 개수
    public int solution11(int i, int j, int k) {
        int answer = 0;
        String iStr = "";

        for(int a = i; a <= j; a++){
            iStr += Integer.toString(a);
        }

        String[] arr = iStr.split("");

        for(int a = 0; a < arr.length; a++){
            if(arr[a].equals(Integer.toString(k))){
                answer++;
            }
        }
        return answer;
    }

    //없는 숫자 더하기
    public int solution12(int[] numbers) {
        int answer = 45;

        for(int n : numbers){
            answer -= n;
        }
        return answer;
    }

    //모스부호 1
    public String solution13(String letter) {
        String answer = "";

        String[] morse = {
                ".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-",
                "-.--","--.."
        };

        int ascii = 97;
        String[] alphabets = letter.split(" ");
        for (String alphabet : alphabets) {
            for (int i = 0; i < morse.length; i++) {
                if (morse[i].equals(alphabet)) {
                    answer += (char)(ascii + i);
                }
            }
        }

        return answer;
    }

    //문자열이 몇번 등장하는지 세기
    public int solution14(String myString, String pat) {
        int answer = 0;

        for(int i = 0; i < myString.length(); i++){
            String res = "";
            for(int j = i; j < myString.length(); j++){
                char ch = myString.charAt(j);
                res += ch;

                if(res.equals(pat)){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }

    //핸드폰번호 가리기
    public String solution15(String phone_number) {
        String answer = "";

        for(int i = 0; i < phone_number.length(); i++){
            if(i < phone_number.length() - 4){
                answer += "*";
            } else {
                answer += phone_number.charAt(i);
            }
        }
        return answer;
    }

    //숨어있는 숫자의 덧셈2
    public int solution16(String my_string) {
        int answer = 0;
        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for (String s : str) {
            if (!s.equals("")) {
                answer += Integer.parseInt(s);
            }
        }

        return answer;
    }

    //가까운 수
    public int solution17(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);

        for(int i = 1; i < array.length; i++){
            if(Math.abs(n-array[0]) > Math.abs(n - array[i])){
                array[0] = array[i];
            }
        }

        answer = array[0];
        return answer;
    }

    //간단한 논리연산
    public boolean solution18(boolean x1, boolean x2, boolean x3, boolean x4) {
        if((x1 || x2) && (x3 || x4)){
            return true;
        } else {
            return false;
        }
    }

    //진료 순서 정하기
    public int[] solution19(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < emergency.length; i++){
            for(int j = 0; j <emergency.length; j++){
                if(emergency[i] < emergency[j]){
                    answer[i]++;
                }
            }
            answer[i]++;
        }
        return answer;
    }

    //배열의 길이를 2의 거듭제곱으로 만들기
    public int[] solution20(int[] arr) {
        int pow = 0;
        while(arr.length > Math.pow(2, pow)){
            pow++;
        }

        int[] answer = new int[(int) Math.pow(2, pow)];

        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }

}
