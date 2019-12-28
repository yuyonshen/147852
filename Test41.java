//按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
import java.util.Scanner;
public class Test41{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num=scanner.nextInt();
        print(num);
    }
    public static void print(int n){
        if(n>9){
           print (n/10);
        }
        System.out.println(n%10);
    }
}