package testpackage.streamtest;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        IntStream stream =Arrays.stream(arr).filter(s->s!=2);
        IntStream stream1 =stream.filter(s->s==3);
        //已使用的流无法再使用
        IntStream stream2 =stream.filter(s->s==3);

        //终结方法：遍历、统计、收集
        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);

    }
}
