//、求斐波那契数列的第n项。(迭代实现)
import java.util.Scanner;
public class Test31{
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("请输入一个整数");
    int num=scanner.nextInt();
    int ret=Number(num);
    System.out.println("ret="+ret);
}
public static int Number(int num){
    
    if(num==1||num==2){
        return 1;
    }else{
        return Number(num-1)+Number(num-2);
    }
    }
}
