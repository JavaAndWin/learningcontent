package learning.eatNoodles;

public class Foodie implements Runnable{
    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.foodStatus == 0) {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {

                        Desk.count--;
                        System.out.println("吃了一碗面，还有" + Desk.count + "碗");
                        Desk.foodStatus = 0;
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
