package learning.thread;

public class TestThread2 implements Runnable {
    private Boolean flag = true;
    @Override
    public void run() {
        int i = 0;
        while (flag) {
            System.out.println("线程执行——" + i++);
        }
    }
    public void stop() {
        flag = false;
    }
    public static void main(String[] args) {
        TestThread2 t = new TestThread2();
        Thread t1 = new Thread(t);
        t1.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程执行——"+i);
            if (i==900){
                System.out.println("线程该结束了");
                t.stop();
            }
        }
    }
}
