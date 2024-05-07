public class Practice1 {

    // 숨어있는 숫자의 덧셈(1)


        public int solution1(String my_string) {

            my_string = my_string.replaceAll("[a-zA-Z]", "");
            String[] arr = my_string.split("");

            int answer = 0;
            for (int i = 0; i < arr.length; i++) {
                answer += Integer.valueOf(arr[i]);
            }
            return answer;
        }


        // 세균증식

    public int solution2(int n, int t) {
        int answer = 0;

        for(int i = 0; i<t;i++){
            n *= 2;



        }

        return n;
    }


    // 아이스아메리카노

    public int[] solution3(int money) {
        int[] answer = new int[2];

        answer[0] = money / 5500;
        answer[1] = money % 5500;

        return answer;
    }


    //짝수는 싫어요

    public int[] solution4(int n) {
        int[] answer = new int[(n+1)/2];

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1) {
                answer[i/2] = i;
            }
        }

        return answer;
    }


    // 순서쌍의 개수
    public int solution5(int n) {
        int answer = 0;

        for(int i = 1; i <= n ; i++){

            if(n % i == 0){
                answer++;
            }
        }

        return answer;
    }

}
