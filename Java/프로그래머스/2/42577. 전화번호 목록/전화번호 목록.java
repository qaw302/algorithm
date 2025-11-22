import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> nums = new HashSet<>();
        for (String number : phone_book) {
            nums.add(number);
        }
        for (String num : nums) {
            for (int i=1; i<num.length(); i++) {
                if (nums.contains(num.substring(0, i))){
                    return false;
                }
            }
        }
        return true;
    }
}