import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution0402 {

    //수 조작하기1
    public int solution01(int n, String control) {
        int answer = 0;

        for (int i = 0; i < control.length(); i++) {
            switch (control.charAt(i)) {
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        return n;
    }

    //n 번째 원소까지
    public int[] solution02(int[] num_list, int n) {
        int[] answer = new int[n];

        for(int i = 0; i < n; i++){
            answer[i] = num_list[i];
        }
        return answer;
    }

    //뒤에서 5등까지
    public int[] solution03(int[] num_list) {
        int[] answer = new int[5];

        Arrays.sort(num_list);

        for(int i = 0; i < 5; i++){
            answer[i] = num_list[i];
        }
        return answer;
    }

    //A 강조하기
    public String solution04(String myString) {
        String answer = myString.toLowerCase().replaceAll("a", "A");
        return answer;
    }

    //n번째 원소부터
    public int[] solution05(int[] num_list, int n) {

        List<Integer> list = new ArrayList<>();

        for(int i = n - 1; i < num_list.length; i++){
            list.add(num_list[i]);
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    //배열 만들기1
    public int[] solution06(int n, int k) {

        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(i % k == 0){
                list.add(i);
            }
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    //rny_string
    public String solution07(String rny_string) {
        String answer = rny_string.replaceAll("m", "rn");
        return answer;
    }
}
