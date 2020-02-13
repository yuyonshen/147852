class Parents{
    private final void doit(){
        System.out.println("父类.doit()");
    }
    final void doit2(){
        System.out.println("父类.doit2()");
    }
    public void doit3(){
        System.out.println("父类.doit3()");
    }
}
class Sub extends Parents{
    public final void doit(){
        System.out.println("子类.doit()");
    }
    public void doit3(){
        System.out.println("子类.doit3()");
    }
}
public class FinalMethod {
    public static void main(String[] args) {
        Sub s=new Sub();
        s.doit();
        Parents p=new Parents();//执行向上转型操作
        //p.doit();  //不能调用private方法
        p.doit2();
        p.doit3();

    }
}
