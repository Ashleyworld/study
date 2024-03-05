import java.util.*;
class Solution {
    public String solution(int a, int b) {
        String day = "" ;
        // a 월, b 일

        Calendar cal = Calendar.getInstance();
        // 캘린더 객체를 가져온다.

        cal.set(2016,a -1,b);
        // 2016년 a월 b일을 설정, Month는 0부터 시작하기 때문

        int dayNum = cal.get(Calendar.DAY_OF_WEEK);
        // 설정된 날짜의 요일을 가져온다.

        switch(dayNum){
            case 1: day = "SUN";
                break;
            case 2: day = "MON";
                break;
            case 3: day = "TUE";
                break;
            case 4: day = "WED";
                break;
            case 5: day = "THU";
                break;
            case 6: day = "FRI";
                break;
            case 7: day = "SAT";
                break;
        }
        return day ;
    }
}
