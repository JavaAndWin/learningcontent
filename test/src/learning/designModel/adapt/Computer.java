package learning.designModel.adapt;

public class Computer {
    public void link(Adapter adapter) {
        adapter.adapt();
    }
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.link(new AdapterImpl());
    }
}
