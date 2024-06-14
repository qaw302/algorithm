class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int listSize = num_list.length;
        answer = new int[listSize + 1];
        for (int i=0; i < listSize; i++) {
            answer[i] = num_list[i];
        }
        if (num_list[listSize-2] < num_list[listSize-1]) {
            answer[listSize] = num_list[listSize-1] - num_list[listSize-2];
        } else {
            answer[listSize] = num_list[listSize-1] * 2;
        }
        
        return answer;
    }
}