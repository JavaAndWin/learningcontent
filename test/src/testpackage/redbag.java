package testpackage;

import java.util.Scanner;
import java.util.Random;

public class redbag {
    public static void main(String[] args) {
        redBag();
    }

    public static void redBag() {
        int[] arr = {2, 588, 888, 1000, 10000};
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int a , b;
        int i , count = 0;

        while(count < 5) {
            System.out.println("输入任意开始抢红包");
            b = sc.nextInt();
            a = 0;
            while (a == 0) {
                i = r.nextInt(5);
                a = arr[i];
                arr[i] = 0;
            }
            System.out.println("你抢到了" + a + "元！");
            count++;
            if (count == 5) {
                System.out.println("红包已抢完");
                break;
            }
        }
    }
}
