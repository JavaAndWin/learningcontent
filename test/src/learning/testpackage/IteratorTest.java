package learning.testpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class IteratorTest {
    public static void main(String[] args) {
        //迭代器测试
        Collection<String> list = new ArrayList<String>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {

            String str = it.next();
            if (str == "bb") {
                it.remove();
            }
            System.out.println(str);
        }

        //遍历结束后指针不会复位
        System.out.println(it.hasNext());

        //迭代时不能调用集合的方法增删元素,可调用迭代器的remove删除，无法增加
        System.out.println(list);

        System.out.println("---------------for----------------");
        //增强for遍历
        //s是第三方变量，存储当前元素值
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------匿名内部类------------");
        //lambda表达式遍历
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("---------lambda------------");
        list.forEach((String s)->{
            System.out.println(s);
        });

        //省略数据类型和括号
        System.out.println("-----------lambda------------");
        list.forEach(s-> System.out.println(s));
    }
}
