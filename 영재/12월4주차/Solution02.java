import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution02 {
    public int solution01(int n) { //자릿수 더하기
        int answer = 0;
        String[] arr = String.valueOf(n).split("");

        for(String str : arr){
            answer += Integer.parseInt(str);
        }

        return answer;
    }

    public List solution02(long n) { //자연수 뒤집어 배열로 만들기
        List<Integer> answer = new ArrayList<>();
        String[] arr = Long.toString(n).split("");

        for(int i = 0; i < arr.length; i++){
            answer.add(Integer.parseInt(arr[arr.length-i-1]));
        }
        return answer;
    }

    public String solution03(String my_string) { //문자열 정렬
        String answer = "";

        List<Character> list = new ArrayList<>();

        for(int i = 0; i < my_string.length(); i++){
            list.add(my_string.toLowerCase().charAt(i));
        }

        Collections.sort(list);

        for(Character item : list){
            answer += item;
        }

        return answer;
    }

    public int solution04(String number) { //9로 나눈 나머지
        int answer = 0;
        for(int i = 0; i < number.length(); i++){
            answer += number.charAt(i) - '0';
        }
        return answer % 9;
    }

    public long solution05(long n) { //정수 제곱근 판별
        long answer = 0;

        double sqrt = Math.sqrt(n);

        if(sqrt % 1 == 0){
            answer = (long) Math.pow(sqrt + 1, 2); // 첫번째 인수를 두번째 인수만큼 곱해줌
        } else {
            answer = -1;
        }
        return answer;
    }

    public long solution06(long n) { //정수 내림차순으로 배치
        long answer = 0;

        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());

        String str = "";
        for(String s : arr){
            str += s;
        }

        answer = Long.parseLong(str);

        return answer;
    }

    public boolean solution07(int x) { //하샤드 수
        boolean answer = true;

        String[] arr = Integer.toString(x).split("");
        int y = 0;

        for(String s : arr){
            y += Integer.parseInt(s);
        }

        if(x % y != 0){
            answer = false;
        }
        return answer;
    }

    public int solution08(int n) { //합성수 찾기
        int answer = 0;

        for(int i = 1; i <= n; i++){
            int count = 0;
            for(int j = 1; j <= n; j++){
                if(i % j ==0){
                    count++;
                }
            }

            if(count >= 3){
                answer++;
            }
        }
        return answer;
    }

    public String solution09(String my_string, int m, int c) { //세로 읽기

        String answer = "";
        String[] arr = my_string.split("");

        for(int i = c - 1; i < arr.length; i += m){
            answer += arr[i];
        }

        return answer;
    }

    public int[] solution10(int[] arr, int[][] queries) { //수열과 구간 쿼리1

        for(int i = 0; i < queries.length; i++){
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                arr[j]++;
            }
        }
        return arr;
    }

    public String solution11(String my_string) { //중복된 문자제거
        String answer = "";

        for(int i = 0; i < my_string.length(); i++){
            if(my_string.indexOf(my_string.charAt(i)) == i){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    public long solution12(int a, int b) { // 두 정수 사이의 합
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

    public int solution13(int a, int d, boolean[] included) { //등차수열의 특정 항만 더하기
        int answer = 0;
        for(int i = 1; i <= included.length; i++){
            if(included[i - 1] == true)
                answer += (a + (i - 1) * d);
        }
        return answer;
    }

    public int solution14(int[] date1, int[] date2) { //날짜 비교하기
        int answer = 0;

        if(date1[0] != date2[0]){
            answer = date1[0] < date2[0] ? 1 : 0;
        } else if(date1[1] != date2[1]){
            answer = date1[1] < date2[1] ? 1 : 0;
        } else if(date1[2] != date2[2]){
            answer = date1[2] < date2[2] ? 1 : 0;
        }
        return answer;
    }

    public String solution15(String str1, String str2) { //문자열 섞기
        String answer = "";

        for(int i = 0; i < str1.length(); i++){

            answer += str1.charAt(i);

            answer += str2.charAt(i);

        }

        return answer;
    }

    public String solution16(String my_string, int[] indices) { //글자 지우기
        String answer = "";

        String[] arr = my_string.split("");

        for(int i = 0; i < indices.length; i++){
            arr[indices[i]] = "";
        }

        for(String s : arr){
            answer += s;
        }
        return answer;
    }

    public int solution17 (int[][] board, int k) { //이차열 배열 대각선 순회
        int answer = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(i + j <= k){
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }

    public List solution18(int[] arr, boolean[] flag) { //빈 배열에 추가 삭제
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(flag[i]){
                int num = arr[i];
                for(int j = 0; j < num * 2; j++){
                    answer.add(num);
                }
            } else {
                int num = arr[i];
                int size = answer.size();
                if(size >= num){
                    for(int j = 0; j < num; j++){
                        answer.remove(size - 1 - j);
                    }
                }
            }
        }
        return answer;
    }

    public String solution19(String my_string, int s, int e) { //문자열 뒤집기
        String answer = my_string.substring(s, e + 1);

        StringBuffer sb = new StringBuffer(answer);
        String str = sb.reverse().toString();

        my_string = my_string.replaceAll(answer, str);

        return my_string;
    }

    public int solution20(int[] absolutes, boolean[] signs) { //음양 더하기
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
}
