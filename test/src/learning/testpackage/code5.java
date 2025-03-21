package learning.testpackage;

import java.util.Random;

public class code5 {
    public static void main(String[] args) {

        System.out.println(code(4));

    }

    public static String code(int a) {
        Random r = new Random();
        char[] code = new char[52];
        String result = "";
        for (int i = 0; i < 26; i++) {
            code[i] = (char) (i + 65);
            code[i + 26] = (char) (i + 97);
        }


        for (int i = 0; i < a; i++) {
            result = result + code[r.nextInt(code.length)];
        }
        return result = result + r.nextInt(10);
    }
}
