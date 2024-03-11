public class Practice {
    // 덧칠하기
    public int solution01(int n, int m, int[] section) {
        int start = section[0];
        int end = section[0] + (m-1);
        int ans = 1;

        for(int i : section){
            if(i>=start && i<=end)
                continue;
            else{
                start = i;
                end = i + (m-1);
                ans++;
            }

        }
        return ans;
    }


    // 분수의 덧셈
    public int[] solution02(int numer1, int denom1, int numer2, int denom2) {

        int numer = numer1*denom2 + numer2*denom1;
        int denom = denom1*denom2;


        for(int i = numer-1; i>1; i--){
            if (denom%i == 0 && numer%i ==0){
                numer /= i;
                denom /= i;
            }
        }

        int[] answer = {numer, denom};

        return answer;
    }

    // 실패율
    public int[] solution03(int N, int[] stages) {

        // 스테이지별 도달했으나 클리어하지 못한 사람 수
        int[] currentStages = new int[N + 1];
        // 스테이지별 도달한 사람 수
        int[] clearStages = new int[N + 1];

        for (int i = 0; i < stages.length; i++) {
            // 스테이지에 도달한 플레이어 수 증가
            for (int j = 0; j < stages[i]; j++) {
                clearStages[j] += 1;
            }
            // 도달 했으나 클리어하지 못한 플레이어 수 증가
            currentStages[stages[i] - 1] += 1;
        }

        // 스테이지 번호와 실패율을 저장할 map
        Map<Integer, Double> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            // 스테이지에 도달한 사람이 없거나 클리어한 사람이 없는 경우
            if (currentStages[i] == 0 || clearStages[i] == 0) {
                map.put(i + 1, 0.0);
            } else {
                // 실패율 계산하여 맵에 저장
                map.put(i + 1, (double) currentStages[i] / (double) clearStages[i]);
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        // 실패율을 기준으로 내림차순 정렬
        list.sort((o1, o2) -> Double.compare(map.get(o2), map.get(o1)));

        // 리스트를 배열로 변환하여 반환
        return list.stream().mapToInt(i -> i).toArray();
    }

    //https://ittrue.tistory.com/469


    //안전지대
    public int solution04(int[][] board) {
        ArrayList<int[]> list = new ArrayList<>();
        int answer = 0;
        int[] dx = {0,1,-1,0,-1,1,1,-1};
        int[] dy = {1,0,0,-1,-1,1,-1,1};

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 1){
                    int[] temp = {i,j};
                    list.add(temp);
                }
            }
        }

        for(int a = 0 ; a < list.size(); a++){
            int i = list.get(a)[0];
            int j = list.get(a)[1];
            for(int k = 0 ; k < 8; k++){
                if(dx[k] + i >= 0 && dy[k] + j >= 0 && dx[k] + i <= board.length-1 && dy[k] + j <= board.length-1)
                    board[dx[k] + i][dy[k] + j] = 1;
            }
        }

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 0) answer+=1;
            }
        }
        return answer;
    }

    //https://velog.io/@shin75492/프로그래머스JAVA-안전지대


    //주사위 게임3
    public int solution05(int a, int b, int c, int d) {
        int answer = 0;
        int[] nums=new int[4];
        nums[0]=a;
        nums[1]=b;
        nums[2]=c;
        nums[3]=d;

        int multi=1;

        Arrays.sort(nums);//오름차순 정렬
        int[] dice=new int[6];
        for(int i=0;i<4;i++){
            dice[nums[i]-1]++;
        }

        for(int i=0;i<6;i++){
            if(dice[i]==4){
                answer=1111*(i+1);
                break;
            }
            else if(dice[i]==3){
                for(int j=0;j<6;j++){
                    if(dice[j]==1){
                        answer=(10*(i+1)+(j+1))*(10*(i+1)+(j+1));
                        break;
                    }
                }
            }
            else if(dice[i]==2){
                for(int j=0;j<6;j++){
                    if(dice[j]==2){
                        if(i==j){
                            continue;
                        }
                        else{
                            answer=(i+1+j+1)*((i+1)-(j+1));
                            break;
                        }

                    }
                    else if(dice[j]==1){
                        multi=multi*(j+1);
                    }
                }
                if(multi!=1){
                    answer=multi;
                }
            }
            if(nums[0]!=nums[1] && nums[1]!=nums[2] && nums[2]!=nums[3]){
                answer=nums[0];
            }

        }

        return answer;
    }

    //https://velog.io/@dangdang/프로그래머스-주사위-게임-3


    // 옹알이(2)
    public int solution06(String[] babbling) {
        int ans = 0;

        for (int i=0; i<babbling.length; i++){
            babbling[i] = babbling[i].replace("ayaaya", "1");
            babbling[i] = babbling[i].replace("yeye", "1");
            babbling[i] = babbling[i].replace("woowoo", "1");
            babbling[i] = babbling[i].replace("mama", "1");


            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");

            babbling[i] = babbling[i].replace(" ","");


            if(babbling[i].length() == 0){
                ans++;
            }
        }

        return ans;
    }

    //https://isshosng.tistory.com/181


    // 다트게임
    public int solution07(String dartResult) {
        int answer = 0;
        int[] dart = new int[3];

        int n=0,idx=0;
        String numstr="";

        for(int i=0;i<dartResult.length();i++){
            char c = dartResult.charAt(i);

            //숫자일 때
            if(c>='0'&&c<='9'){
                numstr+=String.valueOf(c);

            }
            //보너스일 때
            else if(c=='S'||c=='D'||c=='T'){
                n=Integer.parseInt(numstr);
                if(c=='S'){
                    dart[idx++]=(int)Math.pow(n,1);
                }
                else if(c=='D'){
                    dart[idx++]=(int)Math.pow(n,2);
                }
                else{
                    dart[idx++]=(int)Math.pow(n,3);
                }
                numstr="";
            }
            //옵션일 때
            else {
                if(c=='*'){
                    dart[idx-1]*=2;
                    if(idx-2>=0) dart[idx-2]*=2;
                }
                else {
                    dart[idx-1]*=(-1);
                }
            }
        }

        answer=dart[0]+dart[1]+dart[2];

        return answer;
    }

    //https://yeoeun-ji.tistory.com/110

}
