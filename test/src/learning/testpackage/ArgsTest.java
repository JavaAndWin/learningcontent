package learning.testpackage;

public class ArgsTest {
    public static void main(String[] args) {
        System.out.println(getSum(1,2,3,4,5));
    }
    //本质是数组，形参只能有一个可变参数，多个参数中放末尾
    public static int getSum(int...args) {

        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }
}
