package learning.designModel.proxy;

public class Tenant {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Landlord());
        proxy.proxyRent();
    }
}

