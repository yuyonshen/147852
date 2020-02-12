
abstract class Shop{
    public double r;
    public double L;
    public double h;
    public abstract  void add();
}
class Round extends Shop{

    public void add(){
        System.out.println("园的面积为:" +r*r*3.14);
    }
}
class Rectangle extends Shop{
    public void add(){
        System.out.println("矩形的面积为："+L*L);
    }
}
public class shop {
    public static void main(String[] args) {
        Round round=new Round();
        round.r=3;
        round.add();
        Rectangle rectangle=new Rectangle();
        rectangle.L=5;
        rectangle.h=4;
        rectangle.add();

    }
}