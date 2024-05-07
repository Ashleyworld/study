
import java.util.*;

class Solution{
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        HashMap<String,Integer> map = new LinkedHashMap<>();

        for(int i=0; i< name.length; i++){
            map.put(name[i], yearning[i]); // 추억하는 사람 이름에 점수 저장
        }

        for(int i=0; i< photo.length; i++){
            String[] persons = photo[i]; // 그룹별 배열 생성
            int score = 0;

            for(int j=0; j<persons.length; j++){

                String person = persons[j];
                if(map.containsKey(person)){ // map의 key에 photo 속 사람이 있다면
                    score+=map.get(person); // 점수 추가
                }
            }
            answer[i]=score;
        }
        return answer;
    }
}


/*
* 각 사람의 이름과 그리움 점수를 저장하는 HashMap을 생성합니다.
각 사진마다 찍힌 인물들의 그리움 점수를 계산하여 해당 사진의 추억 점수를 구합니다.
각 사진의 추억 점수를 배열에 저장하고 반환합니다.
코드에는 문제의 조건을 잘 반영하고 있으며, 주어진 입력에 대해 올바른 결과를 반환할 것으로 보입니다.
*
*
* */