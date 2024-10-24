package testpackage.MyArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");
        list.add("ee");
        list.add("ee");
        list.add("ee");
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        ListUtil.addAll(list1, "xx", "xx");
        System.out.println(list1);
    }
}
