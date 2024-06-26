class Solution {
    public String solution(String my_string, int[] indices) {
        String[] chars = my_string.split("");
        for (int idx : indices) {
            chars[idx] = "";
        }
        
        return String.join("", chars);
    }
}