package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
//        有一个n * n的0、1矩阵，有两种操作：把0变为1或者把1变为0。
//问：最少要几步操作可以使每个元素的上、下、左、右的位置上的元素（如果存在）之和为偶数。
//解答要求时间限制：1000ms, 内存限制：100MB
//输入
//第一行为一个正整数N, (2 <= N <= 15), 接下来是N行，每行包含n个数，每个数可能为0或1。
//输出
//输出最少的整数。如果无解，输出-1。
//  5
//0 0 0 0 1
//1 1 1 1 1
//0 0 0 0 1
//1 1 0 0 0
//0 0 1 0 0
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n; j++) {
                ans += change(nums,i,j);
            }
        }
        int sum = 0;
        boolean judge = true;
        for (int i = 0; i < n; i++) {
            if(i==0){
                sum = nums[n-2][i] + nums[n-1][i+1];
            } else if (i==n-1) {
                sum = nums[n-2][i] + nums[n-1][i-1];
            } else{
                sum = nums[n-2][i] + nums[n-1][i+1] + nums[n-1][i-1];
            }
            if(sum%2!=0){
                judge = false;
            }
        }
        System.out.println(judge);
        System.out.println(ans);
    }

    public static int change(int[][] nums,int i,int j){
        int sum = 0;
        if(i==0){
            if(j==0){
                sum = nums[i][j + 1] +nums[i + 1][j];
            } else if (j==nums.length-1) {
                sum = nums[i][j -1] +nums[i + 1][j];
            }else{
                sum = nums[i][j - 1] + nums[i + 1][j] + nums[i][j + 1];
            }
        }else{if(j==0){
            sum = nums[i][j + 1] + nums[i - 1][j]+nums[i + 1][j];
        } else if (j==nums.length-1) {
            sum = nums[i][j -1] + nums[i - 1][j]+nums[i + 1][j];
        }else{
            sum = nums[i - 1][j] + nums[i][j - 1] + nums[i + 1][j] + nums[i][j + 1];
        }}

        if(sum%2!=0&&j<nums.length-1) {
            nums[i+1][j] = (nums[i+1][j] + 1) % 2;
            return 1;
        }else{
            return 0;
        }
    }
}
