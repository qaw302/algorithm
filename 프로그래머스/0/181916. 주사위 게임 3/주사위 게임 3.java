import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] input = {a, b, c, d};
        Arrays.sort(input);
        
        if (input[0] == input[3]) {
            return 1111 * input[0];
        } else if (input[0] == input[2] || input[1] == input[3]) {
            return (int) Math.pow(10*input[1] + (input[0] + input[3] - input[1]), 2);
        } else if (input[0] == input[1] && input[2] == input[3]) {
            return (input[0] + input[2]) * Math.abs(input[0] - input[2]);
        } else if (input[0] == input[1]) {
            return input[2] * input[3];
        } else if (input[1] == input[2]) {
            return input[0] * input[3];
        } else if (input[2] == input[3]) {
            return input[0] * input[1];
        } else {
            return input[0];
        }
    }
    
}