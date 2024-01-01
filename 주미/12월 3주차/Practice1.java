import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Practice1 {

    //덧셈식 출력하기

    public void solution1(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a+" + "+b+" = "+(a + b));
        }



    //문자열 잘라서 정렬하기
    public String[] solution2(String myString) {

        String[] parts = myString.split("x");
        String[] answer = Arrays.stream(parts)
                .filter(str -> !str.isEmpty())
                .sorted()
                .toArray(String[]::new);
        return answer;

        // trim:띄어쓰기 정리
        // split: 주어진 문자열 기준으로 자름

    }


    //배열 회전시키기
    public int[] solution3(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if(direction.equals("right")){
            for(int i = 0; i < answer.length - 1; i++){
                answer[i + 1] = numbers[i];
            }
            answer[0] = numbers[numbers.length -1];
        }else {
            for(int i = 0; i < answer.length - 1; i++){
                answer[i] = numbers[i + 1];
            }
            answer[answer.length - 1] = numbers[0];
        }
        return answer;
    }

    //배열만들기 3

        public int[] solution3(int[] arr, int[][] intervals) {
            int[] interval1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
            int[] interval2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);

            int[] answer = new int[interval1.length + interval2.length];

            System.arraycopy(interval1, 0, answer, 0, interval1.length);
            System.arraycopy(interval2, 0, answer, interval1.length, interval2.length);

            return answer;
        }

        /*
 * Arrays.copyOfRange 메서드는 다양한 유형의 배열에 대해 동작하며, 원본 배열과 같은 유형의 배열이 반환된다.
copyOfRange(T[] original, int from, int to)
original: 복사할 배열
from: 복사할 시작 인덱스 (포함)
to: 복사할 끝 인덱스 (제외)

System.arraycopy 메서드는 Java에서 배열 간의 요소를 복사하는 데 사용되는 메서드다.
System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
src: 복사할 원본 배열
srcPos: 원본 배열에서 복사를 시작할 인덱스
dest: 복사된 요소를 저장할 대상 배열
destPos: 대상 배열에서 복사를 시작할 인덱스
length: 복사할 요소의 개수
        * */



        //외계행성의 나이
        public String solution4(int age) {
            String answer = "";
            String age962 = "abcdefghij";
            String[] ageArr = String.valueOf(age).split("");

            for (int i = 0; i < ageArr.length; i++) {
                answer += age962.charAt(Integer.valueOf(ageArr[i]));
            }
            return answer;
        }


        //약수구하기
    public int[] solution5(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> (n % i == 0)).toArray();
    }


    //문자 리스트를 문자열로 변환하기
    public String solution6(String[] arr) {
        String answer = "";

        for(int i = 0; i<arr.length; i++){

            answer=answer+arr[i];
        }

        return answer;
    }

    //수 조작하기2
    public String solution7(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i - 1];
            if (diff == 1) {
                sb.append("w");
            } else if (diff == -1) {
                sb.append("s");
            } else if (diff == 10) {
                sb.append("d");
            } else if (diff == -10) {
                sb.append("a");
            }
        }
        return sb.toString();
    }


    // 문자열 돌리기
    public void solution8(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int b = a.length();

        for(int i=0; i<b;i++){
            System.out.println(a.charAt(i));

        }
    }

    //피자 나눠먹기2
    public int solution9(int n) {
        int answer = 0;
        for (int i = 1; i <= 6 * n; i++) {
            if (6 * i % n == 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    //주사위게임2
    public int solution10(int a, int b, int c) {
        int answer = 0;
        if (a != b && a != c && b != c) {
            answer = a + b + c;
        } else if (a == b && a == c) {
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else {
            answer = (a + b + c) * (a * a + b * b + c * c);
        }
        return answer;
    }

    //숫자찾기
    public int solution11(int num, int k) {
        int answer = 0;

        String s = Integer.toString(num);
        String[] array = s.split("");

        for(int i =0; i<array.length; i++){
            if(array[i].equals(Integer.toString(k))){return i+1;}


        }
        return -1;
    }

    //369게임
    public int solution12(int order) {
        int answer = 0;
        String strOrder = "" + order;
        for (int i = 0; i < strOrder.length(); i++) {
            char tempChar = strOrder.charAt(i);

            if (tempChar == '3' || tempChar == '6' || tempChar == '9') {
                answer++;
            }
        }
        return answer;
    }
}
