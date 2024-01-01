import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int answer = a.length();

        for(int i=0; i<answer; i++){
            System.out.println(a.charAt(i));
        }
    }
}


/*
* int answer는 a의 길이, 입력된 예씨는 abcde 그래서 answer = 5
*    i는 5만큼 돌아가고
*   println 한다. a를 5개
* */