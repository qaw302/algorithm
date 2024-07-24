class Solution {
    public int[][] solution(int[][] arr) {
        int size = arr.length;
        for (int i=0; i<arr.length; i++) {
            if (arr[i].length > size) {
                size = arr[i].length;
            }
        }
        
        int[][] answer = new int[size][size];
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}