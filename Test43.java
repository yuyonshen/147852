//5、递归求斐波那契数列的第 N 项 
import java.util.Scanner;
public class Test43{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num=scanner.nextInt();
        System.out.println(fibonacci(num));
    }
    public static int fibonacci(int n){
        if(n==1||n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}