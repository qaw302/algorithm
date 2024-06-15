class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        for (int i = 0; i < str1.length(); i++) {
            answer += str1.toCharArray()[i];
            answer += str2.toCharArray()[i];
        }
        return answer;
    }
}