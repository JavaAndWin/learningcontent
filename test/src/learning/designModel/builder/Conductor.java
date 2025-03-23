package learning.designModel.builder;

public class Conductor {

    public Product build(Builder builder) {
        builder.BuildA();
        builder.BuildB();
        builder.BuildC();
        builder.BuildD();
        return builder.getProduct();
    }
}
