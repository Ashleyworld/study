import java.util.Arrays;

public class Solution0503 {

    //문자열 뒤집기
    public String solution01(String my_string) {
        String answer = "";
        StringBuffer sb = new StringBuffer(my_string);
        sb.reverse();
        return sb.toString();
    }

    //배열의 유사도
    public int solution02(String[] s1, String[] s2) {
        int answer = 0;

        for(int i = 0; i < s1.length; i++){
            for(int j = 0; j < s2.length; j++){
                if(s1[i].equals(s2[j])){
                    answer++;

                }
            }
        }
        return answer;
    }

    //주사위 개수
    public int solution03(int[] box, int n) {
        int answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
        return answer;
    }

    //삼각형의 완성조건
    public int solution04(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);

        if(sides[2] < sides[0] + sides[1]){
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }

    //특별한 이차원배열
    public int[][] solution05(int n) {
        int[][] answer = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    answer[i][j] = 1;
                }
            }
        }
        return answer;
    }

    //간단한 식 계산하기
    public int solution06(String binomial) {
        int answer = 0;
        String[] arr = binomial.split(" ");

        switch(arr[1]){
            case "+" : answer = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]); break;
            case "-" : answer = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]); break;
            case "/" : answer = Integer.parseInt(arr[0]) / Integer.parseInt(arr[2]); break;
            case "*" : answer = Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]); break;
        }
        return answer;
    }

    //접미사 배열
    public String[] solution07(String my_string) {
        String[] answer = new String[my_string.length()];

        for(int i = 0; i < my_string.length(); i++){
            answer[i] = my_string.substring(i);
        }

        Arrays.sort(answer);
        return answer;
    }
}
