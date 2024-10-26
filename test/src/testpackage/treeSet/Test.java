package testpackage.treeSet;


import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {

        Student s1 = new Student("zhangsan", 23, 90, 99, 50);
        Student s2 = new Student("lisi", 23, 90, 98, 50);
        Student s3 = new Student("wangwu", 25, 95, 100, 30);
        Student s4 = new Student("zhaoliu", 26, 60, 99, 70);
        Student s5 = new Student("qianqi", 26, 70, 80, 70);

        TreeSet<Student> ts = new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student s : ts) {
            System.out.print(s);
            int sum = s.english + s.math + s.chinese;
            System.out.println("总分：" + sum);
        }
    }
}
