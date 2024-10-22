package testpackage;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysTest {
    public static void main(String[] args) {
        //测试Arrays工具类的用法
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[8];

        System.out.println(Arrays.binarySearch(arr1, 4));


        int[] arr3 = Arrays.copyOf(arr1, 10);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = Arrays.copyOfRange(arr1,2,4);
        System.out.println(Arrays.toString(arr4));

        Arrays.fill(arr2, 5);
        System.out.println(Arrays.toString(arr2));

        Integer[] arr5 = {7, 89, 45, 65, 43, 1, 2, 88};
        Arrays.sort(arr5);
        System.out.println(Arrays.toString(arr5));

        //添加规则降序排序
        Arrays.sort(arr5, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1 + " " + o2);
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr5));

        //lambda表达式
        Arrays.sort(arr5,(Integer o1,Integer o2)->{
            return o1 - o2;
        });
        System.out.println(Arrays.toString(arr5));
    }
}
