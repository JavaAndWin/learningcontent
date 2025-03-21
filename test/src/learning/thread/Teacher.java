package learning.thread;

//创建线程方法1：继承Thread父类，缺点不能再继承其他父类，灵活性差
public class Teacher extends Thread {

    public void printName() {
        System.out.println(Thread.currentThread().getName());
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        /*for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "李四教学");
        }*/
    }
}
