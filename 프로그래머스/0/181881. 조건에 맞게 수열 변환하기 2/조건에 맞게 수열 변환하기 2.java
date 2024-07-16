import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int[] preArr;
        int x = 0;
        do {
            ++x;
            preArr = arr.clone();
            for (int i=0; i<arr.length; i++) {
                if (arr[i] >= 50 && arr[i]%2==0) {
                    arr[i] /=2;
                } else if (arr[i]<50 && arr[i]%2!=0) {
                    arr[i] = arr[i]*2 + 1;
                }
            }
        } while (!Arrays.equals(preArr, arr));
        
        return x-1;
    }
}