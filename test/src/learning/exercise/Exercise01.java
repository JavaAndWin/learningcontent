package learning.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
//        用集合录入1-100的整数，直到集合大小超过200
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (arrayList.size() <= 200) {
            int a = sc.nextInt();
            if (a>= 1 && a <= 100) {
                arrayList.add(a);
            } else  {
                System.out.println("数字不在1-100范围内");
            }
            System.out.println(arrayList);
        }

    }
}
