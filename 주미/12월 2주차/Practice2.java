public class Practice2 {

    //공배수

    public int solution6(int number, int n, int m) {
        int answer = (number % n == 0) && (number % m == 0) ? 1 : 0;
        return answer;
    }



    //피자나눠먹기(3)
    public int solution7(int slice, int n) {
        int answer = 0;

        if(n % slice == 0){
            answer = n / slice;

        }else{
            answer = n / slice +1;

        }

        return answer;
    }


    //제곱수 판별하기

    public int solution8(int n) {
        int answer = 0;

        if(Math.sqrt(n)%1 ==0){

            answer=1;
        }else{answer=2;}

        return answer;
    }


    //문자열을 정수로 변환하기

    public int solution9(String n_str) {
        int answer = 0;
        answer = Integer.parseInt(n_str);
        return answer;
    }


    // n개 간격의 원소들
    public int[] solution10(int[] num_list, int n) {
        int[] answer = {};

        if (num_list.length % n == 0) {
            answer = new int[num_list.length / n];
        } else {
            answer = new int[num_list.length / n + 1];
        }

        int index = 0;
        for (int i = 0; i < num_list.length; i += n) {
            answer[index++] = num_list[i];
        }
        return answer;
    }
}
