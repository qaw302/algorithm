import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int num : scoville) {
            q.add(num);
        }
        
        while (!q.isEmpty() && q.peek() < K) {
            if (q.size() < 2) {
                return -1;
            }
            
            int min = q.poll();
            int nextMin = q.poll();
            
            int mix = min + (nextMin*2);
            q.add(mix);
            answer++;
        }
        
        return answer;
    }
}