class Student{
    private String name;
    private int age;
    private String sex;

    public Student(){// //构造方法   构造对象
        this("bit",12,"man");//this 调用构造函数；
    }

    public Student(String name,int age,String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    public void show(){
        System.out.println("name: "+ name + " age:" +age+  " sex: "+sex);
    }
}
public class Test4 {
    public static void main(String[] args) {
        Student student=new Student();
        student.show();
        Student student1=new Student("heihe",18,"男");
        student1.show();
    }
}
