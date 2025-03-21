package learning.thread;

import java.util.concurrent.*;

public class CallableThread implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {
        System.out.println("我是Callable线程");
        return true;
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableThread callableThread = new CallableThread();
        //创建执行服务
        Future<Boolean> future;
        ExecutorService exs = Executors.newFixedThreadPool(1);
        //提交执行服务
        future = exs.submit(callableThread);
        //获取结果
        Boolean result = future.get();
        //关闭服务
        exs.shutdown();
    }
}
