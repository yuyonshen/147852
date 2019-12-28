//7、递归实现代码: 青蛙跳台阶问题 
//一只青蛙一次可以跳上 1 级台阶，也可以跳上2 级。求该青蛙跳上一个n 级的台阶总共有多少种跳法 
import java.util.Scanner;
public class Test45{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入台阶数");
            int num=scanner.nextInt();
            System.out.println(kind(num));
    }
    public static int kind(int n){
        if(n==0){
            return 0;
        }else if(n==1||n==2){
            return n;
        }
        return kind(n-2)+kind(n-1);
    }
}