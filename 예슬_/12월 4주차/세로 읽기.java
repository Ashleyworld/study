import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i += m) { //m씩 증가
            String sub = my_string.substring(i, i+m);
            result.add(sub);
        }

        String answer = "";
        for (String str : result){
            answer += str.substring(c-1, c);
        }
        return answer;
    }
}

/* 모르겠음!!!!!!!!
* 주어진 코드는 주어진 문자열을 일정한 길이(m)로 잘라 잘린부분에서
* 인덱스 c에 해당하는 문자를 추출하여 새로운 문자열을 만듬
*
* 첫 번째 for 루프는 my_string의 길이를 m씩 증가시키면서
*  문자열을 잘라서 result 리스트에 추가합니다.
my_string.substring(i, i+m)을 사용하여 i부터 i+m까지의
* 부분 문자열을 추출하여 result에 추가합니다.
두 번째 for 루프에서는 result 리스트에 저장된 각 부분
*  문자열에서 c에 해당하는 인덱스의 문자를 추출하여 answer에 추가합니다.
for-each 문을 사용하여 result 리스트에 있는 각 문자열(str)에서
* str.substring(c-1, c)를 사용하여 c-1부터 c까지의
* 부분 문자열(하나의 문자)을 추출합니다.
추출된 문자열을 answer에 추가합니다.
*
* */