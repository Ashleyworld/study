class Solution {
    boolean solution(String s) {


        int pCount = 0, yCount = 0;
        String[] array = s.toLowerCase().split("");

        for(int i = 0; i<array.length; i++) {
            if("p".equals(array[i])) {
                pCount++;
            } else if("y".equals(array[i])){
                yCount++;
            }
        }
        if(pCount != yCount){
            return false;
        }

        return true;
    }
}


/*
* toLowerCase : 다 소문자로 바꿔버리는()
* toUpperCase : 다 대문자로 바꿔버리는()
*
* */