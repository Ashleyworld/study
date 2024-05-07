import java.util.*;

public class Solution0102 {

    //제일 작은 수 제거하기
    public List solution01(int[] arr) {

        List<Integer> answer = new ArrayList<>();

        if(arr.length > 1){

            int min = arr[0];

            for(int num : arr){
                answer.add(num);

                if (min > num) {
                    min = num;
                }
            }

            for(int i = 0; i < answer.size(); i++){
                if(answer.get(i) == min){
                    answer.remove(i);
                }
            }

        } else {
            answer.add(-1);
        }
        return answer;
    }

    //배열의 길이를 2의 거듭제곱으로 만들기
    public int[] solution02(int[] arr) {
        int pow = 0;
        while(arr.length > Math.pow(2, pow)){
            pow++;
        }

        int[] answer = new int[(int) Math.pow(2, pow)];

        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }

    //세개의 구분자
    public List solution3(String myStr) {
        List<String> list = new ArrayList<String>();
        String temp = "";
        for(int i = 0 ; i < myStr.length(); i++){
            char value = myStr.charAt(i);

            if(value == 'a' || value == 'b' || value == 'c'){
                if(temp != ""){
                    list.add(temp);
                    temp = "";
                }
            } else {
                temp += value;
            }
        }
        if(temp != ""){
            list.add(temp);
            temp = "";
        }

        if(list.size() == 0) list.add("EMPTY");
        return list;
    }

    //문자열 반복해서 출력하기
    public String solution04(String str){
        return str;
    }

    //가운데 글자 가져오기
    public String solution05(String s) {
        String answer = "";

        if(s.length() % 2 == 0){
            answer += s.charAt(s.length()/2-1);
            answer += s.charAt(s.length()/2);
        }
        else {
            answer += s.charAt(s.length()/2);
        }

        return answer;
    }

    //내적
    public int solution06(int[] a, int[] b) {
        int answer = 0;

        for(int i=0; i<a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }

    //수박수박
    public String solution07(int n) {
        String answer = "";
        for(int i = 1; i <= n; i++){
            if(i % 2 ==0){
                answer += "박";
            } else {
                answer += "수";
            }
        }
        return answer;
    }

    //수열과 구간 쿼리4
    public int[] solution08(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; i++){
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                if(j % queries[i][2] == 0){
                    arr[j]++;
                }
            }
        }
        return arr;
    }

    //2의 영역
    public int[] solution09(int[] arr){
        int min = 100000, max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }

        if (min <= max) {
            return Arrays.copyOfRange(arr, min, max + 1);
        } else {
            return new int[]{-1};
        }
    }

    //문자열 묶기
    public int solution10(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(String str : strArr){
            int length = str.length();
            map.put(length, map.getOrDefault(length, 0) + 1); //기본값 0 중복값 +1
        }


        for(int count : map.values()){
            answer = Math.max(answer, count);
        }
        return answer;
    }

    //리스트 자르기
    public List solution11(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList<>();

        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        switch(n){
            case 1 :
                for(int i = 0; i <= b; i++){
                    answer.add(num_list[i]);
                }
                break;

            case 2:
                for(int i = a; i < num_list.length; i++){
                    answer.add(num_list[i]);
                }
                break;

            case 3:
                for(int i = a; i <= b; i++){
                    answer.add(num_list[i]);
                }
                break;

            case 4:
                for(int i = a; i <= b; i += c){
                    answer.add(num_list[i]);
                }
                break;
        }
        return answer;
    }

    // 7의 개수
    public int solution12(int[] array) {
        int answer = 0;
        String str = Arrays.toString(array);

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '7'){
                answer++;
            }
        }
        return answer;
    }

    //컨트롤 제트
    public int solution13(String s) {
        int answer = 0;

        String[] arr = s.split(" ");

        for(int i = 0; i < arr.length; i++){

            if(arr[i].equals("Z")){
                answer -= Integer.parseInt(arr[i - 1]);
            } else {
                answer += Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }

    //커피 심부름
    public int solution14(String[] order) {
        int answer = 0;

        for(int i = 0; i < order.length; i++){

            switch (order[i]){
                case "iceamericano" :
                case "americanoice" :
                case "hotamericano" :
                case "americanohot" :
                case "americano" :
                case "anything" :
                    answer += 4500;
                    break;

                case "icecafelatte":
                case "cafelatteice" :
                case "hotcafelatte" :
                case "cafelattehot" :
                case "cafelatte" :
                    answer += 5000;
                    break;
            }
        }
        return answer;
    }

    // 이진수 더하기
    public String solution15(String bin1, String bin2) {
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        String answer = Integer.toBinaryString(num1 + num2);

        return answer;
    }

    //약수의 개수와 덧셈
    public int solution16(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++){
            int count = 0;

            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }

            if(count % 2 == 0){
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }

    // qr code
    public String solution17(int q, int r, String code) {
        String answer = "";

        for(int i = 0; i < code.length(); i++){
            if(i % q == r){
                answer += code.charAt(i);
            }
        }
        return answer;
    }

    // PCCE 5번
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }

    //조건에 맞게 수열 변환하기2
    public int solution19(int[] arr) {
        int answer = 0;
        int count = 0;
        int[] beforArr = new int[arr.length];
        while(count != arr.length) {
            count = 0;
            beforArr = arr.clone();
            for(int i =0; i<arr.length; i++) {
                if(arr[i]%2 == 0 && arr[i] >= 50) {
                    arr[i] /= 2;
                }else if(arr[i]%2 != 0 && arr[i] < 50) {
                    arr[i] = arr[i]*2 +1;
                }
                if(arr[i] == beforArr[i] ) count ++;
            }
            answer ++;
        }

        return answer-1;
    }

    //특수문자 출력
    public String solution20(String str){
        return "!@#$%^&*(\\'\"<>?:;";
    }

}
