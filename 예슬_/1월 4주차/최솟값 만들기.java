import java.util.*;
class Solution
{
    public static int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A); // 오름차순 정렬
        Arrays.sort(B);
        for(int i=0;i<A.length;i++) {

            answer=answer+(A[i]*B[A.length-i-1]);
            // B[A.length - i - 1] 는 역순에 접근하기 위해서

        }
        System.out.println(answer);

        return answer;
    }
}