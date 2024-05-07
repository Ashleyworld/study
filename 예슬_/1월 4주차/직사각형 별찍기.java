import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i<b; i++){
            // b의 값만큼 반복하는 루프, 세로방향 반복

            for(int j=0; j<a; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}