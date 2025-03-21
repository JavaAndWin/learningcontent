package learning.exercise;

import java.util.Arrays;

public class Exercise04 {
    public static void main(String[] args) {
        int[] arr = {6, 2, 12, 8, 1, 4, 3, 9, 7, 11};
        System.out.println(Arrays.toString(quicksort(arr, 0, arr.length-1)));

    }

    public static int[] quicksort(int[] arr, int i, int j) {
        //基准数
        int num = i;
        int start = i;
        int end = j;

        if (start > end) {
            return arr;
        }
        //第一轮
        while (start != end) {
            while (start < end) {
                if (arr[end] >= arr[num]) {
                    end--;
                } else {
                    break;
                }
            }
            while (start < end) {
                if (arr[start] <= arr[num]) {
                    start++;
                } else {
                    break;
                }
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[num];
        arr[num] = arr[start];
        arr[start] = temp;

        quicksort(arr, i, start - 1);
        quicksort(arr, start + 1, j);
        return arr;
    }

}

