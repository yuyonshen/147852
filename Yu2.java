//打印一个数字的每一位
import java.util.Scanner;
public class Yu2{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num=scanner.nextInt();
        print(num);
    }
    public static void print(int n){
        if(n>9){
            print(n/10);
        }
            System.out.println(n%10); 
    }
}