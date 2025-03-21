package learning.thread;

public class TestThread5 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("-------");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        TestThread5 t1 = new TestThread5();
        Thread t2 = new Thread(t1);
        Thread.State state = t2.getState();
        System.out.println(state);
        t2.start();
        state = t2.getState();
        System.out.println(state);
        while(state != Thread.State.TERMINATED) {
            state = t2.getState();
            System.out.println(state);
            Thread.sleep(500);
        }
    }
}
