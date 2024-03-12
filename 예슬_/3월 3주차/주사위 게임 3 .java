import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);
        if (map.size() == 1) return a * 1111;
        if (map.size() == 2) {
            if (map.containsValue(3)) {
                for (Map.Entry<Integer, Integer> el : map.entrySet())
                    answer += el.getKey() * (el.getValue() == 3 ? 10 : 1);
                return answer * answer;
            }
            int x = (a + b + c + d - 2 * a) / 2;
            return (a + x) * Math.abs(a - x);
        }
        if (map.size() == 3) {
            answer = 1;
            for (Map.Entry<Integer, Integer> el : map.entrySet())
                if (el.getValue() != 2) answer *= el.getKey();
            return answer;
        }
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}

/*
*Map<String, Integer> map = new HashMap<>();
map.put("apple", 3);
map.put("banana", 5);
*
*int count1 = map.getOrDefault("apple", 0);
* // "apple" 키의 값인 3을 반환
int count2 = map.getOrDefault("orange", 0);
* // "orange" 키가 존재하지 않으므로 기본값인 0을 반환

*
*
*
*getKey() 메서드는 Java에서 Map.Entry 인터페이스에서 제공하는 메서드 중 하나
* Map<String, Integer> map = new HashMap<>();
map.put("apple", 3);
map.put("banana", 5);

for (Map.Entry<String, Integer> entry : map.entrySet()) {
    String key = entry.getKey();
    System.out.println("Key: " + key); // "apple", "banana"를 차례로 출력
}
*
*
*
* getValue() 메서드는 Java에서 Map.Entry 인터페이스에서 제공하는 메서드 중 하나
*Map<String, Integer> map = new HashMap<>();
map.put("apple", 3);
map.put("banana", 5);

for (Map.Entry<String, Integer> entry : map.entrySet()) {
    Integer value = entry.getValue();
    System.out.println("Value: " + value); // 3, 5를 차례로 출력
}
*
*
* entrySet()은 Java에서 Map 인터페이스의 메서드 중 하나
*Map<String, Integer> map = new HashMap<>();
map.put("apple", 10);
map.put("banana", 20);
map.put("orange", 30);

for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " : " + entry.getValue());
}
위의 코드는 map에 있는 모든 요소를 반복하면서 각 요소의 키와 값을 출력합니다.
*
*
* */



