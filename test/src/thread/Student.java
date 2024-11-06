package thread;

//线程创建方法2：实现接口，比继承Thread更方便
public class Student implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "张三学习");
        }
    }
}
