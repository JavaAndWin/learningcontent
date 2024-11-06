package thread;

import java.util.concurrent.Callable;

//线程创建方法3：带返回值
public class Mycallable implements Callable {

    public void printName() {
        System.out.println(Thread.currentThread().getName());
    }
    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        return "运行成功";
    }
}
