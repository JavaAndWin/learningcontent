package learning.testpackage.MyArrayList;

import java.util.ArrayList;

public class ListUtil<E> {

    private ListUtil(){
    }

    //泛型方法
    public static <E> boolean addAll(ArrayList<E> list, E e1, E e2) {
        list.add(e1);
        list.add(e2);
        return true;
    }
}
