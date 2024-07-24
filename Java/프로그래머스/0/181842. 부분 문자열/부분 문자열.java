class Solution {
    public int solution(String str1, String str2) {
        if (str1.length() < str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        
        return str1.contains(str2)? 1:0;
    }
}