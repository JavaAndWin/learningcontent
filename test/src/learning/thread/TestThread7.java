package learning.thread;

public class TestThread7 implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        TestThread7 t2 = new TestThread7();
        Thread th2 = new Thread(t2, "我守护线程");
        Thread1 thread1 = new Thread1();
        th2.setDaemon(true);
        th2.start();
        thread1.start();
    }
}
class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("我是线程");
        }
    }
}



