package Person;
 class Student{
    public int age=18;
    public String name="张三";

    public void show(){
        System.out.println("我叫"+name+",今年"+age+"岁数");
    }
}
public class Test3 {
    public static void main(String[] args) {
        Student student=new Student();
        student.show();
    }
}
