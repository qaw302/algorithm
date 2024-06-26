class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (Character c : my_string.toCharArray()) {
            if (c <= 90) {
                answer[c-'A']++;
            } else {
                answer[26 + c-'a']++;
            }
        }
        return answer;
    }
}