package learning.thread.Write.threadPool;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        MyThreadPool myThreadPool = new MyThreadPool(2,10,1, TimeUnit.SECONDS,4,new DiscardRejectHandle());
        for (int i = 0; i < 10; i++) {
            final int finalI = i;
            myThreadPool.execute(()->{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+"--"+finalI);
            });
        }
        System.out.println("主线程没有被阻塞");
    }
}
