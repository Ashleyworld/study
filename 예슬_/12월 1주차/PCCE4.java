import java.util.Scanner;

public class PCCE4 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int start = sc.nextInt();
                int before = sc.nextInt();
                int after = sc.nextInt();

                int money = start;
                int month = 1;
                while (money < 70) {
                    money += before;
                    month++;
                }
                while (money  < 100) {
                    money += after;
                    month++;
                }

                System.out.println(month);
            }
        }

/*
 * 빈칸이 before 인 이유는 start로 이미 시작하였고
 * 그 뒤에 두번째 달부터 시작하는 before 가 나오고
 * 70이상 이 되면 after로 변경해서 저금한다고 하였다.
 *
 *  */