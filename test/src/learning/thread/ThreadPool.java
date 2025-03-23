package learning.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        //创建服务，大小为10的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        //关闭连接
        service.shutdown();
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
            System.out.println(Thread.currentThread().getName());
    }
}
