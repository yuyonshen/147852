//创建静态代码块，非静态代码块，构造方法，成员方法，查看这几处代码块的调用顺序。
public class StaticTest {
    static String name;
    //静态代码块
    static{
        System.out.println(name+"静态代码块");
    }
    //非静态代码块
    {
        System.out.println(name+"非静态代码块");
    }
    public StaticTest(String a){
        name=a;
        System.out.println(name+"构造的方法");
    }
    public void method(){
        System.out.println(name+"成员方法");
    }

    public static void main(String[] args) {
        StaticTest s1;
        StaticTest S2=new StaticTest("s2");
        StaticTest S3=new StaticTest("s3");
        S3.method();
    }
}
