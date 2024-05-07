import java.util.Arrays;
import java.util.HashMap;

public class Solution0303 {

    // 겹치는 선분의 길이
    public int solution01(int[][] lines) {
        // 1. arr 배열 및 변수 초기화
        int[] arr = new int[200];
        int answer = 0;

        // 2. lines 정보를 arr 배열에 적용
        for(int i = 0; i < lines.length; i++)
            for(int j = lines[i][0] + 100; j < lines[i][1] + 100; j++)
                arr[j]++;

        // 3. arr 배열에서 겹친 부분 세기
        for(int i = 0; i < 200; i++)
            if(arr[i] > 1)
                answer++;

        return answer;
    }

    //로또의 최고 순위와 최저 순위(https://ittrue.tistory.com/474)
    public int[] solution02(int[] lottos, int[] win_nums) {
        // 순위에 따른 당첨 개수를 담은 배열
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        // 결과를 담을 배열, answer[0]: 최고 순위, answer[1]: 최저 순위
        int[] answer = new int[2];

        for (int i = 0; i < lottos.length; i ++) {
            if (lottos[i] == 0) {
                // 0인 경우, 알 수 없는 번호로 간주하여 최고 순위 증가
                answer[0]++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    // 일치하는 번호가 있으면 최고 순위와 최저 순위 모두 증가
                    answer[0]++;
                    answer[1]++;
                }
            }
        }

        // 순위에 따른 등수로 변환
        answer[0] = rank[answer[0]];
        answer[1] = rank[answer[1]];

        return answer;
    }

    //문자열 나누기
    public int solution03(String s) {

        int answer = 0;

        char first = s.charAt(0);
        int firstNum = 0;
        int diff = 0;

        for (int i = 0; i < s.length(); i++) {
            if (firstNum == diff) {
                answer++;
                first = s.charAt(i);
            }
            if (s.charAt(i) == first) firstNum++;
            else diff++;
        }
        return answer;
    }

    //대충만든 자판(https://velog.io/@se_bb/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4Java-%EB%8C%80%EC%B6%A9-%EB%A7%8C%EB%93%A0-%EC%9E%90%ED%8C%90)
    public int[] solution04(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();

        // keymap 위 모든 알파벳의 최소 클릭 수 구하기
        for(int i=0;i<keymap.length;i++){


            // 최소 클릭수로 덮어씌우기 위해 문자열 끝부터 시작
            for(int j=0;j<keymap[i].length();j++){


                if (map.containsKey(keymap[i].charAt(j))) {
                    // 최소 클릭 수가 뒤에 나왔을 때 갱신
                    Integer nCurrCnt = map.get(keymap[i].charAt(j));
                    if (nCurrCnt > (j+1)){
                        map.put(keymap[i].charAt(j),j+1);
                    }
                }
                else {
                    map.put(keymap[i].charAt(j),j+1);
                }

            }
        }


        // 모든 targets 단어에 대해 반복
        for(int i=0;i<targets.length;i++){
            int nCnt = 0;
            for(int j=0;j<targets[i].length();j++){
                char alpha = (targets[i].charAt(j));
                Integer nMinClick = map.get(alpha);
                if ( nMinClick != null ) {
                    nCnt += nMinClick;
                }
                else{
                    nCnt = -1;  // i번째 단어는 작성할 수 없음
                    break;
                }
            }
            answer[i] = nCnt;

        }



        return answer;
    }

    //체육복
    public int solution05(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌 체육복을 가져온 학생이 도난당한 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        // 도난당한 학생에게 체육복 빌려주는 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }

    //숫자 짝궁(https://hy-ung.tistory.com/m/89)
    public String solution06(String X, String Y) {
        HashMap<Integer, Integer> xmap = new HashMap<>();
        HashMap<Integer, Integer> ymap = new HashMap<>();

        for(String data : X.split("")){
            int cur = Integer.parseInt(data);
            xmap.put(cur, xmap.getOrDefault(cur, 0) + 1);
        }

        for(String data : Y.split("")){
            int cur = Integer.parseInt(data);
            ymap.put(cur, ymap.getOrDefault(cur, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 9; i >= 0 ; i --){
            if(xmap.containsKey(i) && ymap.containsKey(i)){
                int cnt = Math.min(xmap.get(i), ymap.get(i));
                for (int j = 0; j < cnt; j++) {
                    sb.append(i);
                }
            }
        }

        if(sb.toString().startsWith("0")){
            return "0";
        }
        else if(sb.toString().equals("")){
            return "-1";
        }

        return sb.toString();
    }

    //완주하지 못한 선수(https://coding-grandpa.tistory.com/76)
    public String solution07(String[] participant, String[] completion) {
        // 1. 두 배열을 정렬한다
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 2. 두 배열이 다를 때까지 찾는다
        int i = 0;
        for(i=0;i<completion.length;i++)
            if(!participant[i].equals(completion[i]))
                break;


        // 3. 여기까지 왔다는 것은 마지막 주자가 완주하지 못했다는 의미이다.
        return participant[i];
    }
}
