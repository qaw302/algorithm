class Solution {
    public String[] solution(String[] strArr) {
        String answer = "";
        for (String str : strArr) {
            if (str.contains("ad")) {
                continue;
            }
            answer += str+",";
        }
        return answer.split(",");
    }
}