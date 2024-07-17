class Solution {
    public String[] solution(String my_string) {
        String answer = "";
        for (String str : my_string.split(" ")) {
            if (str.length() > 0) {
                answer += str+",";
            }
        }
        return answer.split(",");
    }
}