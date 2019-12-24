//5、完成猜数字游戏 
import java.util.Random;
import java.util.Scanner;
public class Test23{
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int toGuess=random.nextInt(100)+1;
        while(true){
            System.out.println("请输入数字：");
            int num=scanner.nextInt();
            if(num<toGuess){
                System.out.println("低了");
            }else if(num>toGuess){
                System.out.println("高了");
            }else{
                System.out.println("猜对了");
            }
        }
    }
}