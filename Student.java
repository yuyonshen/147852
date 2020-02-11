public class Student {
    private int num;
    private String name;
    private String sex;
    private String nation;
    private String phone;
    public Student(int num,String name,String sex,String nation,String phone){
        this.num=num;
        this.name=name;
        this.sex=sex;
        this.nation=nation;
        this.phone=phone;
    }
public void print(){
    System.out.println("转校生"+name+"的学生信息如下:");

}
public void print1(){
    System.out.println(num+"     "+name+"     "+sex+"     "+nation+"     "+phone);
}
    public static void main(String[] args) {
        Student student=new Student(26,"黎明","男","北京市海定区","父:12344556");
        student.print();
        System.out.println("-------------------------------0--------------------------");
        System.out.println("学号    "+"姓名    "+"性别    "+"籍贯    "+"父母练习方式");
        System.out.println("---------------------------------------------------------");
       student.print1();
    }
}
