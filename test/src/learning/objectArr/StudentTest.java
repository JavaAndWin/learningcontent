package learning.objectArr;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        arr[0] = new Student(001, "小李", 18);
        arr[1] = new Student();
        arr[2] = new Student();


        System.out.println("请输入新添加学生信息");
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        String name = sc.next();
        int age = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getCode() == code) {
                System.out.println("学号重复");
                return;
            } else if (arr[i].getCode() == 0) {
                arr[i] = new Student(code, name, age);
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getCode() + "," + arr[i].getName() + "," + arr[i].getAge());
        }

        System.out.println("输入id删除学生信息");
        int code1 = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (code1 == arr[i].getCode()) {
                arr[i] = new Student();
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("删除失败");
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getCode() + "," + arr[i].getName() + "," + arr[i].getAge());
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getCode() == 2) {
                arr[i].setAge(arr[i].getAge() + 1);
                System.out.println("年龄为" + arr[i].getAge());
            }
        }


    }
}
