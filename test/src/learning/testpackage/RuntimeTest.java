package learning.testpackage;

import java.io.IOException;

public class RuntimeTest {
    public static void main(String[] args) throws IOException {
        Runtime r = Runtime.getRuntime();

        System.out.println("cpu线程数" + r.availableProcessors());

        System.out.println("JVM能从系统获得的总内存大小（byte）"+r.maxMemory());

        System.out.println("JVM已经从系统获得的内存大小"+r.totalMemory());

        System.out.println("JVM剩余内存大小"+r.freeMemory());

        r.exec("ipconfig");
    }
}
