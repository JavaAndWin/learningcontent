package testpackage.hashSet;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",11);
        Student s2 = new Student("lisi",12);
        Student s3 = new Student("wangwu",13);
        Student s4 = new Student("zhangsan",11);

        HashSet<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        System.out.println(set);
    }
}
