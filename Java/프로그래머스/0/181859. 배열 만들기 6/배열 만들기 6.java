import java.util.List;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new LinkedList<>();
        for (int i=0; i<arr.length; i++) {
            if (list.size() > 0 && list.get(list.size()-1)==(arr[i])) {
                list.remove(list.size()-1);
            } else {
                list.add(arr[i]);
            }
        }
        if (list.size() == 0) {
            return new int[]{-1};
        }
        
        int[] stk = new int[list.size()];
        for (int i=0; i<stk.length; i++) {
            stk[i] = list.get(i);
        }
        return stk;
    }
}