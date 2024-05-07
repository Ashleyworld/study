class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        for(int i = 0; i < answer.length; i++){
            if(arr[i] >= 50 && arr[i] % 2 == 0){
                answer[i] = arr[i] / 2;
            }else if(arr[i] < 50 && arr[i] % 2 != 0 ){
                answer[i] = arr[i] * 2;
            }else{
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}

/*
* 저게 왜 && 써야하는지 아직도이해가 잘 안됨 문제는 값이 50보다 크거나 라고 조건인데
* 왜 || 이 아니고 && 인건지??
*
*
* */