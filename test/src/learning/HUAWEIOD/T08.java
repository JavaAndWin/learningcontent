package learning.HUAWEIOD;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class T08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        Map<Integer, Integer> map = new TreeMap<>();
        int count = in.nextInt();

        for (int i = 0; i < count; i++) {
            int index = in.nextInt();
            int value = in.nextInt();

            map.put(index, map.getOrDefault(index, 0) + value);
        }

        map.forEach((s, v) -> System.out.println(s + " " + v));
    }
}

