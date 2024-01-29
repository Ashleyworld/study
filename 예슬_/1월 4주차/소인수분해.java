import java.util.*;

class Solution {
    public ArrayList solution(int n) {

        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 2; i <= n; i++){
            while(n%i == 0){
                if(!answer.contains(i))
                    answer.add(i);
                n /= i;
            }
        }
        return answer;
    }
}
/*
* 1. Interface란?
* 클래스는 크게 일반 클래스와
* 클래스 자체에 abstract가 붙거나
* 클래스 내에 추상메서드가 하나 이상 존재하는 추상 클래스로 나뉩니다.
*
* List는 인터페이스. 공통되는 메소드를 추출해놓은 클래스
*
* ArrayList는 List에 상속된 클래스라고 보면 됨.
*
* 도형으로 생각할 시,
* List<> list = new ArrayList<>();
* 도형 list = new 정사각형;
*
* ArrayList<> list = new ArrayList<>();
* 정사각형 list = new 정사각형;
*
* */