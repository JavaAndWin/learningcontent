package learning.thread;

public class Race implements Runnable {
    private static String winner;
    private final int distance;
    public Race(int distance){
        this.distance = distance;
    }

    public void run() {
        for (int i = 0; i < 500; i++) {
            if(Thread.currentThread().getName().equals("兔子")&&i==50){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(Thread.currentThread().getName()+"跑了"+i+"步");
            if(gameOver(i))break;
        }

    }

    private boolean gameOver(int steps){
        if(winner!=null){
            return true;
        }else {
        if(steps>=distance){
            winner = Thread.currentThread().getName();
            System.out.println(winner+"获得了胜利！！！");
            return true;
        }
        return false;
        }
    }

    public static void main(String[] args) {
        Race rabbit = new Race(100);
        Race tortoise = new Race(300);
        Thread t1 = new Thread(rabbit,"兔子");
        Thread t2 = new Thread(tortoise, "乌龟");
        t1.start();
        t2.start();
    }
}
