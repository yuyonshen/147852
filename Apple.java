import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Apple {
    double price=1.98;
    double kg=5;
    double pack=0;
    double add=price*kg;

}
class PerfectApple extends Apple{
    double price=2.98;
    double pack=1;
    double add=price*kg;


    public static void main(String[] args) {
        System.out.println("水果名称   "+"水果价格   "+"水果重量   "+"包装费   "+"总价");
        System.out.println("--------------------------------------------------------");
        Apple apple=new Apple();

        System.out.println("苹果       "+apple.price+"       "+apple.kg+"      "+apple.pack+"       "+apple.add);
       PerfectApple apple1=new PerfectApple();
        System.out.println("精装苹果   "+apple1.price+"       "+apple1.kg+"       "+apple1.pack+"       "+apple1.add);
        System.out.println("--------------------------------------------------------");
        System.out.println("差价                                      "+(apple1.add-apple.add));
    }
}
