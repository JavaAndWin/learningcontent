package learning.designModel.dynamicProxy;

public class Landlord implements Rent {
    @Override
    public void rent() {
        System.out.println("Landlord rent");
    }
}
