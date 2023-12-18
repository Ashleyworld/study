class Solution {
    public int[] solution(int[] num_list, int n) {

        int[] answer;
        if (num_list.length % n == 0){
            answer = new int[num_list.length / n];
        } else {
            answer = new int[num_list.length / n+1];
        }

        int index = 0;

        for (int i = 0; i < num_list.length; i += n){
            answer[index++] = num_list[i];

        }
        return answer;
    }
}

/*
* answer 배열을 생성한다. 만약 num_list 길이를 나눈 나머지가 0 이라면,
* 즉 수가 맞아 떨어진다면 배열의 크기를 num_list를 n 으로 나누 값으로 지정
* 그렇지 않으면 나눈 값에 1더한 값으로 지정한다.
* 배열의 위치가 될 index 변수를 생성한다.
* for 문이 num_list 길이만큼 순회하며
* i의 값이 n 씩 증가한다. answer의 index 위치에 num_list의 i번째 원소를 할당한다.
*
*
* */