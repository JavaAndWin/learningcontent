package exercise;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        //实现parseInt方法的效果，将字符串转换为整数
        //最少一位，最多十位
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (!str.matches("[1-9]\\d{0,9}")) {
            System.out.println("数据格式不正确");
            return;
        } else {
            System.out.println("数据格式正确");
        }
        int num = 0;
        for (int i = 0; i < str.length(); i++) {

            num = num +  Character.getNumericValue(str.charAt(i))* (int)Math.pow(10, str.length()-1-i);

        }
        System.out.println(num);
    }

}
