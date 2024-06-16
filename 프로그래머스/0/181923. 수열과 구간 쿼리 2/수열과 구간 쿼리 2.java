class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int row = 0;
        for (int[] query : queries) {
            int idx = -1;
            for (int i=query[0]; i<=query[1]; i++) {
                if (arr[i] <= query[2]){
                    continue;
                }
                if (idx == -1 || arr[i] < arr[idx]) {
                    idx = i;
                }
            }
            answer[row] = idx == -1? -1: arr[idx];
            row++;
        }
        return answer;
    }
}