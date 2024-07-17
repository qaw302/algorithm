class Solution {
    public String[] solution(String[] strArr) {
        String answer = "";
        for (String str : strArr) {
            if (str.contains("ad")) {
                continue;
            }
            answer += str+",";
        }
        if (answer.lastIndexOf(",")==answer.length()-1) {
            answer = answer.substring(0, answer.length()-1);
        }
        return answer.split(",");
    }
}