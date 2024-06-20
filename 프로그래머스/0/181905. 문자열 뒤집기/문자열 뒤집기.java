class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        answer += my_string.substring(0,s);
        String[] chars = my_string.substring(s,e+1).split("");
        int i = 0;
        int j = chars.length-1;
        while (i < j) {
            String temp = chars[i];
            chars[i++] = chars[j];
            chars[j--] = temp;
        }
        for(String c : chars) {
            answer += c;
        }
        if (e < my_string.length()) {
            answer += my_string.substring(e+1);
        }
        
        return answer;
    }
}