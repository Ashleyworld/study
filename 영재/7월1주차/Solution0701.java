import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution0701 {

    //배열의 길이에 따라 다른 연산하기
    public int[] solution01(int[] arr, int n) {
        int[] answer = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(arr.length % 2 != 0 && i % 2 == 0){
                answer[i] = arr[i] + n;
            } else if(arr.length % 2 == 0 && i % 2 != 0){
                answer[i] = arr[i] + n;
            } else {
                answer[i] = arr[i];
            }
        }
        return answer;
    }

    //문자열 바꿔서 찾기
    public int solution02(String myString, String pat) {
        int answer = 0;
        String str = "";

        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'A'){
                str += "B";
            } else {
                str += "A";
            }
        }

        if(str.contains(pat)){
            return 1;
        } else {
            return 0;
        }
    }

    //배열 비교하기
    public int solution03(int[] arr1, int[] arr2) {
        int answer = 0;

        if(arr1.length != arr2.length){
            if(arr1.length > arr2.length){
                answer = 1;
            } else {
                answer = -1;
            }
        } else {
            int num1 = Arrays.stream(arr1).sum();
            int num2 = Arrays.stream(arr2).sum();

            if(num1 > num2){
                answer = 1;
            } else if(num2 > num1){
                answer = -1;
            }
        }
        return answer;
    }

    //배열의 원소만큼 추가하기
    public int[] solution04(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    //공백으로 구분하기 2
    public String[] solution05(String my_string) {
        String[] answer = my_string.trim().split("\\s+"); //하나 이상 공백
        return answer;
    }

    //n보다 커질 때까지 더하기
    public int solution06(int[] numbers, int n) {
        int answer = 0;

        for(int number : numbers){
            if(answer > n){
                break;
            } else {
                answer += number;
            }
        }
        return answer;
    }

    //원하는 문자열 찾기
    public int solution07(String myString, String pat) {
        int answer = 0;
        if(myString.toLowerCase().contains(pat.toLowerCase())){
            answer = 1;
        }
        return answer;
    }
}
