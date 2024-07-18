class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        String[] o = myString.split("x");
        int size = o.length + (myString.lastIndexOf("x") == myString.length()-1? 1:0);
        answer = new int[size];
        for (int i=0; i<o.length; i++) {
            answer[i] = o[i].length();
        }
        return answer;
    }
}