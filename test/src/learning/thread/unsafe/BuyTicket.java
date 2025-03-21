package learning.thread.unsafe;

public class BuyTicket implements Runnable {
    private static int ticket = 5;
    private Boolean flag = true;
    @Override
    public  void run() {
        while (flag) {
            try {
                buy();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private synchronized void buy() throws InterruptedException {
        if (ticket <= 0) {
            flag = false;
            System.out.println("票卖光了");
        } else {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName() + "拿到了" + ticket--);
        }
    }
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        Thread t1 = new Thread(buyTicket,"小霞");
        Thread t2 = new Thread(buyTicket,"小智");
        Thread t3 = new Thread(buyTicket,"小刚");
        t1.start();
        t2.start();
        t3.start();
    }
}
