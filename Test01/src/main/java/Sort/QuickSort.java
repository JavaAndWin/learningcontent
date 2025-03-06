package Sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {2,5,3,4,6,2,6,1,6,7,4};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    static void quickSort(int[] arr, int l, int r) {
        if(l >= r) {
            return;
        }
        int pivot = arr[l];
        int low = l-1;
        int high = r+1;
        int index = l+1;
        while (index < high) {
            if(arr[index] < pivot) {
                int temp = arr[index];
                arr[index] = arr[++low];
                arr[low] = temp;
                index++;
            }else if(arr[index] > pivot) {
                int temp = arr[index];
                arr[index] = arr[--high];
                arr[high] = temp;
            }else{
                index++;
            }
        }

        quickSort(arr, l, low);
        quickSort(arr, high, r);
    }
}
