import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> arr = new ArrayList<>();
        
        for (int i=l; i<=r; i++) {
            if (String.valueOf(i).matches("[05]+")) {
                arr.add(i);
            }
        }
        
        if (arr.size() == 0) {
            return new int[]{-1};
        }
        int[] answer = new int[arr.size()];
        for (int i=0; i<arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}