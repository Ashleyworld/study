import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<ingredient.length;i++){
            list.add(ingredient[i]);
            if(list.size() >=4 &&
                    list.get(list.size()-4) == 1 &&
                    list.get(list.size()-3) == 2 &&
                    list.get(list.size()-2) == 3 &&
                    list.get(list.size()-1) == 1){
                answer++;
                for(int j=0;j<4;j++){
                    list.remove(list.size()-1);
                }
            }
        }
        return answer;
    }
}

// 주어진 코드 블록은 리스트 li에서 연속적으로
// 빵(1), 야채(2), 고기(3), 빵(1) 순서로 쌓여 있는지 검사하고,
// 해당 순서로 쌓여 있을 경우 햄버거를 포장하는 과정을 나타냅니다.
//
//int n = li.size();: 현재 리스트 li의 길이를 구합니다.
// 이를 통해 리스트의 마지막 인덱스를 알 수 있습니다.
//
//if(!(li.get(n-1) == 1
// && li.get(n-2)==3 && li.get(n-3) ==2
// && li.get(n-4)==1)) break;

// li.get(n-1)은 리스트 li에서 마지막 요소를 가져오는 것입니다.
// 여기서 n은 현재 리스트 li의 길이이므로, li.size()로
// 리스트의 길이를 구한 후에 1을 빼면 마지막 요소의 인덱스가 됩니다.
//
//코드에서는 마지막 요소부터 순서대로
// 빵(1), 야채(2), 고기(3), 빵(1) 순서로 쌓여 있는지를 확인하기 위해
// 리스트의 마지막 요소부터 역순으로 확인하고 있습니다.
// 따라서 li.get(n-1)은 리스트의 마지막 요소를 가져오는 것입니다




// : 리스트의 마지막 네 개의 요소가 빵(1), 야채(2), 고기(3), 빵(1) 순서로
// 쌓여 있는지 확인합니다. 만약 순서가 맞지 않는다면(if 조건이 거짓이라면),
// 더 이상 반복하지 않고 for 루프를 빠져나갑니다.
//
//for(int j=0; j<4; j++) { li.remove(li.size() -1); }
// : 리스트에서 마지막 네 개의 요소를 제거합니다.
// 이는 포장할 햄버거의 재료를 리스트에서 제거하는 과정입니다.
//
//answer++;
// : 포장한 햄버거의 개수를 증가시킵니다.
// 이 코드 블록이 실행될 때마다, 포장한 햄버거의 개수를 1 증가시킵니다.
//
//이 코드 블록은 리스트 li에서 빵, 야채, 고기, 빵 순서로 연속적으로 쌓여 있는 경우
// 해당 햄버거를 포장하는 과정을 반복하며, 포장한 햄버거의 개수를 세는 역할을 합니다.