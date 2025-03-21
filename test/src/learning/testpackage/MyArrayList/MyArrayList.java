package learning.testpackage.MyArrayList;

import java.util.Arrays;

//泛型类练习
public class MyArrayList<E> {
    Object[] obj = new Object[10];
    int size;

    public boolean add(E e) {
        if (size != 10) {
            obj[size] = e;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "obj=" + Arrays.toString(obj) +
                ", size=" + size +
                '}';
    }
}
