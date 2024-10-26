package testpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");


        //遍历的五种方法
        //迭代器遍历
        System.out.println("--------------------------1");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

        //增强for遍历，底层是迭代器
        System.out.println("--------------------------2");
        for (String s : list) {
            System.out.println(s);
        }

        //lambda表达式遍历
        System.out.println("--------------------------3");
        list.forEach(s -> System.out.println(s));

        /*完整写法
        list.forEach(new Consumer<String>() {

            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        //for循环遍历
        System.out.println("--------------------------4");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //列表迭代器不好用不写了
        System.out.println("--------------------------5");

    }
}
