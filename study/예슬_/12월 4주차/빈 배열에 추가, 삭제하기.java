import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList<>();
        // list는 길이가 가변되서!

        for(int i = 0; i<arr.length; i++){
            if(flag[i]){
                for(int j = 0; j<arr[i] * 2; j++){
                    list.add(arr[i]);
                }
            } else {
                for(int j = 0; j < arr[i]; j++) {
                    list.remove(list.size() -1);
                }
            }
        }
        int[] answer = new int[list.size()];

        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i); // 여기서부터 이해가 안됨
            // 복사해서 하나하나 넣는 부분
            //retur 타입이 int[] 이라서!!!!!!!
        }
        return answer;

    }
}

/*
*
*
* */