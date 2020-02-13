class Test{
    public int i;
}
public class FinalDate {
    final int value1=9;//声明一个常量；
    static final int VALUE2=10;//声明一个静态常量
    final Test obj=new Test();//声明一个常量对象；

    public static void main(String[] args) {
        FinalDate f=new FinalDate();//创建一个常量测试类对象；
//        f.value1=1;   //编译器报错，因为常量不可以重新赋值

//        FinalDate.VALUE2;//编译器报错，因为静态常量可以用类名调用，且不可以重新赋值
//        f.obj=new Test();//编译器报错，因为常量对象不可以重新赋值
        f.obj.i=1;
    }
}
