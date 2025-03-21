package learning.eatNoodles;

public class Test {
    public static void main(String[] args) {

        Cook cook = new Cook();
        Foodie foodie = new Foodie();

        Thread t1 = new Thread(cook);
        Thread t2 = new Thread(foodie);

        t1.start();
        t2.start();


    }
}
