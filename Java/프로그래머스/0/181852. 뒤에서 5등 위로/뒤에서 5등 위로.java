import java.util.Arrays;

class Solution {
    
    public static int[] solution(int[] num_list) {
        quickSort(num_list, 0, num_list.length-1);
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }
    
    
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int part = partition(arr, left, right);
            quickSort(arr, left, part-1);
            quickSort(arr, part, right);
        }
    }
    
    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[(left+right)/2];

        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }

        return left;
    }
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}