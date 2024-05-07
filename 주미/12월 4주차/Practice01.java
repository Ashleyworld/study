public class Practice01 {

    //ㅈㅏ릿수 더하기
    public int solution01(int n) {

        int answer = 0;
        String s = Integer.toString(n);

        for(int i=0; i<s.length(); i++){
            answer += Integer.parseInt(s.substring(i, i+1));
        }
        return answer;

    }

    //자연수 뒤집어 배열로 만들기

    public int[] solution02(long n) {
        String s = String.valueOf(n);

        int[] answer = new int[s.length()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(s.substring(answer.length-1-i, answer.length-i));
        }

        return answer;

    }


    // 문자열 정렬하기(2)

    public String solution03(String my_string) {
        my_string = my_string.toLowerCase();

        char[] chArr = my_string.toCharArray();
        Arrays.sort(chArr);

        String answer = new String(chArr);
        return answer;

    }

    // 9로 나눈 나머지

    public int solution04(String number) {
        int answer = 0;
        int sum = 0;
        String[] number_list = number.split("");
        for(int i = 0; i<number_list.length; i++){
            sum+=Integer.parseInt(number_list[i]);
        }
        answer = sum%9;
        return answer;
    }

    // 정수 제곱근 판별

    public long solution05(long n) {
        long answer = 0;

        double sqrt = Math.sqrt(n);

        if(sqrt % 1 == 0) {
            answer = (long) Math.pow(sqrt + 1, 2);
        }
        else answer = -1;

        return answer;


    }

    // 정수 내림차순으로 배치하기
    public long solution06(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
    }

    //하샤드 수

    public boolean solution07(int x) {
        boolean answer = true;
        int num = x;
        int sum = 0;

        // 자릿수 합 구하기
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }

        // 하샤드 수 확인
        if(x % sum != 0) {
            answer = false;
        }

        return answer;
    }


    //합성수 찾기

    public int solution08(int n) {
        int answerCount = 0;
        for (int i = 4; i <= n; i++) {
            if (isValue(i)) answerCount++;
        }
        return answerCount;
    }

    public static boolean isValue(int number) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number) ; i++) {
            if (number % i == 0) count++;
        }
        return count >= 2;
    }

    // 세로 읽기

    public String solution09(String my_string, int m, int c) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i += m) {
            String sub = my_string.substring(i, i + m);
            result.add(sub);
        }

        String answer = "";
        for (String str : result) {
            answer += str.substring(c-1, c);
        }

        return answer;
    }

    // 수열과 구간 쿼리 1
    public int[] solution10(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            for (int i = start; i <= end; i++) {
                arr[i] += 1;
            }
        }

        return arr;
    }


    // 중복된 문자 제거
    public String solution11(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if(!answer.contains(String.valueOf(my_string.charAt(i)))){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    // 두 정수 사이의 합
    public long solution12(int a, int b) {
        long answer = 0;

        if(a < b){
            for(int i = a; i<= b; i++){
                answer += i;
            }
        }else if(a > b){
            for(int i = b; i <= a; i++){
                answer += i;
            }
        }else{
            answer = a;
        }

        return answer;
    }
    // 등차수열의 특정한 항만 더하기
    public int solution13(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i=0; i<included.length; i++){
            if(included[i]){
                answer += a+(d*i);
            }
        }
        return answer;
    }

    // 날짜비교하기
    public int solution14(int[] date1, int[] date2) {
        if (date1[0] < date2[0]) {
            return 1;
        } else if (date1[0] > date2[0]) {
            return 0;
        }else {
            if (date1[1] < date2[1]) {
                return 1;
            } else if (date1[1] > date2[1]) {
                return 0;
            } else {
                if (date1[2] < date2[2]) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }

    }

    // 문자열 섞기
    public String solution15(String str1, String str2) {
        String answer = "";

        for(int i =0; i<str1.length();i++){
            answer += str1.substring(i,i+1);
            answer += str2.substring(i,i+1);


        }

        return answer;
    }

    // 글자지우기
    public String solution16(String my_string, int[] indices) {
        String answer = "";

        // 1. my_string을 쉽게 접근할 수 있도록 문자열을 배열로
        String[] tmp = my_string.split("");

        //2. indices를 돌면서 지워야 할 값들을 비워둔다.
        for (int i = 0; i < indices.length; i++) {
            tmp[indices[i]] = "";
        }

        //3. 문자열을 하나로 합친다(빈 공간은 붙어도 어짜피 포함X, 단순 "")
        for (String x : tmp) {
            answer += x;
        }
        return answer;

    }

    // 이차원 배열 대각선 순회하기
    public int solution17(int[][] board, int k) {
        int answer = 0;
        for(int i =0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++) {
                if(i+j <= k) {
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }

    // 빈배열에 추가, 삭제하기
    public int[] solution18(int[] arr, boolean[] flag) {
        List<Integer> X = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                int num = arr[i];
                for (int j = 0; j < num * 2; j++) {
                    X.add(num);
                }
            } else {
                int num = arr[i];
                int size = X.size();
                if (size >= num) {
                    for (int j = 0; j < num; j++) {
                        X.remove(size - 1 - j);
                    }
                }
            }
        }

        int[] answer = new int[X.size()];
        for (int i = 0; i < X.size(); i++) {
            answer[i] = X.get(i);
        }

        return answer;
    }


/*
배열 arr과 flag를 인덱스 i를 기준으로 순회합니다.
flag[i]가 true인 경우 : arr[i] 값을 num 변수에 저장합니다.
num * 2번 만큼 num을 X 리스트에 추가합니다.
flag[i]가 false인 경우 : arr[i] 값을 num 변수에 저장합니다.
X 리스트의 현재 크기를 size 변수에 저장합니다.
X 리스트의 크기가 num보다 크거나 같은 경우 : num 개수만큼 X 리스트의 마지막 원소부터 제거합니다.
X 리스트의 원소를 배열 answer로 복사하여 반환합니다.
*/
    // 문자열 뒤집기
public String solution19(String my_string, int s, int e) {
    //해당 String을 뽑는다
    String answer = my_string.substring(s,e+1);

    //뒤집어서 다른 변수에 저장한다
    StringBuffer sb = new StringBuffer(answer);
    String reversedStr = sb.reverse().toString();

    //원본에다 뒤집은 걸 대체한다
    my_string = my_string.replaceAll(answer, reversedStr);
    return my_string;
}


// 참고링크: https://velog.io/@shin75492/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4JAVA-%EB%AC%B8%EC%9E%90%EC%97%B4-%EB%92%A4%EC%A7%91%EA%B8%B0

    // 음양 더하기
    public int solution20(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }

        return answer;
    }





}
