package testpackage;

import java.util.Random;
import java.util.Scanner;

public class TwoBall {
    public static void main(String[] args) {
        int[] arr = getBall();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
//        获得中奖号码
//        int[] arr1 = winBall();
        int[] arr1 = {10, 12, 13, 14, 15, 16, 20};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        compare(arr, arr1);

    }

    //用户输入购买双色球号码
    public static int[] getBall() {
        System.out.println("请输入想购买的号码，一共7个");
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个号码");
            arr[i] = sc.nextInt();

        }
        return arr;

    }

    //随机取得开奖双色球号码
    public static int[] winBall() {
        Random r = new Random();
        int[] arr = new int[7];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = r.nextInt(34) + 1;
        }
        arr[arr.length - 1] = r.nextInt(17) + 1;
        return arr;
    }

    //匹配中奖条件
    public static void compare(int[] arr1, int[] arr2) {
        int red = 0, blue = 0;
        //统计红球和蓝球中奖个数
        if (arr1[arr1.length - 1] == arr2[arr2.length - 1]) blue++;
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] == arr2[i]) red++;
        }
        //匹配奖励档位
        if (blue == 1) {
            switch (red) {
                case 1 -> System.out.println("5元");
                case 2 -> System.out.println("5元");
                case 3 -> System.out.println("10元");
                case 4 -> System.out.println("200元");
                case 5 -> System.out.println("3000元");
                case 6 -> System.out.println("最高1000万");
            }
        } else {
            switch (red) {
                case 4 -> System.out.println("10元");
                case 5 -> System.out.println("200元");
                case 6 -> System.out.println("最高500万");
            }
        }
    }
}