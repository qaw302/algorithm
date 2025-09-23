import java.util.Map;
import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> result = new HashMap<>();
        for (String name : participant) {
            result.put(name, result.getOrDefault(name, 0)+1);
        }
        
        for (String name : completion) {
            result.put(name, result.get(name)-1);    
        }
        
        String answer = "";
        for (String key : result.keySet()) {
            if (result.get(key) == 1) {
                answer = key;
            }
        }
        return answer;
    }
}