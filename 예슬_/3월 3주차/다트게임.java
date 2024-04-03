class Solution {
    public int solution(String dartResult) {
        int answer = 0;

        String[] dart = dartResult.split("");
        int[] score = new int[3]; // 점수

        int index = -1; // score index
        for(int i=0; i<dart.length; i++) {
            // 숫자인지 확인
            if(dart[i].matches("[0-9]")) {
                index++;
                score[index] = Integer.parseInt(dart[i]);
                // 두자리 수 숫자?
                if(dart[i+1].matches("[0-9]")) {
                    score[index] *= 10;
                    i++;
                }
            }

            switch(dart[i]) {
                case "D":
                    score[index] = (int)Math.pow(score[index], 2);
                    break;
                case "T" :
                    score[index] = (int)Math.pow(score[index], 3);
                    break;
                case "*" :
                    score[index] *= 2;
                    if(index - 1 >= 0) score[index-1] *= 2;
                    break;
                case "#" :
                    score[index] *= -1;
            }

        }

        for(int s : score) {
            answer += s;
        }

        return answer;
    }
}

출처
https://velog.io/@hi_potato/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-1%EC%B0%A8-%EB%8B%A4%ED%8A%B8-%EA%B2%8C%EC%9E%84-JAVA
