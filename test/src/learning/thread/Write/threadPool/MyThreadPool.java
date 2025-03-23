package learning.thread.Write.threadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class MyThreadPool {
    //线程池核心线程数
    private int corePoolSize;
    //线程池最大线程数
    private int maxPoolSize;
    //辅助线程获取不到任务终止的超时时间
    private int timeout;
    //JUC包提供的枚举类，表示单位
    private TimeUnit timeUnit;
    //保存任务的阻塞队列
    public BlockingQueue<Runnable> tasks;
    //拒绝策略，处理阻塞队列满的情况
    private RejectHandle rejectHandle;
    //核心线程
    List<Thread> coreList = new ArrayList<>();
    //辅助线程
    List<Thread> supportList = new ArrayList<>();

    public MyThreadPool(int corePoolSize, int maxPoolSize, int timeout, TimeUnit timeUnit, int blockSize, RejectHandle rejectHandle) {
        this.corePoolSize = corePoolSize;
        this.maxPoolSize = maxPoolSize;
        this.timeout = timeout;
        this.timeUnit = timeUnit;
        this.tasks = new ArrayBlockingQueue<>(blockSize);
        this.rejectHandle = rejectHandle;
    }
    void execute(Runnable runnable) {
        //创建线程，执行任务队列的任务
        synchronized (this){
            if (coreList.size() < corePoolSize) {
                CoreThread thread = new CoreThread();
                coreList.add(thread);
                thread.start();
            }
        }
        if (tasks.offer(runnable)) {
            return;
        }
        synchronized (this){
            if (coreList.size() + supportList.size() < maxPoolSize) {
                SupportThread thread = new SupportThread();
                supportList.add(thread);
                thread.start();
            }
        }
        if (!tasks.offer(runnable)) {
            rejectHandle.reject(runnable, this);
        }
    }
    class CoreThread extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    Runnable task = tasks.take();
                    task.run();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    class SupportThread extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    Runnable task = tasks.poll(timeout, timeUnit);
                    if (task == null) {
                        break;
                    }
                    task.run();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(Thread.currentThread().getName() + "线程结束了");
            synchronized (MyThreadPool.this) {
                supportList.remove(Thread.currentThread());
            }
        }
    }
}
