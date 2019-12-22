import java.util.Scanner;
public class Test7{
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       int num = scanner .nextInt();
        if(num<0){
            System.out.println("负数");
        } else if(num>0){
        System.out.println("整数");
    }else{
       System.out.println("0");
   } 
}
}