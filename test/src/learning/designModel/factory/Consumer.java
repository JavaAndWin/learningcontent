package learning.designModel.factory;

public class Consumer {
    public static void main(String[] args) {
        Car car1 = Factory.getCar("比亚迪");
        car1.name();
        Car car2 = Factory.getCar("特斯拉");
        car2.name();
        Car car3 = Factory.getCar("特拉");
    }
}
