package getclass;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取class对象三种方式
        //1.
        Class<?> aClass = Class.forName("getclass.Student");

        String str = aClass.descriptorString();
        System.out.println(str);

        //2.
        Class s = Student.class;
        System.out.println(s);

        //3.
        Student student = new Student();
        Class c = student.getClass();
        System.out.println(c);
    }
}
