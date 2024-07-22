import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        for (int i=0; i<num_list.length; i++) {
            for (int j=1; j<num_list.length-i; j++) {
                if (num_list[j-1] > num_list[j]) {
                    int temp = num_list[j-1];
                    num_list[j-1] = num_list[j];
                    num_list[j] = temp;
                }   
            }
        }
        return Arrays.copyOf(num_list, 5);
    }
}