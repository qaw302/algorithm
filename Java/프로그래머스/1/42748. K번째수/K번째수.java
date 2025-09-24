import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int col=0; col<commands.length; col++) {
            int[] command = commands[col];
            int i = command[0];
            int j = command[1];
            int k = command[2];
            
            int[] subarr = new int[j-i+1];
            System.arraycopy(array, i-1, subarr, 0, j-i+1);
            List<Integer> list = new LinkedList<>();
            for (int num:subarr){
                list.add(num);
            }
            Collections.sort(list);
            
            answer[col] = list.get(k-1);
        }
        return answer;
    }
}