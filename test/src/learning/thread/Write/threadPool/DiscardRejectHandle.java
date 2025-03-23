package learning.thread.Write.threadPool;

public class DiscardRejectHandle implements RejectHandle {
    @Override
    public void reject(Runnable rejectTask, MyThreadPool myThreadPool) {
        myThreadPool.tasks.poll();
        myThreadPool.execute(rejectTask);
    }
}
