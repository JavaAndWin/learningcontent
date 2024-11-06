package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Mycallable mc = new Mycallable();
        FutureTask<String> ft = new FutureTask<>(mc);
        Thread t1 = new Thread(ft);

        t1.setName("Thread1");

        //只有在重写的方法内才能获取线程名
        mc.printName();
        t1.start();
        mc.printName();

        System.out.println(ft.get());

        //测试实现Runnable接口能不能不在重写方法内获取线程名
        Teacher t = new Teacher();
        t.printName();
        t.start();
        //结果是不能
    }
}
