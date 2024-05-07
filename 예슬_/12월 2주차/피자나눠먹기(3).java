class Solution {
    public int solution(int slice, int n) {
        int answer = 0;

        if(n % slice == 0){
            answer = n / slice;
        }else{
            answer = n / slice +1;
        }

        return answer;
    }
}
}
/*
* n 나누기 slice 을 해보았다. 딱 맞아서 그 값을 anwer 넣었다
*
* 그리고 다른 건 +1 하면 맞길래 해보았더니 나왔따.
*
* */