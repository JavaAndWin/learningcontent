package testpackage;

public class GfTest {
    public static void main(String[] args) {
        //创建对象并使用类里的属性和方法
        Gf gf1 = new Gf();
        gf1.setName("刘洋");
        gf1.setAge(18);
        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());

        //测试调用code类中的静态方法
        /*int[] arr = code.getString();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/

    }
}
