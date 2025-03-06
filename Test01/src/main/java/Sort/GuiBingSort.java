package Sort;

import java.util.*;
import java.util.TreeSet;

public class GuiBingSort {
    public static void main(String[] args) {
        int[] nums = {2,5,3,4,6,2,6,1,6,7,4};
        GuiBing(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    static void GuiBing(int[] arr,int l,int r){
        if(l==r){
            return;
        }
        int mid = (l+r)>>1;
        GuiBing(arr,l,mid);
        GuiBing(arr,mid+1,r);
        merge(arr,mid,l,r);
    }

    private static void merge(int[] arr,int mid,int l,int r) {
        int[] help = new int[r-l+1];
        int i=l;int j=mid+1;int k=0;
        while(i<=mid&&j<=r){
            if(arr[i]<=arr[j]){
                help[k++] = arr[i++];
            }else{
                help[k++] = arr[j++];
            }
        }
        while(i<=mid){
            help[k++] = arr[i++];
        }
        while(j<=r){
            help[k++] = arr[j++];
        }

        for(int x =0;x<help.length;x++){
            arr[l+x] = help[x];
        }

    }
}
