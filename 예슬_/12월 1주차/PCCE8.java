public class PCCE8 {
    public String solution(String[] storage, int[] num) {
        int num_item = 0; // 옛날창고에 있는 각 물건 개수
        String[] clean_storage = new String[storage.length]; // 창고 정리하면 정리된 물건 이름 배열
        int[] clean_num = new int[num.length]; // 정리된 창고 물건의 갯수

        for(int i=0; i<storage.length; i++){    // 정리된 창고의 물건이름 수 만큼 돌아감
            int clean_idx = -1;                 // 정리된 창고 물건의 갯수, 왜 -1 ?
            for(int j=0; j<num_item; j++){      // 옛날 창고에 있는 각 물건 개수 만큼 돌아감
                if(storage[i].equals(clean_storage[j])){      //정리된 창고 물건 이름이 = 물건 이름과 같아
                    clean_idx = j;  // 정리된 숫자
                    break;
                }
            }
            if(clean_idx == -1){    //정리된 창고 물건 개수, -1 왜인지 아직도 모름 -> -1 과 같으면
                clean_storage[num_item] = storage[i];     // 정리된 창고[물건갯수] = 물건을 정수로 표현함..그래서 틀림 -> 물건 이름으로 바꿈!!!
                clean_num[num_item] = num[i];
                num_item += 1;
            }
            else{
                clean_num[clean_idx] += num[i];
            }
        }

        // 아래 코드에는 틀린 부분이 없습니다.

        int num_max = -1;
        String answer = "";
        for(int i=0; i<num_item; i++){
            if(clean_num[i] > num_max){
                num_max = clean_num[i];
                answer = clean_storage[i];
            }
        }
        return answer;
    }
}
