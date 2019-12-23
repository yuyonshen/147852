//求两个正整数的最大公约数 
import java.util.Scanner;
public class Test20{
    public static void main(String[] args) {
       int i;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a=scanner.nextInt();
        System.out.println("请输入第二个数：");
        int b=scanner.nextInt();
        if(a>b){
          for(i=b;i>0;i--){
              if(((a%i)==0)&&((b%i)==0)){
                System.out.println("i="+i);
                break;  
            }
          }
        }else{
            for(i=a;i>0;i--){
                if(((a%i)==0)&&((b%i)==0)){
                    System.out.println("i="+i);
                    break;
                }
            }
        }
    }
}