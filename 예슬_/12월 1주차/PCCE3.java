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
 * 어떻게 푸는지 감이 안와서 31이 나오게 만들어보았다.
 * year 값이 2000이라서 2000-31 하면 1969으로 값이 나오길래 answer = year-1969;
 * 해봤더니 테스트 통과되어서 아래도 +1 했더니 테스트 통과되었다....
 *
 *  */