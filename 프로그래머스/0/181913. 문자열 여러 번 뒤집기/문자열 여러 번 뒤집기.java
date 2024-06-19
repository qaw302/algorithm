class Solution {
    public String solution(String my_string, int[][] queries) {
        String[] answer = my_string.split("");
        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];
            while(i < j) {
                String temp = answer[i];
                answer[i++] = answer[j];
                answer[j--] = temp;
            } 
        }
        
        return String.join("", answer);
    }
    
}