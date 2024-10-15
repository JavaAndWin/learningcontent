package testpackage.test1;

public class test {
    public static void main(String[] args) {
        Outer.Inter o = new Outer().new Inter();

        o.show2();
    }
}
