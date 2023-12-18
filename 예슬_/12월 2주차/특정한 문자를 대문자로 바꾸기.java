class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";

        return my_string.replace(alp, alp.toUpperCase());
    }
}
/*
* replace() 메서드로 my_string 문자열에서 alp에 해당하는 모든 글자를
* 대문자로 변환하여 return 하도록 하였다.
*
* */