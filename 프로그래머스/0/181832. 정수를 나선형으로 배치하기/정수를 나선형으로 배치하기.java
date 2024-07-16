class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int x=-1;
        int y=0;
        int direction = 1;
        int number = 1;
        
        while (n > 0) {
            for (int i=0; i<n; i++) {
                x += direction;
                answer[y][x] = number++;
            }
            n--;
            for (int i=0; i<n; i++) {
                y += direction;
                answer[y][x] = number++;
            }
            direction*=-1;
        }
        return answer;
    }
}