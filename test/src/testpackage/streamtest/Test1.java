package testpackage.streamtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e", "f", "g", "h");

        String[] strings = list.stream().toArray(value -> new String[value]);

        System.out.println(Arrays.toString(strings));
    }
}
