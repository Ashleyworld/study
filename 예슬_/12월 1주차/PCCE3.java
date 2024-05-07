import java.util.Scanner;

public class PCCE3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals("Korea")) {
            answer = 2030-year+1;
        }
        else if (age_type.equals("Year")) {
            answer = 2030-year;
        }

        System.out.println(answer);
    }
}


/*
 * 어떻게 푸는지 감이 안와서 31이 나오게 만들어 보았다.
 * year 값이 2000이라서 2000-31 하면 1969으로 값이 나오길래 answer = year-1969;
 * 해보았더니 테스트 통과 되어서 아래도 +1 했더니 테스트 통과 되었다....
 *
 *
 * 그런데 제출이 안됨
 * 그래서 방식을 바꿔서 2023-2000 했다가 2030 - 2000으로 바꿔서 풀어 봤는데 맞았다! 생각 보다 쉬운 문제;;;;
 *  */