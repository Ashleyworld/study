public class PCCE1 {
    public static void main(String[] args) {
        String msg = "Spring is beginning";
        int val1 = 3;
        String val2 = "3";
        System.out.println(msg);
        System.out.println(val1 + 10);
        System.out.println(val2 + "10");
    }
}

/*
* String 이라서 그대로 복붙하고 "";로 형식 맞춤
* int 라서 숫자 그대로 3 넣음, 그러면 3+10이 실행됨
* String 이라서 "" 안에 숫자를 넣어줌 그러면 310 출력됨
* */