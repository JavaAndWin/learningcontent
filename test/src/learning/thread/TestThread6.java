package learning.thread;

public class TestThread6 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"---"+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        TestThread6 t1 = new TestThread6();
        TestThread6 t2 = new TestThread6();
        TestThread6 t3 = new TestThread6();
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        Thread th3 = new Thread(t3);
        //主线程优先级
        System.out.println(Thread.currentThread().getName() + "---" + Thread.currentThread().getPriority());
        //线程优先级
        th1.setPriority(Thread.MIN_PRIORITY);
        th2.setPriority(Thread.NORM_PRIORITY);
        th3.setPriority(Thread.MAX_PRIORITY);
        th1.start();
        th2.start();
        th3.start();
    }
}
