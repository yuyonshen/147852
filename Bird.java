package Extends;

public class Bird extends Animal{
//    public String name;
//    public Bird(String name){
//        this.name=name;
//    }
//    public void eat(String food){
//        System.out.println(this.name+"正在吃"+food);
//    }
public Bird(String name){
    super(name);
}
    public void fly(){
        System.out.println(this.getName()+"正在飞");
    }

}
