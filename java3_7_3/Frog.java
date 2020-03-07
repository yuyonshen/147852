package java3_7_3;

public class Frog extends Animal implements IRuning,ISwimming {
    public Frog (String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println(this.name+"跑");
    }
    @Override
    public void swim(){
        System.out.println(this.name+"游泳");
    }
}
