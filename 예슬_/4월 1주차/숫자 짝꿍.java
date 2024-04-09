class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        // 인덱스에 해당하는 숫자의 개수를 담을 배열
        int[] arrX = new int[10];
        int[] arrY = new int[10];

        // X와 Y에 등장하는 숫자의 개수를 arrX, arrY 배열에 저장
        countNumInArr(X, arrX);
        countNumInArr(Y, arrY);

        // 역순으로 순회하여 공통으로 존재하는 숫자를 answer에 추가
        for (int i = arrX.length - 1; i >= 0; i--) {
            while (arrX[i] >= 1 && arrY[i] >= 1) {
                arrX[i]--;
                arrY[i]--;

                answer.append(i);
            }
        }

        if (answer.toString().equals("")) {
            return "-1";
        } else if (answer.toString().startsWith("0")) {
            return "0";
        } else {
            return answer.toString();
        }
    }

    // 문자열에 있는 숫자 개수를 배열에 저장하는 메서드
    private void countNumInArr(String str, int[] arr) {
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - '0';
            arr[idx]++;
        }
    }
}



//주어진 코드는 주어진 문자열에서 각 숫자의 등장 횟수를 세어 배열에 저장하는 메서드입니다.
// 이 메서드는 문자열과 해당 문자열에서 숫자의 등장 횟수를 저장할 배열을 매개변수로 받습니다.

  //      설명을 상세히 하면:

    //    countNumInArr 메서드는 주어진 문자열과 해당 문자열에서 숫자의 등장 횟수를
//    저장할 배열을 매개변수로 받습니다.
    //  이 메서드는 문자열의 각 문자를 순회하면서 숫자를 찾습니다.
//  for 루프에서는 i 변수를 이용하여 문자열을 순회합니다.
    // 문자열의 각 문자는 charAt(i) 메서드를 통해 가져오며,
// 이를 숫자로 변환하기 위해 아스키 코드를 이용합니다.
// 문자 '0'의 아스키 코드를 뺌으로써 해당 문자가 나타내는 숫자를 얻습니다.
// 예를 들어, '1'의 아스키 코드는 49이고, '0'의 아스키 코드는 48이므로 '1' - '0'은 1이 됩니다.

    // 얻어진 숫자를 배열의 인덱스로 이용하여 해당 숫자의 등장 횟수를 1 증가시킵니다.

    // 이 메서드는 주어진 문자열에서 각 숫자의 등장 횟수를 세어 배열에 저장하는 기능을 합니다.