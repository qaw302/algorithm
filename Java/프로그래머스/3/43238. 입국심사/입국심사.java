import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long left = 1;
        long right = (long) Arrays.stream(times).max().getAsInt() * n;
        long answer = right;
        
        while (left <= right) {
            long mid = (left + right) / 2;
            long processed = 0;
            
            for (int time : times) {
                processed += mid / time;  // mid 시간 동안 처리 가능한 인원
                if (processed >= n) break; // 이미 충분하면 중단
            }
            
            if (processed >= n) { 
                answer = mid;
                right = mid - 1; // 더 짧은 시간 탐색
            } else {
                left = mid + 1;  // 시간이 부족하니 늘려야 함
            }
        }
        
        return answer;
    }
}