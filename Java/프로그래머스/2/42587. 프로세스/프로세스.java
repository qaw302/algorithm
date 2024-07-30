import java.util.Queue;
import java.util.ArrayDeque;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new ArrayDeque<>();
        
        for (int i=0; i<priorities.length; i++) {
            queue.offer(i);
        }
        
        while (!queue.isEmpty()) {
            Queue<Integer> temp = new ArrayDeque<>();
            
            boolean delay = false;
            int first = queue.poll();
            
            int queueSize = queue.size();
            for (int j=0; j<queueSize; j++) {
                int next = queue.poll();
                temp.offer(next);
                if (priorities[next] > priorities[first]) {
                    delay = true;
                }
            }

            queue = temp;
            if (delay) {
                queue.offer(first);
            } else if (first == location) {
                return priorities.length - queue.size();   
            }            
        }

        return 0;
    }
}