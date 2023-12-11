import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        List<int[]> filterData = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);

        // ext 값에 해당하는 index 추출
        int idx = map.get(ext);

        // ext 값이 val_ext 보다 작은 데이터 필터링
        for (int[] item : data) {
            if (item[idx] < val_ext) {
                filterData.add(item);
            }
        }

        // 필터링된 데이터를 sort_by 기준으로 오름차순 정렬
        filterData.sort(new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[map.get(sort_by)], b[map.get(sort_by)]);
            }
        });

        int[][] answer = new int[filterData.size()][];
        answer = filterData.toArray(answer);

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Soultion();
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";

        int[][] result = solution.solution(data, ext, val_ext, sort_by);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }

    }
}

/*
 * 1. 정수를 저장할 변수 n을 만들고 board의 길이를 저장합니다.
2. 같은 색으로 색칠된 칸의 개수를 저장할 변수 count를 만들고 0을 저장합니다.
3. h와 w의 변화량을 저장할 정수 리스트 dh, dw를 만들고 각각 [0, 1, -1, 0], [1, 0, 0, -1]을 저장합니다.
4. 반복문을 이용해 i 값을 0부터 3까지 1 씩 증가시키며 아래 작업을 반복합니다.
    4-1. 체크할 칸의 h, w 좌표를 나타내는 변수 h_check, w_check를 만들고 각각 h + dh[i], w + dw[i]를 저장합니다.
    4-2. h_check가 0 이상 n 미만이고 w_check가 0 이상 n 미만이라면 다음을 수행합니다.
        4-2-a. board[h][w]와 board[h_check][w_check]의 값이 동일하다면 count의 값을 1 증가시킵니다.
5. count의 값을 return합니다.
 *
 *  */