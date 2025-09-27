import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n];
        for (int r: reserve) {
            students[r-1]++;
        }
        
        for (int l : lost) {
            students[l-1]--;
        }
        
        
        if (students[0] == -1 && students[1] == 1) {
            students[0]++;
            students[1]++;
            
        }
        
        for (int i=1; i<n-1; i++) {
            if (students[i] == -1) {
                if (students[i-1] == 1) {
                    students[i]++;
                    students[i-1]--;
                    
                } else if (students[i+1] == 1) {
                    students[i]++;
                    students[i+1]--;
                }
            }
        }
        
        if (students[n-1] == -1 && students[n-2] == 1) {
            students[n-1]++;
            students[n-2]++;
            
        }
        
        int answer = 0;
        for (int s : students) {
            if (s >= 0 ) answer ++;
        }
        return answer;
    }
}