class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] cnt = new int[n];
        for (int l:lost) {
            cnt[l-1]--;
        }
        for (int r : reserve) {
            cnt[r-1]++;
        }
        
        for(int i=0; i<n; i++) {
            if (cnt[i] < 0) {
                if (i !=0 && cnt[i-1] > 0) {
                    cnt[i-1]--;
                    cnt[i]++;
                } else if (i != n-1 && cnt[i+1] > 0) {
                    cnt[i+1]--;
                    cnt[i]++;
                }
            }
        }
        
        int answer = 0;
        for (int num : cnt) {
            if (num >= 0) {
                answer++;
            }
        }
        return answer;
    }
}