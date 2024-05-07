class Solution {
    public int solution(int order) {
        int answer = 0;

        String a = Integer.toString(order);
        String [] or = a.split("");

        for(int i = 0; i<or.length; i++){
            if(or[i].equals("3") || or[i].equals("6") || or[i].equals("9")) {
                answer++;
            }
        }


        return answer;
    }
}