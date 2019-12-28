//递归
//递归求 N 的阶乘 
import java.util.Scanner;
public class Test39{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int ret=factor(num);
        System.out.println("ret="+ret);
    }
    public static int factor(int n){
        if(n==1){
            return 1;
        }
        return n*factor(n-1);
    }
}