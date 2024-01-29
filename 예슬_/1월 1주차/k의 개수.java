class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        String strK = String.valueOf(k);
        for(int l = i; l <= j; l++){
            String value = String.valueOf(l);
            String[] array = value.split("");
            for(String alpha : array){
                if(alpha.equals(strK)) count++;
            }
        }

        return count;
    }
}

/* i부터 j까지 수를 문자열로 변환하여 각 자리마다 숫자 k가 등장하는 횟수를 계산
*
* i 부터 j 까지 숫자들을 문자열로 변환하여 각 자리마다 반복문을 통해 숫자 k와 일치
* 하는지 확인하고 카운트를 증가시킨다.
* l의 역할이 뭐지 잘 모르겠음
*
* */