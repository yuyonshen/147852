import java.util.jar.JarOutputStream;

public class Computer2 {
   void showPicture(){
       System.out.println("鼠标点击");
   }
}
//子类继承父类
class Pad2 extends Computer2{
    //重写父类的方法
    void showPicture(){
        System.out.println("手指点击触摸屏");
    }

    public static void main(String[] args) {
        Computer2 pc =new Computer2();
        System.out.println("pc打开图片：");
        pc.showPicture();
        Pad2 ipad=new Pad2();
        System.out.println("ipad打开图片：");
        ipad.showPicture();
    }
}
