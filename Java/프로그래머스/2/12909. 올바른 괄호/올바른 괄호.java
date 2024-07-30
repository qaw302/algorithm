import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    boolean solution(String s) {
        Deque<String> stack = new ArrayDeque<>();
        for (String str: s.split("")) {
            if (str.equals("(")) {
                stack.push(s);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}