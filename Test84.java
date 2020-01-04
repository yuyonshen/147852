package Student;

import javax.xml.bind.annotation.XmlInlineBinaryData;

class Student{
    private int age;
    private String name;
    private String sex;

    public Student(){
        this.age=18;
        this.name="yuzhenhan";
        this.sex="man";
    }
    public Student(int age,String name,String sex){
        this.age=age;
        this.name=name;
        this.sex=sex;
    }
    @Override
    public java.lang.String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' + '}';
    }
}

public class Test84 {
    public static void main(String[] args) {
        Student student=new Student();
        System.out.println(student);
        Student student1=new Student(18,"haha","nan");
        System.out.println(student1);
    }
}
