package thread;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable {

    static int tiket = 0;

    static Object obj = new Object();

    //要静态创建锁对象
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {


        while (true) {

            //lock锁,手动上锁
            lock.lock();
            try {

                if (tiket < 100) {
                    Thread.sleep(10);
                    tiket++;
                    System.out.println(Thread.currentThread().getName() + "第" + tiket + "张票");
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                lock.unlock();
            }




        }
    }

    /*同步方法
    private synchronized static boolean sale() {
        if (tiket < 100) {
            tiket++;
            System.out.println(Thread.currentThread().getName() + "第" + tiket + "张票");
        } else {
            return true;
        }
        return false;
    }*/
}
