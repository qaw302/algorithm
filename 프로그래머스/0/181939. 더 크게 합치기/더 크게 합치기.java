class Solution {
    public int solution(int a, int b) {
        int result1 = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int result2 = Integer.parseInt(String.valueOf(b)+String.valueOf(a));
        return result1 > result2 ? result1 : result2 ;
    }
}