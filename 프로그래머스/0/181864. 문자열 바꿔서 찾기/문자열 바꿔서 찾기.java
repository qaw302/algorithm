class Solution {
    public int solution(String myString, String pat) {
        String answer = "";
        for (char c : myString.toCharArray()) {
            if (c == 'A') {
                answer += "B";
            } else if (c == 'B') {
                answer += "A";
            }
        }
        return answer.indexOf(pat) != -1 ? 1:0;
    }
}