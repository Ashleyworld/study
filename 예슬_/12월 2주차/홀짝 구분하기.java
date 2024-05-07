import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 == 0) {
            System.out.print(n + " is even");
        }else{
            System.out.print(n + " is odd");
        }
    }
}

/*
* int n 있어서 String str = ""; 새로 선언하고
* answer 에 n + str 해서 answer를 반환하였다.
*
*
* */