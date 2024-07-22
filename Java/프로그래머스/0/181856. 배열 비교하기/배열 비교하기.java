class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            int sumArr1 = sum(arr1);
            int sumArr2 = sum(arr2);
            if (sumArr1 == sumArr2) {
                return 0;
            }
            return sumArr1 < sumArr2 ? -1 : 1;
        } else {
            return arr1.length < arr2.length ? -1 : 1;
        }
    }
    
    public int sum(int[] arr) {
        int result=0;
        for(int n : arr) {
            result +=n;
        }
        return result;
    }
}