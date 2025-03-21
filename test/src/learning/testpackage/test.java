package learning.testpackage;

import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args){

        /*Animal a = new Dog();
        Dog d = new Dog();
        a.name = "柯基";
        boolean bool = a instanceof Dog ;*/


        /*ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c");

        //lambda表达式
        list.forEach(s -> System.out.println(s));
        //方法引用
        list.forEach(System.out::println);*/

        /*ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");

        //只要第一个字是张，而且是三个字的
        list.stream().filter(s -> s.length() == 3 && s.startsWith("张")).forEach(System.out::println);
*/

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer i = 1;
        i.hashCode();


        list.stream().map(Integer::bitCount).forEach(System.out::println);

    }
}
