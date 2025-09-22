import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> q = new ArrayList<>();
        for (int num : arr) {
            if (q.isEmpty() || !q.get(q.size()-1).equals(num)) {
                q.add(num);
            }
        }
        
        int[] answer = new int[q.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = q.get(i);
        }

        return answer;
    }
}