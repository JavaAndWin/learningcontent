package objectArr;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];

        Phone h = new Phone("华为", 4999.0, "白色");
        Phone x = new Phone("小米", 3999.0, "蓝色");
        Phone a = new Phone("苹果", 8999.0, "银色");

        arr[0] = h;
        arr[1] = x;
        arr[2] = a;

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].getPrice();
        }

        System.out.println("平均价格为" + sum/arr.length);
    }
}
