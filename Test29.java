//、求 N 的阶乘 。
import java.util.Scanner;
public class Test29{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num=scanner.nextInt();
        int ret=Factorial(num);
        System.out.println(ret);
    }
        public static int Factorial(int b){
        if(b==1){
            return 1;
        }else {
            return b*Factorial(b-1);
        }
    }
}