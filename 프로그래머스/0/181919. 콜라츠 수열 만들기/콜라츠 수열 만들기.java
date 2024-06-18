import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> arr = new ArrayList<>();
        arr.add(n);
        while(n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n*3+1;
            }
            arr.add(n);
        }
              
        
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}