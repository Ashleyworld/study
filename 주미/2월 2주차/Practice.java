public class Practice {

            //배열 만들기2
    public int[] solution01(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int a = 0;
        for(int i = l; i <= r; i++) {
            String num =  String.valueOf(i);
            String[] nums = num.split("");
            int numLength =  nums.length;
            int count = 0;
            for (int j = 0; j < numLength; j++) {
                if (nums[j].equals("0")  nums[j].equals("5")) {
                    count++;
                }
            }
            if(count == numLength) {
                list.add(i);
            }
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        if(answer.length == 0) {
            answer = new int[] {-1};
            return answer;
        }
        return answer;
    }

//짝지어 제거하기
    public int solution02(String s)
    {
        int answer = -1;
        char[] carr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i=0;i<carr.length;i++) {
            char c = carr[i];
            // 스택이 비어있다면 현재 문자는 반복될 일이 없으므로 push
            if (stack.isEmpty()) stack.push(c);
                // 스택이 비어있지 않다면
            else {
                // 스택의 top확인(peek) - 만약 현재 문자와 같다면 반복이므로 스택에서 pop하고 현재 문자도 스택에 넣지 않음
                // 이렇게 되면 스택에는 반복이 발생하는 이전문자와 현재문자 모두 들어가지 않게 됨 (반복제거)
                if (stack.peek() == c) {
                    stack.pop();
                    // 스택의 top이 현재 문자와 다르다면 반복이 아니므로 push
                } else {
                    stack.push(c);
                }
            }
        }
        // 스택에 남아있는 값들은 반복되지 않는 값들임 즉, 비어있어다면 모두 짝지어 반복된 것
        return stack.isEmpty() ? 1 : 0;
    }
    //https://velog.io/@dhk22/프로그래머스-짝지어-제거하기-Java

//다항식 더하기
    public String solution03(String polynomial) {
        int xNum = 0; int num = 0;

        for (String s : polynomial.split(" ")) {
            if (s.contains("x")) // x가 있으면
                xNum += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
            else if (!s.equals("+"))
                num += Integer.parseInt(s);
        }

        return (xNum != 0 ? xNum > 1 ? xNum + "x" : "x" : "")
                + (num != 0 ? (xNum != 0 ? " + " : "")
                + num : xNum == 0 ? "0" : "");
    }
//https://velog.io/@ro_sie/프로그래머스-JAVA-다항식-더하기


            //카펫
    public int[] solution04(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;

        for (int i = 3; i < sum; i++) {
            int j = sum / i;

            if (sum % i == 0 && j >= 3) {
                int col = Math.max(i, j);
                int row = Math.min(i, j);
                int center = (col - 2) * (row - 2);

                if (center == yellow) {
                    answer[0] = col;
                    answer[1] = row;
                    return answer;
                }
            }
        }
        return answer;

    } // https://easybrother0103.tistory.com/110


//가장 가까운 같은 글자
    public int[] solution05(String s) {
        int[] answer = new int[s.length()];

        for(int i=0;i<s.length();i++){
            if(i !=0){
                int idx = s.substring(0,i).lastIndexOf(s.charAt(i));
                if(idx != -1){
                    answer[i] = i-idx;

                }
                else{
                    answer[i] = idx;
                }
            }
            else{
                answer[i] = -1;
            }
        }

        return answer;
    } //https://velog.io/@se_bb/프로그래머스Java-가장-가까운-같은-글자


//숫자 문자열과 영단어
    public int solution06(String s) {
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        //숫자가 0~9까지 10개로 정해져 있으므로 i<10
        for(int i=0; i<10; i++){
            s = s.replace(num[i], Integer.toString(i));
        }

        int answer = Integer.parseInt(s);

        return answer;
    }

//코드 처리하기
    public String solution07(String code) {

        String answer = "";
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') mode = 1 - mode;
            else if (i % 2 == mode) answer += code.charAt(i);
        }
        return "".equals(answer) ? "EMPTY" : answer;
    } //https://velog.io/@js4183/프로그래머스-Lv.0-코드-처리하기.java


//푸드 파이트 대회
    public String solution08(int[] food) {
        // 음식을 순서대로 담을 StringBuilder 선언
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            // i번 음식을 2로 나눈 개수만큼 StringBuilder에 추가
            int count = food[i] / 2;
            sb.append(String.valueOf(i).repeat(count));
        }

        // StringBuilder에 추가된 음식에 0과 reverse된 문자열 더하기
        String answer = sb + "0";
        answer += sb.reverse();

        return answer;

    } //https://ittrue.tistory.com/456


//K번째수
    public int[] solution09(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            // 원본 배열, 복사할 시작인덱스, 복사할 끝인덱스

            Arrays.sort(temp); // 배열 오름차순 정렬
            answer[i] = temp[commands[i][2] - 1];
        }
        return answer;
    } //https://velog.io/@imok-_/프로그래머스-K번째수-java


//문자열 내 마음대로 정렬하기
    public String[] solution10(String[] strings, int n) {
        String[] answer = {};
        answer = new String[strings.length];
        int cnt = 0;

        Arrays.sort(strings);

        for(int i = 97; i < 123; i++) {
            for(int j = 0; j < strings.length; j++) {
                if(strings[j].charAt(n) == (char)i) {
                    answer[cnt++] = strings[j];
                }
            }
        }
        return answer;
    } // https://discover.tistory.com/42

    //두 개 뽑아서 더하기
    public int[] solution11(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<numbers.length; i++){
            for(int j=i+1;j<numbers.length; j++){
                int a = numbers[i]+numbers[j];
                if (list.indexOf(a) < 0){
                    list.add(a);
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }



//[1차] 비밀지도

    public String[] addZero(String bin, int n) {
        if(bin.length() != n) {
            String zero = "";
            for(int i=0; i<n-bin.length(); i++) {
                zero += "0";
            }
            bin = zero + bin;
        }

        return bin.split("");
    }

    public String[] solution12(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i=0; i<n; i++) {
            String row = "";
            String bin1 = Integer.toBinaryString(arr1[i]);
            String bin2 = Integer.toBinaryString(arr2[i]);

            String[] a1 = addZero(bin1, n);
            String[] a2 = addZero(bin2, n);

            for(int j=0; j<n; j++) {
                if("1".equals(a1[j]) || "1".equals(a2[j])) row += "#";
                else row += " ";
            }

            answer[i] = row;
        }

        return answer;
    } //https://velog.io/@hi_potato/프로그래머스-1차-비밀지도-JAVA


//영어 끝말잇기
    public int[] solution13(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<String>();
        boolean flag = true;

        for(int i=0; i<words.length; i++){
            if(list.contains(words[i])){   // 이전에 등장한 단어인경우
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                flag = false;
                break;
            }

            list.add(words[i]); // 현재 단어 리스트에 넣기

            // 이전 끝단어와 현재 첫단어가 다른경우 - 끝말잇기가 아닌경우
            if(i>0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                flag = false;
                break;
            }
        }
        if(flag) return new int[]{0, 0};
        return answer;
    } //https://zzang9ha.tistory.com/198



//점프와 순간 이동
    public int solution14(int n) {
        int ans = 0;

        while(n != 0){
            if(n % 2 == 0){
                n /= 2;
            } else {
                n--;
                ans++;
            }
        }

        return ans;
    } //https://velog.io/@hyeon930/프로그래머스-점프와-순간-이동-Java


//출력
    public static void main(String[] args) {
        String msg =
                "Spring is beginning"
                ;
        int val1 =
                3
                ;
        String val2 =
                "3"
                ;

        System.out.println(msg);
        System.out.println(val1 + 10);
        System.out.println(val2 + "10");
    }


//구명보트
    public int solution16(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int index = 0;

        for (int i = people.length - 1; i >= index; i--) {
            if (people[i] + people[index] <= limit) {
                index++;
                answer++;
            }
            else {
                answer++;
            }
        }

        return answer;
    } //https://easybrother0103.tistory.com/126


//배열 조각하기
    public int[] solution17(int[] arr, int[] query) {
        for(int i =0; i<query.length; i++) {
            if(i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            }else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }


//문자열 출력하기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        System.out.println(a);

    }


    //콜라 문제
    public int solution19(int a, int b, int n) {
        int count = 0;
        int num = n;

        while(num >= a) {
            count += num / a * b;
            num = num / a * b + num % a;
        }
        return count;
    }

    //예상 대진표
    public int solution20(int n, int a, int b)
    {
        int round = 0;
        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            round++;
        }
        return round;
    } //https://ilmiodiario.tistory.com/121

}
