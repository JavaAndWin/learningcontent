package learning.eatNoodles;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Desk {

    public static int count = 10;

    //0为没有面条，1为有面条
    public static int foodStatus = 0;

    //锁对象
    public static Lock lock = new ReentrantLock();
}
