package learning.eatNoodles;

public class Cook implements Runnable{
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.foodStatus == 1) {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {

                        System.out.println("做了一碗面");
                        Desk.foodStatus = 1;
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
