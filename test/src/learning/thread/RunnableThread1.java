package learning.thread;

public class RunnableThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("线程中的方法————"+i);
        }
    }
    public static void main(String[] args) {
        RunnableThread1 t = new RunnableThread1();
        new Thread(t).start();
        for (int i = 0; i < 200; i++) {
            System.out.println("主程序中的方法————"+i);
        }
    }
}
