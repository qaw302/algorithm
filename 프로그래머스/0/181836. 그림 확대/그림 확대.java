class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        for (int i=0; i<answer.length; i+=k) {
            String result = "";
            for (String c : picture[i/k].split("")) {
                result += c.repeat(k);
            }
            
            for (int j=i; j<i+k; j++) {
                answer[j] = result;
            }
        }
        return answer;
    }
}