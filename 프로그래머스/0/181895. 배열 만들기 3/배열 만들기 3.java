class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int start0 = intervals[0][0];
        int start1 = intervals[1][0];
        int end0 = intervals[0][1];
        int end1 = intervals[1][1];
        
        int[] answer = new int[end0-start0+1 + end1-start1+1];
        
        int idx = 0;
        for (int i = start0; i<= end0; i++) {
            answer[idx++] = arr[i];
        }
        
        for (int j = start1; j<=end1; j++) {
            answer[idx++] = arr[j];
        }
        
        return answer;
    }
}