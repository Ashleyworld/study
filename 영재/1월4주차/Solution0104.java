import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution0104 {

    //최대값과 최소값
    public String solution01(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);

        for(int i = 0; i < arr.length; i++){
            int num = Integer.parseInt(arr[i]);

            if(min > num){
                min = num;
            }
            if(max < num){
                max = num;
            }
        }

        answer = min + " " + max;
        return answer;
    }

    //무작위로 k개의 수 뽑기
    public List<Integer> solution02(int[] arr, int k) {
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(answer.size() == k){
                break;
            }
            if(!answer.contains(arr[i])){
                answer.add(arr[i]);
            }
        }

        while (answer.size() < k){
            answer.add(-1);
        }
        return answer;
    }

    //PCCE 2번
    public void solution03() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (c * c) - (a * a);

        System.out.println(b_square);
    }

    // 직사각형 별찍기
    public void solution04() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 1; i <= b; i++){
            for(int j = 1; j <= a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //정사각형으로 만들기
    public int[][] solution05(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] answer;

        if(rows > cols){
            answer = new int[rows][rows];
            for(int i = 0; i < rows; i++)
                for(int j =0; j <cols; j++){
                    answer[i][j] = arr[i][j];
                }
        } else if(cols > rows){
            answer = new int[cols][cols];
            for(int i = 0; i < rows; i++){
                for(int j  = 0; j < cols; j++){
                    answer[i][j] = arr[i][j];
                }
            }
        } else {
            answer = arr;
        }
        return answer;
    }

    //PCCE3
    public void solution06() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals(
                "Korea"
        )) {
            answer =
                    2030 - year + 1
            ;
        }
        else if (age_type.equals("Year")) {

            answer = 2030 - year
            ;
        }

        System.out.println(answer);
    }

    //a와b 출력하기
    public void solution07() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    //JadenCase 문자열 만들기
    public String solution08(String s) {
        String answer = "";
        String[] arr = s.toLowerCase().split("");
        boolean isStr = true;

        for(String str : arr){
            answer += isStr ? str.toUpperCase() : str;
            isStr = str.equals(" ") ? true : false;
        }
        return answer;
    }

    //문자열 겹쳐쓰기
    public String solution09(String my_string, String overwrite_string, int s) {
        String answer = "";
        return my_string.substring(0, s) + overwrite_string + my_string.substring(overwrite_string.length() + s);
    }

    //그림 확대
    public String[] solution10(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < picture.length; i++) {
            String[] enlarge = picture[i].split("");
            String str = "";
            for (int j = 0; j < enlarge.length; j++) {
                str += enlarge[j].repeat(k);
            }
            for (int j = 0; j < k; j++) {
                list.add(str);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    //최솟값 만들기
    public int solution11(int []A, int []B){
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i < A.length; i++){
            answer = answer + (A[i] * B[A.length - i -1]);
        }

        return answer;
    }

    //최대공약수와 최소공배수
    public int[] solution12(int n, int m) {

        int max = Math.max(n, m);
        int min = Math.min(n, m);

        while(min != 0){
            int r = max % min;
            max = min;
            min = r;
        }

        int gcd = n * m / max;


        int[] answer = {max, gcd};
        return answer;
    }

    //올바른 괄호
    boolean solution13(String s) {
        boolean answer = true;

        int open = 0;
        int close = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                open++;
            } else if(s.charAt(i) == ')'){
                close++;
            }

            if(open < close){
                return false;
            }
        }

        if(open == close){
            return true;
        }

        return false;
    }

    //외계어 사전
    public int solution14(String[] spell, String[] dic) {
        int answer = 0;
        boolean check = false;

        for(int i = 0; i < dic.length; i++){
            int count = 0;
            for(int j = 0; j < spell.length; j++){
                if(dic[i].contains(spell[j])){
                    count++;
                }
            }
            if(count == spell.length){
                check = true;
                break;
            }
        }
        return check ? 1 : 2;
    }

    //같은 숫자는 싫어
    public int[] solution15(int []arr) {
        int[] answer = {};

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                temp.add(arr[i]);
            } else {
                if (arr[i] != arr[i - 1]) {
                    temp.add(arr[i]);
                }
            }
        }

        answer = new int[temp.size()];
        int size = 0;
        for (int a : temp) {
            answer[size++] = a;


        }
        return answer;
    }

    //PCCE7
    public int func1(int humidity, int val_set){
        if(humidity < val_set)
            return
                    3
                    ;
        return 1;
    }

    public int func2(int humidity){
        if(humidity >= 50)
            return 0;
        else if (humidity >= 40)
            return 1;
        else if (humidity >= 30)
            return 2;
        else if (humidity >= 20)
            return 3;
        else if (humidity >= 10)
            return 4;

        else


            return 5
                    ;
    }

    public int func3(int humidity, int val_set){
        if(humidity < val_set)
            return 1;
        return
                0
                ;
    }

    public int solution16(String mode_type, int humidity, int val_set) {
        int answer = 0;

        if(mode_type.equals("auto")){
            answer = func2(humidity)
            ;
        }
        else if(mode_type.equals("target")){
            answer = func1(humidity, val_set)
            ;
        }
        else if(mode_type.equals("minimum")){
            answer = func3(humidity, val_set)
            ;
        }

        return answer;
    }

    //이진변환 반복하기
    public int[] solution17(String s) {
        int[] answer = new int[2];

        while(s.length() > 1) {

            int cntOne = 0;
            for(int i=0; i<s.length(); i++) {

                if(s.charAt(i) == '0') answer[1]++;
                else cntOne++;
            }

            s = Integer.toBinaryString(cntOne);
            answer[0]++;
        }

        return answer;
    }

    //종이자르기
    public int solution18(int M, int N) {

        return M * N - 1;

    }

    //캐릭터의 좌표
    public int[] solution19(String[] keyinput, int[] board) {
        int[] answer = {0, 0};

        for(int i = 0; i < keyinput.length; i++) {
            if(keyinput[i].equals("left")) {
                answer[0]--;
                if(answer[0] < -(int)(board[0] / 2))
                    answer[0] = -(int)(board[0] / 2);
            } else if (keyinput[i].equals("right")) {
                answer[0]++;
                if(answer[0] > (int)(board[0] / 2))
                    answer[0] = (int)(board[0] / 2);
            } else if (keyinput[i].equals("up")) {
                answer[1]++;
                if(answer[1] > (int)(board[1] / 2))
                    answer[1] = (int)(board[1] / 2);
            } else {
                answer[1]--;
                if(answer[1] < -(int)(board[1] / 2))
                    answer[1] = -(int)(board[1] / 2);
            }
        }

        return answer;
    }

    //직사각형의 넓이구하기
    public int solution20(int[][] dots) {
        int w = 0;
        int h = 0;
        int x = dots[0][0];
        int y = dots[0][1];
        for (int i = 1; i < dots.length; i++) {
            if (x != dots[i][0]) w = Math.abs(x - dots[i][0]);
            if (y != dots[i][1]) h = Math.abs(y - dots[i][1]);
        }
        return w * h;
    }
}
