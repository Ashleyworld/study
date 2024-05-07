class Solution {
    public int solution(String[] spell, String[] dic) {
        for (int i = 0; i < dic.length; i++) {
            if (dic[i].length() == spell.length) {
                // spell 문자와 dic 단어가 조합되서 길이가 같다면

                boolean flag = true;

                // 외계어 사전에 어떤 단어도 spell 어떤 문자도
                // 포함하지 않는 경우에 false->종료
                for (int j = 0; j < spell.length; j++) {
                    if (!dic[i].contains(spell[j])) {

                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return 1;
                }
            }
        }
        return 2;
    }
}