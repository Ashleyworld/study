
class Solution {
    public int solution(int num, int k) {
        int answer = -1;

        String[] s = String.valueOf(num).split("");
        for(int i=0; i<s.length; i++){
            if(s[i].equals(String.valueOf(k))){
                answer = i + 1;
                break;
            }else{
                answer = -1;
            }
        }

        return answer;
    }
}
/*
* answer 가 -1로 시작하는 이유는
* num에서 k가 발견되지 않는 경우를 나타내기 위함이다.
* k와 일치하는 값을 찾지 못하면 answer는 -1로 유지된다.
*
* */