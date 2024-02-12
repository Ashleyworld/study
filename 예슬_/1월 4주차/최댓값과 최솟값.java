class Solution {
    public String solution(String s) {
        String answer = "";

        String[] numbers = s.split(" ");

        // 최소값을 저장할 변수를 Integer최대값으로 초기화
        int min = Integer.MAX_VALUE;

        // 최대값을 저장할 변수를 Integer 최소값으로 초기화
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<numbers.length; i++){
            int number = Integer.parseInt(numbers[i]);

            // 현재 숫자가 최소값보다 작으면 최소값을 갱신
            min = Math.min(min, number);

            // 현재 숫자가 최대값보다 크면 최대값을 갱신
            max = Math.max(max, number);
        }
        answer = min+ " " +max;

        return answer;
    }
}