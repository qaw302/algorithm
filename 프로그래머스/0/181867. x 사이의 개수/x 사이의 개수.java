class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        String[] o = myString.split("x",-1);
        answer = new int[o.length];
        for (int i=0; i<o.length; i++) {
            answer[i] = o[i].length();
        }
        return answer;
    }
}