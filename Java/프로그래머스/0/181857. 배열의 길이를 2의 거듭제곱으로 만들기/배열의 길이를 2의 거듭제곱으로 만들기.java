class Solution {
    public int[] solution(int[] arr) {
        int power = getPower(arr.length);
        power += (int)Math.pow(2, power) == arr.length? 0 : 1;
        
        int[] answer = new int[(int)Math.pow(2, power)];
        System.arraycopy(arr, 0, answer,0 , arr.length);
        
        return answer;
    }
    
    public int getPower(int size) {
        if (size < 2) {
            return 0;
        }
        
        return 1 + getPower(size / 2);
    }
}