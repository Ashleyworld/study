import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        Map<String, String> memberTable = new HashMap<>();
        // 회원 정보를 저장할 HaspMap을 선언.



        for(int i = 0; i < db.length; i++){
            memberTable.put(db[i][0], db[i][1]);
        }
        /* db 배열에서 아이디와 패스워드를 추출하여 해쉬맵에 저장함
        * 아이디가 key 이고, 패스워드가 value로 매핑 */
        try {
            // 로그인 절차를 try-catch 블록으로 감쌈
            // 입력된 아이디에 회원정보가 없을 경우를 대비하여 예외처리 한다.
            // 아이디가 존재하지 않는 경우, fail 를 반환
            if (memberTable.get(id_pw[0]).equals(id_pw[1])) {
                return "login";
            } else if (!memberTable.get(id_pw[0]).equals(id_pw[1])) {
                return "wrong pw";
            } else {
                return "fail";
            }
        } catch (Exception e){
            return "fail";
        }

    }
}