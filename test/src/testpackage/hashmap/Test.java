package testpackage.hashmap;

import java.util.*;
import java.util.function.BiConsumer;

public class Test {
    public static void main(String[] args) {
        String[] str = {"A", "B", "C", "D"};

        ArrayList list = new ArrayList();
        Random rand = new Random();
        for (int i = 0; i < 80; i++) {
            list.add(str[rand.nextInt(str.length)]);
        }

        HashMap<String, Integer> hm = new HashMap<>();
        list.forEach(s -> {
            if (hm.containsKey(s)) {
                int count = hm.get(s);
                count++;
                hm.put(s.toString(), count);
            } else {

                hm.put(s.toString(), 1);
            }
        });
        System.out.println(hm);

        System.out.println("----------------------------------------");
        //遍历Map的三种方法
        //1.键找值
        Set<String> set = hm.keySet();
        set.forEach(s -> {
            int value = hm.get(s);
            System.out.println(s + ":" + value);
        });

        System.out.println("----------------------------------------");
        //2.entry遍历
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("----------------------------------------");
        //3.lambda表达式
        hm.forEach((s, integer) -> System.out.println(s + ":" + integer));

        //统计最大值
        int max = 0;
        hm.forEach((s, integer) -> {
            if(integer > max) {
                max = integer;
            }
        });


    }
}
