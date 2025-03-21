package learning.HUAWEIOD;

import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        String in = sc.nextLine();
        String[] str = in.split(" ");
        String result = str[str.length - 1];
        System.out.println(result.length());


    }
}
