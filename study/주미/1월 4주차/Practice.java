public class Practice {

    // 최댓값과 최솟값
    public String solution01(String s) {

        String[] tmp = s.split(" ");
        int min, max, n;
        min = max = Integer.parseInt(tmp[0]);
        for (int i = 1; i < tmp.length; i++) {
            n = Integer.parseInt(tmp[i]);
            if(min > n) min = n;
            if(max < n) max = n;
        }

        return min + " " + max;

    }

    // 무작위로 K개의 수 뽑기
    public int[] solution02(int[] arr, int k) {
        int[] answer = new int[k];
        List<Integer> list = new ArrayList<>();
        int[] kArr = Arrays.stream(arr).distinct().toArray();
        int len = kArr.length;
        for(int i =0; i<answer.length; i++) {
            if(len != 0) {
                len --;
                answer[i] = kArr[i];
            }else {
                answer[i] = -1;
            }
        }
        return answer;
    }

    // 피타고라스의 정리
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (c*c) - (a*a);

        System.out.println(b_square);
    }

    // 직사각형 별찍기
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // 정사각형으로 만들기
    public int[][] solution05(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        if (row > col) {
            int[][] temp = new int[row][row];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    temp[i][j] = arr[i][j];
                }
                temp[i][col] = 0;
            }
            return temp;
        } else if (col > row) {
            int[][] temp = new int[col][col];
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < row; j++) {
                    temp[j][i] = arr[j][i];
                }
                temp[row][i] = 0;
            }
            return temp;
        } else {
            return arr;
        }
    }
    // 나이계산
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals(
                "Korea"
        )) {
            answer =
                    2030-year+1
            ;
        }
        else if (age_type.equals("Year")) {

            answer=2030-year
            ;
        }

        System.out.println(answer);
    }
    // a와 b 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
    // JadenCase 문자열 만들기
    public String solution08(String s) {

        s = s.toLowerCase(); //처음부터 다 소문자로 바꿔버리기

        StringTokenizer st = new StringTokenizer(s, " ", true);
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            // 만약 단어가 공백이면 그대로 출력해주고
            if (word.equals(" "))
                sb.append(word);
            else { //아니라면 첫글자 대문자 변환해주기
                sb.append(word.substring(0, 1).toUpperCase() + word.substring(1));
            }
        }
        return sb.toString();
    }

    //https://songsunkite.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-JadenCase-%EB%AC%B8%EC%9E%90%EC%97%B4-%EB%A7%8C%EB%93%A4%EA%B8%B0-JAVA


    // 문자열 겹쳐쓰기
    public String solution09(String my_string, String overwrite_string, int s) {
        String answer = "";

        int l = overwrite_string.length();
        int l2 = my_string.length();

        answer = my_string.substring(0,s)+ overwrite_string+my_string.substring(s+l,l2);



        return answer;
    }
    // 그림 확대
    public String[] solution10(String[] picture, int k) {
        int rows = picture.length;
        int cols = picture[0].length();

        int newRows = rows * k;
        int newCols = cols * k;

        String[] newPicture = new String[newRows];

        for (int i = 0; i < newRows; i++) {
            StringBuilder sb = new StringBuilder();
            int row = i / k;

            for (int j = 0; j < newCols; j++) {
                int col = j / k;
                char pixel = picture[row].charAt(col);
                sb.append(pixel);
            }

            newPicture[i] = sb.toString();
        }

        return newPicture;
    }
    // 최솟값 만들기
    public int solution11(int []A, int []B)
    {  int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<A.length;i++) {

            answer=answer+(A[i]*B[A.length-i-1]);

        }
        System.out.println(answer);

        return answer;
    }
    // 최대공약수와 최소공배수
    // 최대공약수 구하는 함수 (유클리드 호제법)
    int gcd(int n, int m) {
        int r;
        while(m > 0) {
            r = n % m;
            n = m;
            m = r;
        }
        return n;
    }

    public int[] solution12(int n, int m) {
        int[] answer = new int[2];

        // 두 수에서 더 큰 수를 n으로 지정
        if(n < m) {
            int temp = n;
            n = m;
            m = temp;
        }

        // 최대공약수 구하기
        answer[0] = gcd(n, m);

        // 최소공배수 구하기
        answer[1] = n * m / answer[0];

        return answer;
    }
    //https://velog.io/@hi_potato/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%B5%9C%EB%8C%80%EA%B3%B5%EC%95%BD%EC%88%98%EC%99%80-%EC%B5%9C%EC%86%8C%EA%B3%B5%EB%B0%B0%EC%88%98-JAVA


    // 올바른 괄호
    boolean solution13(String s) {
        int openCount = 0;
        int closeCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openCount++;
            } else if (s.charAt(i) == ')') {
                closeCount++;
            }
            if (openCount < closeCount) {
                return false;
            }
        }
        if (openCount == closeCount) {
            return true;
        }
        return false;
    }


    // 외계어 사전
    public int solution14(String[] spell, String[] dic) {
        boolean wordCheck = false;
        for (String word : dic) {
            int count = 0;
            for (String s : spell) {
                if (word.contains(s)) count++;
            }
            if (count == spell.length) {
                wordCheck = true;
                break;
            }
        }
        return wordCheck ? 1 : 2;
    }

    //https://velog.io/@yuki-kim/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%99%B8%EA%B3%84%EC%96%B4-%EC%82%AC%EC%A0%84-Java


    // 같은 숫자는 싫어
    public int[] solution15(int []arr) {
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        //
        int value = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != value) {
                answerList.add(arr[i]);
                value = arr[i];
            }
        }
        return answerList.stream().mapToInt(i->i).toArray();
    }

    // https://velog.io/@hong-brother/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EA%B0%99%EC%9D%80-%EC%88%AB%EC%9E%90%EB%8A%94-%EC%8B%AB%EC%96%B4JAVA-Level1


    // 가습기
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

    public int solution(String mode_type, int humidity, int val_set) {
        int answer = 0;

        if(mode_type.equals("auto")){
            answer = func
            2(humidity)
            ;
        }
        else if(mode_type.equals("target")){
            answer = func
            1(humidity, val_set)
            ;
        }
        else if(mode_type.equals("minimum")){
            answer = func
            3(humidity, val_set)
            ;
        }

        return answer;
    }


    // 이진 변환 반복하기
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

    //https://parkjye.tistory.com/81


    // 종이자르기

    public int solution18(int M, int N) {

        int answer = M * N - 1;
        return answer;

    }

    // 캐릭터의 좌표
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

    // 직사각형 넓이 구하기

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

//https://velog.io/@yuki-kim/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%A7%81%EC%82%AC%EA%B0%81%ED%98%95-%EB%84%93%EC%9D%B4-%EA%B5%AC%ED%95%98%EA%B8%B0-Java
}


