package learning.thread.Write.threadPool;

public interface RejectHandle {

    void reject(Runnable rejectTask, MyThreadPool myThreadPool);
}
