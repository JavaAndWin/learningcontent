package learning.thread.syncontainer;

import java.util.ArrayList;
import java.util.List;

public class SynContainer {
    private final int capacity = 10;
    private List<Integer> list = new ArrayList<>();
    int subCount = 0;
    public static void main(String[] args) {
        SynContainer synContainer = new SynContainer();
        Producer producer = new Producer(synContainer);
        Consumer consumer = new Consumer(synContainer);
        Thread prod = new Thread(producer);
        Thread cons = new Thread(consumer);
        prod.start();
        cons.start();
    }
    //生产
    public synchronized void add(Product product) {
        if(list.size() == capacity) {
            System.out.println("容器已满生产者等待");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("向容器里放入第" + product.getCode() + "件产品");
        list.add(product.getCode());
        notifyAll();
    }
    //消费
    public synchronized void sub(){
        if(list.isEmpty()){
            System.out.println("容器已空，消费者等待");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int num = list.remove(0);
        subCount++;
        notifyAll();
        System.out.println("从容器中拿出第"+num+"件产品----------"+subCount);
    }
}
class Product {
    private int code;
    public Product(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
}
class Producer implements Runnable {
    private final SynContainer synContainer;

    public Producer(SynContainer synContainer) {
        this.synContainer = synContainer;
    }
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(100);
                synContainer.add(new Product(i));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Consumer implements Runnable {
    private final SynContainer synContainer;

    public Consumer(SynContainer synContainer) {
        this.synContainer = synContainer;
    }
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {  // 消费 100 件产品
            synContainer.sub();
            try {
                Thread.sleep(150);  // 模拟消费耗时
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}