//获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列 
import java.util.Scanner;
public class Test27{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num=scanner.nextInt();
        System.out.println("奇数");
        for(int i=0;i<32;i+=2){
            num=num>>i;   
            System.out.println(num&1);
        }
        System.out.println("偶数");
        for(int i=1;i<32;i+=2){
            num=num>>i;
            System.out.println(num&1);
        }
    }
}