class Solution {
    public int[] solution(long n) {

        String s = String.valueOf(n);
//String.valueOf(n); 를 통해서 자연수를 문자열로 바꾼다.
        int[] answer = new int[s.length()]; // 새로운 배열을 선언한다.
        for(int i = 0; i < answer.length; i++) {

            // 반복문을 이용해 문자를 다시
            // Integer.parseInt()로 Parsing하여 각 배열 요소에 저장 후 출력!
            answer[i]
                    = Integer.parseInt(s.substring(answer.length-1-i, answer.length-i));


        }
        return answer;
    }
}

/*


* 1. s.substring(answer.length-1-i, answer.length-i)을
사용하여 숫자 문자열에서 각 자릿수를 추출합니다.

- s.substring(startIndex, endIndex) 은 문자열 s에서 startIndex부터
endIndex -1 까지의 부분 문자열을 반환합니다.

- 예를 들어 s가 12345 이고, i가 2 라고 가정
그러면 answer.length-1-i는 5-1-2로 계산되어 2가 되고
answer.length-i는 5-2 로 계산되어 3이 된다.
따라서 s.substring(2, 3) 은 3이 된다.
그 후 Integer.parseInt() 함수를 사용하여 이부 부분 문자열을 정수로 변환한다.


2. Integer.parseInt() : 추출된 문자열을 정수로 변환
* */