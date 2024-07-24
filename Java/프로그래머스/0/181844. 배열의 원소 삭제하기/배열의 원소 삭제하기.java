import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<delete_list.length; j++) {
                if (arr[i]==delete_list[j]) {
                    arr[i] = 0;
                }
            }
        }
        List<Integer> list = new ArrayList();
        for (int num : arr) {
            if (num !=0) {
                list.add(num);
            }
        }
        int[] answer = new int[list.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}