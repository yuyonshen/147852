package Extends;

import java.util.Date;

import static java.lang.Math.*;

public class Test {
//    public static void main(String[] args) {
//        Date date=new Date();
//        System.out.println(date.getTime());
//    }
//public static void main(String[] args) {
//    java.util.Date date=new java.util.Date();
//    System.out.println(date.getTime());
//}
//静态方法的导入
//    public static void main(String[] args) {
//    double x=30;
//    double y=40;
//   // double result=Math.sqrt((Math.pow(x,2)))+Math.sqrt(Math.pow(y,2));
//    double result=sqrt(pow(x,2))+sqrt(pow(y,2));
//    System.out.println(result);
//}
public static void main(String[] args) {
    Animal an=new Animal("动物");
    an.eat("食物");
    Cat cat=new Cat("小黑");
    cat.eat("猫粮");
    Bird bird=new Bird("圆圆");
    bird.fly();
}
//final关键字：修饰类的时候就表示这个类不可以被继承。
    //final修饰一段字段或者一个变量表示常量，不可以修改。
}
