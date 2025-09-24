import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int col=0; col<commands.length; col++) {
            int[] command = commands[col];
            int i = command[0]-1;
            int j = command[1];
            int k = command[2]-1;
            
            int[] subarr = Arrays.copyOfRange(array, i, j);
            Arrays.sort(subarr);
            answer[col] = subarr[k];
        }
        return answer;
    }
}