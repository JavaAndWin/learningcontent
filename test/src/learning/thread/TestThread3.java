package learning.thread;

import java.time.LocalTime;

public class TestThread3 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("我是线程");
        System.out.println(LocalTime.now());
    }
    public static void main(String[] args) {
        TestThread3 t = new TestThread3();
        Thread t1 = new Thread(t);
        System.out.println("主程序开始执行");
        System.out.println(LocalTime.now());
        t1.start();
    }
}
