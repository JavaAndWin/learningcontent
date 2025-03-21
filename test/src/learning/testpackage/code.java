package learning.testpackage;

import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        int code[] = getString();
        for (int i = 0; i < code.length; i++) {
            System.out.print(code[i] + " ");
        }
        System.out.println();
        calculate(code);
        for (int i = 0; i < code.length; i++) {
            System.out.print(code[i] + " ");
        }
        System.out.println();
        reverse(code);
        for (int i = 0; i < code.length; i++) {
            System.out.print(code[i] + " ");
        }
    }

    //输入得到一个数组
    public static int[] getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int scNum = sc.nextInt();
        int i = 1, count = 0;
        while (scNum / i != 0) {
            i *= 10;
            count++;
        }
        int[] numArr = new int[count];
        for (int j = 0; j < numArr.length; j++) {
            numArr[numArr.length - 1 - j] = scNum % 10;
            scNum /= 10;
        }
        return numArr;
    }

    //计算+5和%10
    public static int[] calculate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }
        return arr;
    }

    //将数组反转
    public static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length - i; i++) {
            int temp;
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}

