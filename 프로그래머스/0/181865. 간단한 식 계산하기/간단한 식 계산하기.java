class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] component = binomial.split(" ");
        int a = Integer.parseInt(component[0]);
        int b = Integer.parseInt(component[2]);
        switch (component[1]) {
            case "+" : answer = a+b; break;
            case "-" : answer = a-b; break;
            case "*" : answer = a*b; break;
        }
        
        return answer;
    }
}