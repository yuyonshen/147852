import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class Person{
    private String name;
    private int age ;
    private String sex;

    public Person(){//构造一个方法初始化类成员对象
        this.name="张三";
        this.age=18;
        this.sex="m";
    }
    public Person(String name,int age,String sex){//构造一个方法初始化类成员
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    public void show(){
        System.out.println("name: "+name+"age:"+age+"sex:"+sex);
    }
}
public class Test3 {
    public static void main(String[] args) {
        Person person=new Person();
        person.show();
        Person person1=new Person("zhangfei",80,"男");
        person1.show();
    }
}
