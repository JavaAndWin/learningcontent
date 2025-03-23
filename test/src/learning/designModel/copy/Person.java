package learning.designModel.copy;

public class Person implements Cloneable{
    private String name;
    private int age;
    private Toy toy;
    public Person(String name, int age, Toy toy) {
        this.name = name;
        this.age = age;
        this.toy = toy;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public String toString(){
        return name + age +"---" +toy.getId()+toy.getName();
    }
    public static void main(String[] args) {
        Person person1 = new Person("John", 23,new Toy(11,"恐龙"));
        Person person2;
        try {
            person2 = (Person) person1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        person1.name = "Tom";
        person1.toy.setName("火车");
        person1.toy.setId(22);
        System.out.println(person1);
        System.out.println(person2);
    }
}
