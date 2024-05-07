class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int dex = 0;

        while((dex = myString.indexOf(pat, dex)) != -1){
            answer++;
            dex += 1;
        }
        return answer;
    }
}