import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
        myString = myString.replaceAll("[ ]+", "");
        if (myString.startsWith("x")) {
            myString = myString.substring(1);
        }
        String[] answer = myString.split("[x]+");
        Arrays.sort(answer);
        return answer;
    }
}