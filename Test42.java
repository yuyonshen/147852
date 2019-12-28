//4、写一个递归方法，输入一个非负整数，返回组成它的数字之和.
import java.util.Scanner;
public class Test42{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个非负整数");
        int num=scanner.nextInt();
        System.out.println(Add(num));
    }
    public static int Add(int n){
        if(n<10){
            return n;
        }
        return n%10+Add(n/10);
    }
}