package testpackage.exceptiontest;

public class test {
    public static void main(String[] args) {

        int[] arr = {1, 2};

//        System.out.println(arr[3]);

        try {
            System.out.println(arr[3]);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());

            //默认的抛出异常方法
            e.printStackTrace();
            System.err.println(e);

        }
    }
}
