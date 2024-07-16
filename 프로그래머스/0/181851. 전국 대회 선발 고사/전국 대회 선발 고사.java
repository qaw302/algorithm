class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] idxArr = new int[rank.length];
        
        for (int i=0; i<rank.length; i++) {
            idxArr[rank[i]-1] = i;
        }
        
        int digit = 10000;
        for (int idx : idxArr) {
            if (attendance[idx] && digit!=0) {
                answer+=idx*digit;
                digit/=100;
            }
        }
        
        return answer;
    }
}