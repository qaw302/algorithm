import java.util.*;
class Solution {
    public int solution(int N, int number) {
        if (N == number) {
            return 1;
        }
        
        ArrayList<Set<Integer>> dp = new ArrayList<>(number);
        dp.add(Collections.emptySet()); 
        dp.add(new HashSet<>());
        dp.get(1).add(N);
        
        int answer = 0;
        for (int i=2; i<=number; i++) {  // 지금 생성할 i = dp 인덱스
            Set<Integer> s = new HashSet<>();  
            
            int temp = N;
            for (int k=1; k<i; k++) {
                temp = temp*10 + N;
            }
            s.add(temp);
            
            for (int j=1; j<i; j++) {  //j dp[x] 의 요소 인덱스
                for (Integer val1 : dp.get(i-j)) {
                    for (Integer val2 : dp.get(j)) {
                        s.add(val1+val2);
                        s.add(val1-val2);
                        s.add(val1*val2);
                        if (val2 != 0) {
                            s.add(val1/val2);
                        }
                    }
                }
            }

            if (s.contains(number)) {
                answer = i;
                break;
            } else {
                dp.add(s);
            }
        }
        
        return answer <= 8 ? answer : -1;
    }
}