import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> intList = new ArrayList<>();

        for (int[] interval : intervals) {
            for (int j = interval[0]; j <= interval[1]; j++) {
                intList.add(arr[j]);
            }
        }

        return intList.stream().mapToInt(Integer::intValue).toArray();
    }
}

/*스트림이란 뭘까????????/
* Stream() 컬렉션(의 하위 클래스인 List, Set,Map)등,
*  배열,  등의 데이터소스를 스트림(Stream)으로 변환하는데 사용
*
* 스트림으로 변환->
* mapToInt(Integer::intValue) : mapToInt() 메서드는 스트림의 요소를 특정
* 형태로 매핑하는 역할을 합니다.
* Integer::intValue 는 각각의 요소를 int로 매핑하기 위해 사용되는 메서드 레퍼런스
* 이것은 각 Integer 값을 int 값으로 변환합니다.
* toArray() : toArray() 메서드는 스트림을 배열로 변환합니다.
* mapToInt()를 통해 int 값으로 매핑된 스트림을 toArray()를 통해 int배열로 반환
*
* */