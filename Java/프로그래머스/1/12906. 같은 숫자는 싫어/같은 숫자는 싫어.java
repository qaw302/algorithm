import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> result = new ArrayList<>();
        int pre = -1;
        for (int num:arr) {
            if (pre != num) {
                result.add(num);
                pre = num;
            }
        }
        
        int[] answer = new int[result.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = result.get(i);
        }
        

        return answer;
    }
}