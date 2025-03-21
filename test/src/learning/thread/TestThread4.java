package learning.thread;

public class TestThread4 implements Runnable {
    @Override
    public void run() {
        System.out.println("线程开始执行"+Thread.currentThread().getName());
        Thread.yield();
        System.out.println("结束"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {

    }
}
