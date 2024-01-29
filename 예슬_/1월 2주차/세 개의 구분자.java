import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<String>();
        String temp = "";
        for(int i = 0; i<myStr.length(); i++){

            char value = myStr.charAt(i);

            if(value == 'a' || value == 'b' || value ==
                    'c'){
                if(!temp.isEmpty()){
                    list.add(temp);
                    temp = "";
                }
            }else{
                temp += value;
            }
        }
        if(!temp.isEmpty()){
            list.add(temp);
            temp = "";
        }
        if(list.isEmpty()){
            list.add("EMPTY");
        }
        return list.toArray(new String[0]);
        // 함수의 반환 타입을 String 배열로 변경

    }
}

/*
* List<String> 에서 String[] 로 변환할 수 없다는 내용의 에러가 나옴
* 함수 시그니처가 String[] 을 반환하도록 선언되어 있어서 오류 발생
* 이를 해결하기 위해 List<String>을 String[]로 변환하여
* 반환하거나 함수의 반환 타입을 List<String>으로 변경해야 합니다.
*
* */

import java.util.*;

class Solution {
    public List solution(String myStr) {
        List<String> list = new ArrayList<String>();
        String temp = "";
        for(int i = 0; i<myStr.length(); i++){

            char value = myStr.charAt(i);

            if(value == 'a' || value == 'b' || value ==
                    'c'){
                if(!temp.isEmpty()){
                    list.add(temp);
                    temp = "";
                }
            }else{
                temp += value;
            }
        }
        if(!temp.isEmpty()){
            list.add(temp);
            temp = "";
        }
        if(list.isEmpty()){
            list.add("EMPTY");
        }
        return list;


    }
}