public class Practice {

    // 2016년
    public String solution01(int a, int b) {
        String day = "" ;

        Calendar cal = Calendar.getInstance();
        cal.set(2016,a -1,b);
        int dayNum = cal.get(Calendar.DAY_OF_WEEK);
        switch(dayNum){
            case 1: day = "SUN";
                break;ß
            case 2: day = "MON";
                break;
            case 3: day = "TUE";
                break;
            case 4: day = "WED";
                break;
            case 5: day = "THU";
                break;
            case 6: day = "FRI";
                break;
            case 7: day = "SAT";
                break;
        }
        return day ;
    }

// 폰켓몬


    public int solution02(int[] nums) {
        int max = nums.length / 2;

        // 중복제거하기
        HashSet<Integer> numsSet = new HashSet<>();

        for (int num : nums) {
            numsSet.add(num);
        }

        // 중복을 제거한 셋의 크기가 max보다 크면 max를, 작으면 numsSet의 size를 리턴
        if (numsSet.size() > max) {
            return max;
        } else {
            return numsSet.size();
        }

    }

// 다음에 올 숫자

    public int solution03(int[] common) {
        int answer = 0;

        if((common[1] - common[0]) == (common[2] - common[1])) // 등차수열일 경우
            answer = common[common.length-1] + (common[1] - common[0]);
        else // 등비수열일 경우
            answer = common[common.length-1] * (common[1] / common[0]);

        return answer;
    }

    // 모의고사
    public int[] solution04(int[] answers) {
        int[] first = {1,2,3,4,5}; // 5개씩 반복
        int[] second = {2,1,2,3,2,4,2,5}; // 8개씩 반복
        int[] third = {3,3,1,1,2,2,4,4,5,5}; // 10개씩 반복
        int[] score = {0,0,0}; // 각 수포자들의 점수

        // 수포자들의 점수 계산
        for(int i=0; i<answers.length; i++) {
            if(answers[i] == first[i%5]) score[0]++;
            if(answers[i] == second[i%8]) score[1]++;
            if(answers[i] == third[i%10]) score[2]++;
        }

        // 최대 점수 구하기
        int max = Math.max(score[0], Math.max(score[1], score[2]));

        // 최대 점수를 가진 수포자 리스트 생성
        List<Integer> answ = new ArrayList<Integer>();
        for(int i=0; i<score.length; i++) if(max == score[i]) answ.add(i+1);

        int[] answer = new int[answ.size()];
        for(int i=0; i<answ.size(); i++){
            answer[i] = answ.get(i);
        }

        return answer;
    }

    //https://velog.io/@hi_potato/프로그래머스-모의고사-JAVA


    // 과일장수
    public int solution05(int k, int m, int[] score) {
        //k = 최상품가격, m개씩
        int answer = 0;
        int len = score.length;

        //제한사항
        if(k<3  k>9  m <3  m > 10  len <7 len > 1000000)
        return answer;

        for(int n:score){
            if(n < 0  n > 1000000)
            return answer;
        }

        //시작
        Arrays.sort(score);

        for(int i=len-m; i >= 0; i-=m){
            answer = answer + m * score[i];
        }

        return answer;
    }
    // https://velog.io/@e-7281998/프로그래머스-Lv1.과일장수-java


    //기사단원의 무기
    public int solution06(int number, int limit, int power) {
        int answer = 0;

        for(int i=1;i<=number;i++){
            int cnt = 0;
            for(int j=1;j*j<=i;j++){
                if(j*j==i) cnt++;
                else if(i%j==0) cnt+=2;
            }

            if(cnt>limit) cnt = power;
            answer += cnt;
        }

        return answer;
    }

    //https://velog.io/@gale4739/프로그래머스-기사단원의-무기


    //연속된 수의 합
    public int[] solution07(int num, int total) {
        int[] answer = new int[num];
        int start = (total/num) - ((num - 1)/2);

        for(int i = 0; i < num; i++) {
            answer[i] = start;
            start++;
        }

        return answer;
    }


//소수만들기
public int solution08(int[] nums) {
    int answer = 0;

    // 합을 저장할 저장공간 선언
    ArrayList<Integer> list = new ArrayList<Integer>();
    // for문을 이용하여 배열의 합을 구한다.
    for(int i = 0; i < nums.length; i++) {
        if(i + 2 >= nums.length) break;
        for(int j = i + 1; j < nums.length; j++) {
            for(int h = j + 1; h < nums.length; h++) {
                list.add(nums[i] + nums[j] + nums[h]);
            }
        }
    }

    // 저장된 합이 소수인지 판별한다.
    for(Integer i : list) {
        int count = 2;
        answer++;
        while(count < i) {
            // 저장된 값이 count로 나눴을 때 나머지가 0이라면 소수가 아니기 때문에 answer의 값을 더하지 않는다.
            if(i % count == 0) {
                answer--;
                break;
            }
            count++;
        }
    }
    return answer;
}

    //https://velog.io/@seobob/프로그래머스-소수만들기-Java

//소수찾기

    class Solution {
        public static boolean isPrime(int num){
            for(int i=2; i*i<=num; i++){
                if(num % i == 0) return false;
            }
            return true;
        }

        public int solution10(int n) {
            int answer = 0;
            int[] arr = new int[n+1];
            for(int i=2; i<n+1; i++) {
                if(this.isPrime(i)) {
                    answer++;
                }

            }

            return answer;
        }

        //https://velog.io/@hong-brother/프로그래머스-소수-찾기
    }

}
