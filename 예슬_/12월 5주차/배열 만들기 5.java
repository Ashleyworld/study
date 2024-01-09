import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();

        for(String str : intStrs){
            int i = Integer.parseInt(str.substring(s, s+l));
            if(i > k){
                result.add(i);
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}

/*
* result.stream().mapToInt(i->i).toArray()
* result.stream() 은 결과 리스트를 스트림으로 변환한다.
* Java에서 스트림은 컬렉션을 처리하고 조작하기 위한 시퀀스
*
* mapToInt(i->i) 는 각 요소를 정수형으로 매핑하는 작업
* 여기서 i->i는 요소를 그대로 반환하는 람다표현식.
*
* toArray()는 IntStream을 int배열로 반환하여 반환합니다
*
* */