package learning.designModel.builder;

public class Worker extends Builder {

    private Product product;
    public Worker() {
        product = new Product();
    }
    @Override
    void BuildA() {
        product.setBuildA("基础");
        System.out.println("基础");
    }
    @Override
    void BuildB() {
        product.setBuildB("钢筋");
        System.out.println("钢筋");
    }
    @Override
    void BuildC() {
        product.setBuildC("混凝土");
        System.out.println("混凝土");
    }
    @Override
    void BuildD() {
        product.setBuildD("装修");
        System.out.println("装修");
    }
    @Override
    Product getProduct() {
        return product;
    }
}
