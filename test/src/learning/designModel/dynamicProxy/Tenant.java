package learning.designModel.dynamicProxy;


public class Tenant {
    public static void main(String[] args) {
        Landlord landlord = new Landlord();
        ProxyHandler pH = new ProxyHandler(landlord);
        Rent proxy = (Rent) pH.getProxy();
        proxy.rent();
    }
}
