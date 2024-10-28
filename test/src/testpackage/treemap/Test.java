package testpackage.treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {

        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        tm.put(1,"a");
        tm.put(4,"d");
        tm.put(3,"c");
        tm.put(2,"b");

        tm.forEach((s,i) -> System.out.println(s + "=" + i));

        System.out.println("---------------------------------------");

        TreeMap<Student, String> stm = new TreeMap<>();
        stm.put(new Student("wangwu", 11), "上海");
        stm.put(new Student("zhangsan", 11), "湖南");
        stm.put(new Student("lisi", 12), "贵州");
        stm.put(new Student("lisi", 12), "贵州");

        //遍历stm
        stm.forEach((s,i) -> System.out.println(s + "=" + i));
    }
}
