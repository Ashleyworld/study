class Solution {
    public String[] solution(String[] picture, int k) {
        int rows = picture.length; // 가로 방향
        int cols = picture[0].length(); // 세로 방향

        int newRows = rows * k;
        int newCols = cols * k;

        // 새로운 문자열 배열을 생성
        String[] newPicture = new String[newRows];


        for(int i = 0; i<newRows; i++){
            StringBuilder sb = new StringBuilder();
            int row = i / k;

            for(int j = 0; j < newCols; j++){
                int col = j/k;

                // 원본 그림 파일에서 해당 위치의 픽셀 값을 가져옵니다.
                char pixel = picture[row].charAt(col);
                sb.append(pixel);
            }

            newPicture[i] = sb.toString();
        }

        return newPicture;


    }
}