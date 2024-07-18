import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[abc]+", ",");
        if (myStr.startsWith(",")) {
            myStr = myStr.length() == 1? "EMPTY" : myStr.substring(1);
        }
        
        return myStr.split(",");
    }
}