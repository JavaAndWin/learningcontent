package HUAWEIOD;

import java.util.ArrayList;
import java.util.Scanner;

public class T14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int count = in.nextInt();
        String[] strarr = new String[count];
        String temp = "";

        for (int j = 0; j < count; j++) {
            for (int i = 0; i < count - j - 1; i++) {
                if (strarr[i].compareTo(strarr[i + 1]) > 0) {
                    temp = strarr[i + 1];
                    strarr[i + 1] = strarr[i];
                    strarr[i] = temp;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(strarr[i]);
        }

    }
}

