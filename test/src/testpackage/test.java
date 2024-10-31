package testpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test {
    public static void main(String[] args){

        /*Animal a = new Dog();
        Dog d = new Dog();
        a.name = "柯基";
        boolean bool = a instanceof Dog ;*/


        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c");

        //lambda表达式
        list.forEach(s -> System.out.println(s));
        //方法引用
        list.forEach(System.out::println);

    }
}
