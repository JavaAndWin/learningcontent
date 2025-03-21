package learning.testpackage;

import java.util.Scanner;

public class RomaNum {
    public static void main(String[] args) {
        //键盘录入字符串
        System.out.println("请输入数字");
        String str1 = new Scanner(System.in).next();
        StringBuilder result = new StringBuilder();
        //创建罗马数字表
        char[] chars = {'1', 'Ⅰ', 'Ⅱ', 'Ⅲ', 'Ⅳ', 'Ⅴ', 'Ⅵ', 'Ⅶ', 'Ⅷ', 'Ⅸ'};

        char c = '1';//创建变量来接收每一个字符
        if (str1.length() > 9) {
            System.out.println("长度不符合要求");
            return;
        }
        for (int i = 0; i < str1.length(); i++) {
            c = str1.charAt(i);
            if (c < '0' || c > '9') {
                System.out.println("输入的不是数字");
                return;
            } else if (c != '0') {
                result.append(chars[Character.getNumericValue(c)]);
            }
        }
        System.out.println(result);
    }
}
