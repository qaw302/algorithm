import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int s : scoville) {
            q.add(s);
        }
        
        int answer = 0;
        while(!q.isEmpty() && q.peek() < K) {
            if (q.size() < 2) {
                return -1;
            }
            int min = q.poll();
            int nextMin = q.poll();
            q.add(min + (nextMin*2));
            answer++;
        }
        return answer;
    }
}