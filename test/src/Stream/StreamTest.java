package Stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
//        int[] arr1 = {5,2,3,4};
//        int[] arr3 = {7,8,9,3};
//        Integer[] arr2 = {5,6,7};
//        int[] arr4 = new int[10];
//        int[] arr5 = {3,4,1,1};
//
//        Arrays.sort(arr1);
//        List list = Arrays.asList(arr2);
//        list.forEach(System.out::print);
//        System.out.println();
//        System.out.println("====================");
//        int n = Arrays.binarySearch(arr1,4);
//        System.out.println(n);
//        System.out.println("====================");
//        int compare = Arrays.compare(arr1,arr3);
//        System.out.println(compare);
//        System.out.println("====================");
//        Arrays.fill(arr4,5);
//        System.out.println(Arrays.toString(arr4));
//        System.out.println("====================");
//
//        System.out.println("Stream流测试！！！！！！！！！");
//        System.out.println(Arrays.asList(arr1).stream().toString());
//        System.out.println();
//        Stream.of(arr1).forEach(System.out::print);
//        System.out.println();
//        Stream.of(arr2).forEach(System.out::print);
//        System.out.println();
//        Arrays.asList(arr2).forEach(System.out::print);
//        System.out.println();
//        Stream.of(1,2,3,4,5,6,7).forEach(System.out::print);

//        System.out.println("单列集合测试！！！！！！！！");
//        List<String> list = Arrays.asList("a", "b", "c");
//        list.stream().forEach(System.out::print);
//        System.out.println();
//        System.out.println("====================");
//        List<Integer> list1 = Arrays.asList(1, 2, 3);
//        list1.stream().forEach(System.out::print);
//        System.out.println();
//        System.out.println("====================");
//        list1.stream().filter(x -> x % 2 == 0).forEach(System.out::print);
//        System.out.println();
//        System.out.println("===================");
//        List list2 = list1.stream().distinct().toList();
//        list2.forEach(System.out::print);

        Integer[] arr1 = {1,2,3,4,5};
        List list = Arrays.asList("1","2","3","4","5","6");

//        Arrays.asList(arr).forEach(System.out::println);
//        Arrays.asList(arr).stream().forEach(System.out::println);
//        Arrays.stream(arr).forEach(System.out::println);


        //数组两种方法
//        Arrays.stream(arr).forEach(System.out::print);
//        System.out.println();
//        Stream.of(arr1).forEach(System.out::print);
//        System.out.println();

        //集合
        List list1 = new ArrayList();
        Collections.addAll(list1, 1,2,3);
        list1.stream().forEach(System.out::println);
    }
}
