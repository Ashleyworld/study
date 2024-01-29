class Solution {
    public String solution(String letter) {
        String answer = "";
        // morseList 배열에 모스부호를 순서대로 넣어줌
        String[] morseList = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};

        String[] morse;

        morse = letter.split(" ");
    // 공백을 기준으로 편지의 모스부호를 나눠준 뒤, morse 배열에 넣어줌

        for(String s : morse){
            // 편지 해독을 위해 morse 값과 morseList값이 일치하는 index를 찾아 'a'를 더해줌


            for(int i = 0; i < morseList.length; i++){
                if(s.equals(morseList[i])){
                    answer += Character.toString(i+'a');
                }
            }
        }

        return answer;
        // 해독한 편지 return
    }
}

/*
*
*
* */