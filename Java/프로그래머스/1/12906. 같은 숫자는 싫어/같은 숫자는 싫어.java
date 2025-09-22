import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        LinkedList<Integer> q = new LinkedList<>();
        for (int num : arr) {
            
            if (q.isEmpty() || q.getLast() != num) {
                q.add(num);
            }
        }
        
        int[] answer = new int[q.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = q.poll();
        }

        return answer;
    }
}