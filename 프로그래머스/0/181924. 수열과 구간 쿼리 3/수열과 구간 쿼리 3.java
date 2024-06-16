class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i=0; i < queries.length; i++) {
            int[] row = queries[i];
            int temp = arr[row[0]];
            arr[row[0]] = arr[row[1]];
            arr[row[1]] = temp;
        }
        return arr;
    }
}