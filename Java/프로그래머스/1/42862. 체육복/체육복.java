class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] clothes = new int[n];
        for (int l:lost) {
            clothes[l-1]--;
        }
        for (int r:reserve) {
            clothes[r-1]++;
        }
        
        for (int i=0; i<n; i++) {
            if (clothes[i] == -1) {
                if (i>0 && clothes[i-1]>0) {
                    clothes[i-1]--;
                    clothes[i]++;
                } else if (i<n-1 && clothes[i+1]>0) {
                    clothes[i+1]--;
                    clothes[i]++;
                }
            }
            
        }
        
        int answer = 0;
        for (int c : clothes) {
            if (c >= 0) {
                answer++;
            }
        }
        return answer;
    }
}