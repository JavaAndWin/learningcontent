package learning.thread.Write.threadPool;

import java.util.concurrent.RejectedExecutionException;

public class ThrowRejectHandle implements RejectHandle {
    @Override
    public void reject(Runnable rejectTask, MyThreadPool myThreadPool) {
        throw new RuntimeException("阻塞队列已满！");
    }
}
