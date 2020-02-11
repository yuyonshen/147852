import java.util.concurrent.Callable;

public class Computer3 {
    String sayHello(){
        return "欢迎使用";
    }
}
 class Pad3 extends Computer3{
    String sayHello(){
        return super.sayHello()+"ipad";
    }

     public static void main(String[] args) {
        Computer3 pc =new Computer3();
         System.out.println(pc.sayHello());
         Pad3 ipad3=new Pad3();
         System.out.println(ipad3.sayHello());
     }
}
