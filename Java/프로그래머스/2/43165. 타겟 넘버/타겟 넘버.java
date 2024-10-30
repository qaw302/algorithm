import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[] numbers, int target) {
        List<Integer> results = new ArrayList<>();
        results.add(0);
        for(int num : numbers) {
            List<Integer> temp = new ArrayList<>();
            for (int result : results) {
                temp.add(result + num);
                temp.add(result - num);
            }
            results = temp;
        }
        int answer = 0;
        for (int result:results){
            if (result==target){
                answer++;
            }
        }
        return answer;
    }
}