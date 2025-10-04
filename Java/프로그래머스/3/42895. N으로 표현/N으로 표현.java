import java.util.*;

class Solution {
    public int solution(int N, int number) {
        HashMap<Integer, HashSet<Integer>> cases = new HashMap<>();
        if (N==number) return 1;
        int answer = -1;
        int i = 1;
        while(i<=8) {
            HashSet<Integer> set = new HashSet<>();
            int num = N;
            for (int n=1; n<i; n++) {
                num = num*10 + N;
            }
            set.add(num);
            
            for(int j=1; j<i; j++) {
                for(int a : cases.get(j)) {
                    for(int b : cases.get(i-j)) {
                        set.add(a+b);
                        set.add(a-b);
                        set.add(a*b);
                        if (b!=0) {
                            set.add(a/b);
                        }
                        if (set.contains(number)){
                            return i;
                        }
                    }
                }
            }
            cases.put(i, set);
            i++;
        }
        
        return answer;
    }
}