import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        for (String str : intStrs) {
            int part = Integer.parseInt(str.substring(s,s+l));
            if (k < part) {
                answer.add(part);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}