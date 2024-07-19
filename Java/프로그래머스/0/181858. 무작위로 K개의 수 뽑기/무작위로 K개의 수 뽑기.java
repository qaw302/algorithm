import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        int idx = 0;
        for (int i : arr) {
            if (idx == k) {
                break;
            }
            
            boolean hasNum = false;
            for (int num : answer) {
                if (num == i) {
                    hasNum = true;
                    break;
                }
            }
            if (!hasNum) {
                answer[idx++] = i;
            }
        }
        
        return answer;
    }
}