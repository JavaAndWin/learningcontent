package learning.designModel.builder;

public class Main {
    public static void main(String[] args) {
        Conductor conductor = new Conductor();
        Product product = conductor.build(new Worker());
        System.out.println(product.toString());
    }
}
