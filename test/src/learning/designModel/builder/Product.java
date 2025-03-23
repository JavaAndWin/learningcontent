package learning.designModel.builder;

public class Product{
    private String BuildA;
    private String BuildB;
    private String BuildC;
    private String BuildD;
    public Product() {
    }
    public Product(String BuildA, String BuildB, String BuildC, String BuildD) {
        this.BuildA = BuildA;
        this.BuildB = BuildB;
        this.BuildC = BuildC;
        this.BuildD = BuildD;
    }
    public String getBuildA() {
        return BuildA;
    }
    public void setBuildA(String BuildA) {
        this.BuildA = BuildA;
    }
    public String getBuildB() {
        return BuildB;
    }
    public void setBuildB(String BuildB) {
        this.BuildB = BuildB;
    }
    public String getBuildC() {
        return BuildC;
    }
    public void setBuildC(String BuildC) {
        this.BuildC = BuildC;
    }
    public String getBuildD() {
        return BuildD;
    }
    public void setBuildD(String BuildD) {
        this.BuildD = BuildD;
    }
    public String toString() {
        return "Product{BuildA = " + BuildA + ", BuildB = " + BuildB + ", BuildC = " + BuildC + ", BuildD = " + BuildD + "}";
    }
}
