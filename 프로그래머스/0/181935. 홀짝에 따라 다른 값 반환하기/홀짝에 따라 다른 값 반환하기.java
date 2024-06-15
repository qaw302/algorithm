class Solution {
    public int solution(int n) {
        int answer = 0;
        int evenoddflag = n % 2;
        for (int i = evenoddflag; i <= n; i+=2) {
            if (evenoddflag == 0) {
                answer += i*i;
            } else {
                answer += i;
            }
        }
        
        return answer;
    }
}