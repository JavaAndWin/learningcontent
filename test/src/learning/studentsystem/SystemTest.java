package learning.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class SystemTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        System.out.println("------------学生管理系统---------------");
        System.out.println("1:添加学生");
        System.out.println("2:删除学生");
        System.out.println("3:修改学生");
        System.out.println("4:查询学生");
        System.out.println("5:退出");
        System.out.println("请输入您的选择:");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

//        switch (input) {
//            case 1 -> {}
//        }

    }
}
