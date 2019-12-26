import java.util.Scanner;
public class Yu1{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个非负数");
        int num=scanner.nextInt();
        int ret=Add(num);
        System.out.println(ret);
    }
    public static int Add(int n){
        if(n<10){
            return n;
        }else{
            return (n%10)+Add(n/10);
        }
    }
}