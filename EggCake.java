import sun.plugin.BeansApplet;

public class EggCake {
    int eggCount;
    public EggCake(int eggCount){
        this.eggCount=eggCount;
        System.out.println("这个鸡蛋灌饼里有"+ eggCount+"个蛋。");
    }
    public EggCake(){
        this(1);
    }

    public static void main(String[] args) {
        EggCake cake1=new EggCake();
        EggCake cake2=new EggCake(5);
    }
}
