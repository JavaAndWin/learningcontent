package thread;

public class ThreadTest {
    public static void main(String[] args) {

        Student s1 = new Student();
        Teacher t3 = new Teacher();

        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s1);

        t1.setName("线程1：");
        t2.setName("线程2：");
        t3.setName("线程3：");

        t1.start();
        t2.start();
        t3.start();
    }
}
