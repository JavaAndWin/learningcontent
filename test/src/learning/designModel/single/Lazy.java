package learning.designModel.single;

public class Lazy {
    private volatile static Lazy lazy;
    private Lazy(){
        System.out.println(Thread.currentThread().getName()+"--");
    }
    public static Lazy getInstance(){
        if(lazy == null){
            synchronized(Lazy.class){
                if(lazy == null){
                    lazy = new Lazy(); //防止指令重排
                }
            }
        }
        return lazy;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                Lazy.getInstance();
            }).start();
        }
    }
}
