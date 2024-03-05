import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        // Map에 귤의 크기별 개수 담기
        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // 귤의 크기 리스트 생성
        List<Integer> keyList = new ArrayList<>(map.keySet());
        // 귤의 개수별 내림차순 정렬
        keyList.sort(((o1, o2) -> map.get(o2) - map.get(o1)));

        // k의 개수 만큼 상자에 담기(종류의 최소값 추출)
        for (Integer i : keyList) {
            if (k <= 0) {
                break;
            }

            answer++;
            k -= map.get(i);
        }

        return answer;
    }
}


/*
* 이 문제는 귤을 담을 수 있는 개수 k와 귤의 크기를 나타내는
* 배열 tangerine을 통해 상자에 담을 수 있는 서로 다른 크기의
* 종류의 최소를 반환하는 문제다.
먼저 귤의 크기를 key, 귤의 개수를 value로 담을 map을 선언한다.
반복문을 통해 map에 귤의 크기별 개수를 담는다.
* getOrDefault() 메서드를 통해 1씩 증가시켜 담을 수 있다.
귤의 key 값들을 담은 list를 초기화한다. keySet() 메서드를 통해
*  key 값들을 추출할 수 있다.
sort() 메서드와 Comparator 인터페이스의 compare() 메서드를 구현하여
*  귤의 개수를 기준으로 keyList를 내림차순으로 정렬한다.
keyList를 순회하여 k가 0보다 작거나 같아지면 반복문을 종료하고,
* 그렇지 않으면 answer를 증가시키고 k에서 i 크기의 귤의 개수를 뺀다.
*
출처: https://ittrue.tistory.com/516 [IT is True:티스토리]
*
*
*getOrDefault() 메서드는 Java의 Map 인터페이스에서 제공되는 메서드 중 하나
* 주어진 키에 해당하는 값이 존재하면 그 값을 반환하고,
*  키에 해당하는 값이 없을 경우에는 기본값을 반환
*
* HashMap<String, Integer> map = new HashMap<>();
map.put("apple", 10);
map.put("banana", 20);

int appleCount = map.getOrDefault("apple", 0);
* // "apple" 키의 값인 10을 반환
int orangeCount = map.getOrDefault("orange", 0);
* // "orange" 키의 값이 없으므로 기본값 0을 반환
* */


