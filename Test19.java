//求一个整数，在内存当中存储时，二进制1的个数。
import java.util.Scanner;
public class Test19{
public static void main(String[] args) {
   int i;
   int count=0;
   Scanner scanner=new Scanner(System.in);
       
        System.out.println("请输入一个数字：");
        int num=scanner.nextInt();
   for(i=1;i<32;i++){
       if((num&1)==1){
           count++;
       }
       num=num>>i;
   }
System.out.println(count);
}
}