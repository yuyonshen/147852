package java3_5_1;

public class Animal {
    protected String name;
    public Animal(String name){
        this.name=name;
    }
    public void eat(String food){
        System.out.println("我是一只小动物");
        System.out.println(this.name+"正在吃"+food);
    }
}
