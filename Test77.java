package Person;

class Person1{
    private String name;
    private int age ;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void show(){
        System.out.println("我叫"+name+", 今年"+age+"岁");
    }
}
public class Test2 {
    public static void main(String[] args) {
        Person1 person=new Person1();
        person.setName("caocao");
        String name=person.getName();
        System.out.println(name);
        person.show();
    }
}
