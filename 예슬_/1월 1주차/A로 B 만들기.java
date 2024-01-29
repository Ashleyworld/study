import java.util.*;

class Solution {
    public int solution(String before, String after) {

        char[] arr1 = before.toCharArray();
        char[] arr2 = after.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String str1 = new String(arr1);
        String str2 = new String(arr2);

        return str1.equals(str2) ? 1 : 0;
        /* 변환된 두 문자열을 비교하여 같은지 확인
        * true 이면 1 반환 그렇지 않으면 0 반환*/
    }
}

/*
*
*
* */