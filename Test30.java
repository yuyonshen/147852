//求1！+2！+3！+4！+........+n!的和
import java.util.Scanner;
public class Test30{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num=scanner.nextInt();
        int ret=Add(num);
        System.out.println("ret="+ret);
    }
    public static int Factorial(int b){
        if(b==1){
            return 1;
        }else {
            return b*Factorial(b-1);
        }
    }
    public static int Add(int c){
        int i;
        int add=0;
        int NUW=0;
        for( i=1;i<=c;i++){
            add=Factorial(i);
            NUW+=add;
        }
        return NUW;
    }
    
}