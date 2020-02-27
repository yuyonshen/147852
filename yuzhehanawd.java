class Person1{
    private String name;
    private int age;
    private String sex;
    private static int count=0;

    public Person1(){
        System.out.println("I am Person1 intt()!");
    }
    {//实例代码块
        this.name="bit";
        this.age=age;
        this.sex=sex;
        System.out.println("I am instance inti()!");
    }
    static{//静态代码块
        count=10;
        System.out.println("I am static inti()!");
    }
    public void show(){
        System.out.println("name: "+ name + " age:" +age+  " sex: "+sex);
    }
}

public class Test6 {
    public static void main(String[] args) {
        Person1 person=new Person1();
        Person1 person1=new Person1();

    }
}
