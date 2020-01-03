package Person;
class Person {
    public int age;
    public String name;
    public String sex;
    public static int count;
    public final int SIZE = 10;
    public static final int COUNT = 99;

    public void eat() {
        System.out.println("eat()！");
    }

    public void sleep() {
        System.out.println("sleep()!");
    }

    public static void staticTest() {
        System.out.println("StaticTest()!");
    }
}
    public class Test{
        public static void main(String[] args) {
            Person person=new Person();
            System.out.println(person.age);
            System.out.println(person.name);
            System.out.println(Person.count);
            System.out.println(Person.COUNT);
            person.eat();
            person.sleep();
        }
    }

