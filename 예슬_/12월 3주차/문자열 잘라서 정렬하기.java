
import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {

        String[] splitArr = myString.split("x");
        ArrayList<String> resultList = new ArrayList<>();

        for(String str : splitArr){
            if(!str.isEmpty()) {
                resultList.add(str);
            }
        }
        String[] resultArr=resultList.toArray(new String[resultList.size()]);

        Arrays.sort(resultArr);

        return resultArr;
    }
}
/*
* 1. split("x") 로 자른 배열을 새로 만든다.
* 2. ArrayList를 선언한다. 새로운 배열을 순차적으로 정리하기 위해서.
* 3. splitArr이라는 배열에서 str 이라는 문자열을 뽑는다.
* 4. str이 비어있지 않다면 ArrayList인 resultList에 str을 추가한다.
* 5. 그래서 ArrayList는 toArray() 메서드로 배열을 변환하는데 사용됨.
* 6. new String[resultList.size()] 는 배열의 크기를 `resultList`의 요소 개수와 동일하게 설정함을 의미
* 7. 반환될 배열의 타입과 크기를 지정함
* resultList.toArray() 메서드는 요소가 저장된
*
* (new String[resultList.size()]); 의 의미를 솔직히 잘 모르겠음...
*
* toArray() 를 쓸 때, size()를 사용한다!!!
* */