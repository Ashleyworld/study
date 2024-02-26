class Solution {
    public String solution(String polynomial) {
        String answer = "";

        String[] strArr = polynomial.split(" \\+ ");

        int[] count = new int[2];

        for(String str : strArr){
            if(str.contains("x")){
                str = str.replace("x", "");
                count[0] += str.equals("") ? 1 : Integer.parseInt(str);
            }else{
                count[1] += Integer.parseInt(str);
            }
        }

        if(count[0] > 0){
            answer += count[0] == 1 ? "x" : count[0] + "x";
        }

        if(answer.length() > 0 && count[1] > 0){
            answer += " + ";
        }

        if(count[1] > 0){
            answer += count[1];
        }

        return answer;
    }
}