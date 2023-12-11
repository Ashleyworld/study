import java.util.*;

public class PCCE10 {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> colOrder = new HashMap<>();
        colOrder.put("code", 0);
        colOrder.put("date", 1);
        colOrder.put("maximum", 2);
        colOrder.put("remain", 3);

        List<int[]> newData = new ArrayList<>();
        for (int[] singleData : data) {
            if (singleData[colOrder.get(ext)] < val_ext) {
                newData.add(singleData);
            }
        }

        newData.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[colOrder.get(sort_by)], o2[colOrder.get(sort_by)]);
            }
        });

        return newData.toArray(new int[0][]);
    }

}
