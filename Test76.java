package Person;
class Student{
    private  String name="张三";
    private  int age=18;

    public void show(){
        System.out.println("我叫"+name+", 今年"+age+"岁");
    }
}
public class Test1 {
    public static void main(String[] args) {
        Student st=new Student();
        st.show();
    }
}
