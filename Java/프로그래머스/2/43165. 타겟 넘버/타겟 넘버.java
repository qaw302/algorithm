class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        return dfs(numbers, target, 0, 0);
    }
    
    public int dfs(int[] numbers, int target, int depth, int sum) {

        if (depth == numbers.length) {
            if (sum == target) {
                return 1;
            } else {
                return 0;
            }
        }
        int a = dfs(numbers, target, depth+1, sum+numbers[depth]);
        int b = dfs(numbers, target, depth+1, sum-numbers[depth]);
        
        return a+b;
        
    }
}