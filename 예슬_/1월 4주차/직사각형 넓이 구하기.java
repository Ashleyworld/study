class Solution {
    public int solution(int[][] dots) {
        int w = 0;
        int h = 0;
        int x1 = dots[0][0];
        int y1 = dots[0][1];

        for (int i = 1; i < dots.length; i++) {
            int x2 = dots[i][0];
            int y2 = dots[i][1];

            // 현재 좌표와 이전 좌표 간의 차이 계산
            int dx = Math.abs(x1 - x2);
            int dy = Math.abs(y1 - y2);

            // 길이가 0이 아닌 경우에만 업데이트
            if (dx != 0) w = Math.max(w, dx);
            if (dy != 0) h = Math.max(h, dy);

            x1 = x2;
            y1 = y2;
        }

        return w * h;
    }
}