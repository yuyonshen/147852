// 在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果。
public class Test33{
    public static void main(String[] args) {
        int a=20;
        int b=30;
        double c=2.4;
        double d=3.5;
        double e=6.7;
        int ret=Add(a,b);
        System.out.println(ret);
        double num=Add(c,d,e);
        System.out.println(num);
    }
        public static int Add(int a,int b){
            int ret=a+b;
            return ret;
        }
        public static double Add(double c,double d,double e){
            double ret=c+d+e;
            return ret;
        }
    
}