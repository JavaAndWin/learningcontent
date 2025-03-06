package kafka;

import java.util.Arrays;
import java.util.TreeSet;

public class Push {
    public static void main(String[] args) {
        Integer a[] = {1,2,3};
        int b =a.length;
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(a[0]);
        ts.add(2);
        ts.add(3);
        Integer[] c = ts.toArray(new Integer[0]);
        for (Integer i : c) {
            System.out.println(i);
        }
    }

}
