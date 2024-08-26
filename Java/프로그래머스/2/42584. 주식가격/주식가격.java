import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] prices) {
        Deque<Integer> stack = new LinkedList<>();
        int[] answer = new int[prices.length];
        
        for (int i=0; i < prices.length; i++) {
            if (stack.isEmpty()) {
                stack.add(i);
            } else {
                while (!stack.isEmpty() && prices[stack.peekLast()] > prices[i]) {
                    answer[stack.peekLast()] = i - stack.pollLast();
                }
                stack.add(i);
            }
        }
        
        for (Integer i : stack) {
            answer[i] = prices.length-1 -i;
        }
        
        return answer;
    }
}