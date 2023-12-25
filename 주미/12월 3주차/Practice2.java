public class Practice2 {


    //짝수와홀수
    public String solution1(int num) {
        String answer = "";
        if (num % 2 == 0) {
            answer="Even";
        } else {
            answer="Odd";
        }
        return answer;
    }

    //평균구하기
    public double solution2(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        answer = sum /arr.length;
        return answer;

    }

    //약수의 합
    public int solution3(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                answer += i;
            }
        }
        return answer;
    }

    //문자열을 정수로 바꾸기
    public int solution4(String s) {
        return Integer.parseInt(s);
    }

    //나머지가 1이 되는 수 찾기
    public int solution5(int n) {
        int answer = 0;
        for(int i = 2; i < n; i++){
            if(n % i == 1){
                answer=i;
                break;
            }
        }
        return answer;
    }

    // x만큼 간격이 있는 n개의 숫자
    public long[] solution6(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        for(int i = 0; i < answer.length; i++){
            answer[i] = num;
            num += x;
        }
        return answer;
    }

    //문자열내 p와 y의 개수
    boolean solution7(String s) {
        int pCount = 0, yCount = 0;
        String[] array = s.toLowerCase().split(""); //  소문자로 바꿔서 잘라서 배열에 넣음

        for (int i = 0; i < array.length; i++) { //for문 돌리면서 p 와 y 카운터 세기
            if ("p".equals(array[i])) {
                pCount++;
            } else if ("y".equals(array[i])) {
                yCount++;
            }
        }
        if (pCount != yCount) {
            return false;
        }
        return true;
    }

}
