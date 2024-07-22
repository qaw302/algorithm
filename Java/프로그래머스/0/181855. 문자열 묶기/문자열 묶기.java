class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] counts = new int[strArr.length];
        
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