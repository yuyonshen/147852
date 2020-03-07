package java3_7_3;

public class Cat extends Animal implements IRuning {
    public Cat(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println(this.name+"会跑");
    }
}
