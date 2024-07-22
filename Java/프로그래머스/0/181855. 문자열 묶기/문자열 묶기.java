class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] counts = new int[30];
        
        for (String str : strArr) {
            counts[str.length()-1]++;
        }
        
        for (Integer count : counts) {
            if (answer < count) {
                answer = count;
            }
        }
        return answer;
    }
}