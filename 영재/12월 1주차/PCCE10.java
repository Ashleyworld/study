import java.util.*;

class Solution10 {
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        /*
        * data 데이터
        * code date maximum remain
        * ext 어떤 정보를 기준으로
        * val_ext 정보의 기준값
        * sort_by 정렬기준 문자열
        *
        * data에서 ext값이 val_ext보다 작은 데이터만 뽑은 후, sort_by에 해당하는 값을 기준으로 오름차순으로 정렬
        * */
        int[][] answer = {};
        List<int[]> list = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);

        for(int i = 0; i < data.length; i++){
            if(data[i][map.get(ext)] < val_ext){
                int[] temp = data[i];
                System.out.println(Arrays.toString(temp));
                list.add(temp);
            }
        }
        Collections.sort(list, (o1,o2) -> o1[map.get(sort_by)] - o2[map.get(sort_by)]);
        return list;
    }
}
public class PCCE10 {
    public static void main(String[] args) {

        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";
        List<int[]> solution = new Solution10().solution(data,ext,val_ext,sort_by);
        for(int[] list : solution){
            System.out.println(Arrays.toString(list));
        }
    }
}
