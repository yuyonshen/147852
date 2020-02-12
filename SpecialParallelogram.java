//定义一个“画图形”的接口；
interface DrawImage{
    public  void draw();
}
//矩形实现了drawTest接口
class Rectang implements DrawImage{
    public void draw(){
        System.out.println("画矩形");
    }
}
//正方形类实现了drawTest接口；
class Square implements DrawImage{
    public void draw(){
        System.out.println("画正方形");
    }
}
//菱形实现了drawTest接口
class Diamond implements DrawImage{
    public void draw(){
        System.out.println("画领型");
    }
}
public class SpecialParallelogram {
    public static void main(String[] args) {
        DrawImage[] images={new Rectang(),new Square(),new Diamond()};
        for(int i=0;i<images.length;i++){
            images[i].draw();
        }
    }
}
