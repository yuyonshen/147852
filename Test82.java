class Person2{
    private String name;
    private int age;
    private String sex;

    public Person2(String name,int age, String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    public void show(){
        System.out.println("name: "+ name + " age:" +age+  " sex: "+sex);
    }


        public String toString(){
            return "name: "+ name + " age:" +age+  " sex: "+sex;

    }
}

public class Test7 {
    public static void main(String[] args) {
        Person2 person=new Person2("caocao",18,"man");
        person.show();
        System.out.println(person);
    }
}
