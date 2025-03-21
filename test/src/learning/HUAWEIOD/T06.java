package learning.HUAWEIOD;

import java.util.Scanner;

public class T06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n = in.nextInt();

        int i = 2;
        while (i <= n / 2) {
            if (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            } else {
                i++;
            }

        }

        if (n != 1) {
            System.out.print(n);
        }
    }
}

