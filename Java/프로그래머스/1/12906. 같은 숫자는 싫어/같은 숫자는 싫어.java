import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> q = new LinkedList<>();
        int pre = -1;
        for (int num : arr) {
            if (pre != num) {
                q.add(num);
                pre = num;
            }
        }
        
        int[] answer = new int[q.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = q.poll();
        }
        
        return answer;
    }
}