import java.util.Scanner;

public class AnyFunction {
    public static void main(String[] args) {
//        System.out.println("4和8较大者："+Math.max(4,8));
//        System.out.println("4.4和4较小者："+Math.min(4.4,4));
//        System.out.println("-7的绝对值："+Math.abs(-7));
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入前一天的菠菜价格");
        int a=scanner.nextInt();
        System.out.println("请输入当日的菠菜价格");
        int b=scanner.nextInt();
        System.out.println(Math.abs(a-b));
    }
}
