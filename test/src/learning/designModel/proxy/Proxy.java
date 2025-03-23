package learning.designModel.proxy;

public class Proxy {
    private Landlord landlord;
    public Proxy(Landlord landlord) {
        this.landlord = landlord;
    }
    public void proxyRent(){
        landlord.rent();
    }
}
