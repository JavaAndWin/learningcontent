package learning.testpackage;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aa");
        Iterator<String> it = list.iterator();
        it.remove();
    }
}
