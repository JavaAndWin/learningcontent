package objectArr;

public class GfTest {
    public static void main(String[] args) {
        Gf[] arr = new Gf[4];

        Gf g1 = new Gf("小红", 18, '女', "钢琴");
        Gf g2 = new Gf("小明", 19, '女', "蓝球");
        Gf g3 = new Gf("小花", 20, '女', "跑步");
        Gf g4 = new Gf("小李", 30, '女', "上班");

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getAge();
        }

        int avg = sum / arr.length;
        System.out.println(avg);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() < avg) {
                System.out.println(arr[i].getName() + arr[i].getAge() + arr[i].getGender() + arr[i].getHobby());

            }
        }
    }
}
