class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        
        for (int[] s : sizes) {
            int size1 = Math.max(width, s[0]) * Math.max(height, s[1]);
            int size2 = Math.max(width, s[1]) * Math.max(height, s[0]);
            
            if (size1 < size2) {
                width = Math.max(width, s[0]);
                height = Math.max(height, s[1]);
            } else {
                width = Math.max(width, s[1]);
                height = Math.max(height, s[0]);
            }
            
        }
        
        int answer = width * height;
        return answer;
    }
}
