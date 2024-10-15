package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个学生信息");
        list.add(new Student(sc.next(), sc.nextInt()));
        System.out.println("请输入第二个学生信息");
        list.add(new Student(sc.next(), sc.nextInt()));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
