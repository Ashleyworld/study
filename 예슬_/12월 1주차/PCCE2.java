import java.util.Scanner;

public class PCCE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = c*c - a*a;

        System.out.println(b_square);
    }
}

/*
* c2, a2 (제곱)을  만들고 싶었는데 표시할 수 있는 방법이 없어서
* Math.pow(c-a) 쓰면 될 것 같았는데 doulbe로 선언해야 가능함
* 그래서 단순하게 c*c 해봤는데 되었다!
* */