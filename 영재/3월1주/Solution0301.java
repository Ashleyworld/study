import java.util.*;

public class Solution0301 {

    //2016년
    public String solution01(int a, int b) {
        String answer = "";

        Calendar cal = Calendar.getInstance();
        cal.set(2016, a - 1, b);
        int day = cal.get(Calendar.DAY_OF_WEEK);

        switch (day) {
            case 1:
                answer = "SUN";
                break;
            case 2:
                answer = "MON";
                break;
            case 3:
                answer = "TUE";
                break;
            case 4:
                answer = "WED";
                break;
            case 5:
                answer = "THU";
                break;
            case 6:
                answer = "FRI";
                break;
            case 7:
                answer = "SAT";
                break;
        }
        return answer;
    }

    //폰켓몬
    public int solution02(int[] nums) {
        int answer = nums.length / 2;

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        if (set.size() > answer) {
            return answer;
        } else {
            return set.size();
        }
    }

    //다음에 올 숫자
    public int solution3(int[] common) {
        int answer = 0;

        if ((common[1] - common[0]) == (common[2] - common[1])) {
            answer = common[common.length - 1] + (common[1] - common[0]);
        } else {
            answer = common[common.length - 1] * (common[1] / common[0]);
        }
        return answer;
    }

    //모의 고사
    public List<Integer> solution04(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % 5]) score[0]++;
            if (answers[i] == two[i % 8]) score[1]++;
            if (answers[i] == three[i % 10]) score[2]++;
        }

        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            if (maxScore == score[i]) list.add(i + 1);
        }

        return list;
    }

    //과일 장수
    public int solution05(int k, int m, int[] score) {
        int answer = 0;
        int boxNum = score.length / m;
        Arrays.sort(score);

        if (score.length % m == 0) {
            for (int i = 0; i < boxNum; i++) {
                answer += (score[i * m]) * m * 1;
            }
        } else {
            int rest = score.length % m;
            for (int i = 0; i < boxNum; i++) {
                answer += (score[rest + (i * m)]) * m * 1;
            }
        }

        return answer;
    }

    //기사단원의 무기
    public int solution06(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int cnt = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) {
                    cnt++;
                } else if (i % j == 0) {
                    cnt += 2;
                }
            }

            answer += cnt > limit ? power : cnt;
        }

        return answer;
    }

    //연속된 수의 합
    public int[] solution07(int num, int total) {
        int[] answer = new int[num];
        int start = (total / num) - ((num - 1) / 2);

        for (int i = 0; i < num; i++) {
            answer[i] = start;
            start++;
        }

        return answer;
    }

    //소수 만들기
    public int solution08(int[] nums) {
        int answer = 0;

        // 합을 저장할 저장공간 선언
        ArrayList<Integer> list = new ArrayList<Integer>();
        // for문을 이용하여 배열의 합을 구한다.
        for (int i = 0; i < nums.length; i++) {
            if (i + 2 >= nums.length) break;
            for (int j = i + 1; j < nums.length; j++) {
                for (int h = j + 1; h < nums.length; h++) {
                    list.add(nums[i] + nums[j] + nums[h]);
                }
            }
        }

        // 저장된 합이 소수인지 판별한다.
        for (Integer i : list) {
            int count = 2;
            answer++;
            while (count < i) {
                // 저장된 값이 count로 나눴을 때 나머지가 0이라면 소수가 아니기 때문에 answer의 값을 더하지 않는다.
                if (i % count == 0) {
                    answer--;
                    break;
                }
                count++;
            }
        }
        return answer;
    }

    //소수 찾기
    public int solution09(int n) {
        int answer = 0;
        int[] numbers = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            numbers[i] = i;
        }

        for (int i = 2; i < n; i++) {

            if (numbers[i] == 0) continue;

            for (int j = 2 * i; j <= n; j += i) {
                numbers[j] = 0;
            }
        }

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] != 0) {
                answer++;
            }
        }

        return answer;
    }
}
