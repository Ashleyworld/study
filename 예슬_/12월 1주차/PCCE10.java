import java.util.*;

class PCCE10 {
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
        PCCE10 solution = new PCCE10();
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
 *
 *
 *
 *
 *  */