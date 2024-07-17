class Solution {
    public String solution(String myString) {
        String answer = "";
        for (String s : myString.split("")) {
            answer += (s.equals("a") || s.equals("A"))?"A":s.toLowerCase();
        }
        return answer;
    }
}