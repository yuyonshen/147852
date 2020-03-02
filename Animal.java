package Extends;

public class Animal {
   private String name;
    public Animal(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void eat(String food){
        System.out.println(this.name+"正在吃"+food);
    }


}
