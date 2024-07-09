//1. 배열의 길이에 따라 다른 연산하기

class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 1 && i % 2 == 0) {
                answer[i] = arr[i] + n;
            } else if (arr.length % 2 == 0 && i % 2 == 1) {
                answer[i] = arr[i] + n;
            } else {
                answer[i] = arr[i];
            }
        }

        return answer;
    }
}


// 2. 문자열 바꿔서 찾기

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = "";

        for(int i=0; i<myString.length(); i++) {
            if("A".equals(myString.substring(i,i+1))) {
                str += "B";
            }else {
                str += "A";
            }
        }
        if( str.contains(pat)) {
            answer = 1;
        }else {
            answer = 0;
        }
        return answer;
    }
}

// 3. 배열 비교하기
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sum1 = 0; // arr1의 원소들의 합을 저장할 변수
        int sum2 = 0; // arr2의 원소들의 합을 저장할 변수

        // arr1의 원소들의 합 계산
        for (int num : arr1) {
            sum1 += num;
        }

        // arr2의 원소들의 합 계산
        for (int num : arr2) {
            sum2 += num;
        }

        // 대소관계 비교
        if (arr1.length > arr2.length || (arr1.length == arr2.length && sum1 > sum2)) {
            return 1;
        } else if (arr1.length < arr2.length || (arr1.length == arr2.length && sum1 < sum2)) {
            return -1;
        } else {
            return 0;
        }
    }
}

// 4. 배열의 원소만큼 추가하기

        import java.util.ArrayList;
        import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();

        for (int num : arr) {
            for (int i = 0; i < num; i++) {
                result.add(num);
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}

// 5. 공백으로 구분하기 2
class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.trim().split("\\s+");
        return answer;
    }
}



// 6. n보다 커질 때까지 더하기
class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int i=0; i<numbers.length; i++){
            answer += numbers[i];
            if(answer>n){
                break;
            }
        }
        return answer;
    }
}

// 7. 원하는 문자열 찾기

class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();

        if (myString.contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}