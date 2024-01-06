

class Solution {
    public int solution(int n) {
        for(int i = 2; i<n; i++){
            if(n%i==1){
                return i;
            }
        }
        return -1;
    }
}
/*
* return -1은 특정 조건에 만족하는 값을 찾지 못했을 때 반환되는 값
*
* */