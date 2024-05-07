class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        char[] arr = str.toCharArray();

        for(int i = 0; i < arr.length; i++){
            for(int j= 0; j<arr.length; j++){
                if(arr[j]<arr[i]){
                    char tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        String newstr = new String();
        for(int i = 0; i<arr.length; i++){
            newstr += arr[i];
        }
        answer = Long.parseLong(newstr);

        return answer;
    }
}
/* Long.toString(n) 을 사용하여 n 을 문자열로  변환한 후
 문자열(String)을 문자배열(char) arr 배열로 변환

* 이중 for 루프를 사용하여 선택 정렬 방식으로 숫자의 각 자릿수 내림차순으로 정렬

Long.parseLong(newstr) 를 사용하여 문자열 long 타입의 숫자로 변환
* */