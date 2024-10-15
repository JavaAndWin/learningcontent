package testpackage;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {

        System.out.println("判断是否是回文数\n请输入一个数：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        int x = 10, i = 1;
        while (a / i != 0) {
            b = b * 10 + (a % x) / i;
            i *= 10;
            x *= 10;
        }
        if (a == b) System.out.println("是回文数" + b);
        else System.out.println("不是回文数" + b);
    }
}
