import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> types = new HashSet<>();
        
        for (int type : nums) {
            types.add(type);
        }
        
        return types.size() < nums.length/2? types.size() : nums.length/2;
    }
}