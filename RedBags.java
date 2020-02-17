import java.util.Random;
import java.util.Scanner;

public class RedBags {
    public static void main(String[] args) {
        System.out.println("------模拟味型抢红包------");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要装入红包总金额");
        double total=scanner.nextDouble();
        System.out.println("请输入红包的个数");
        int bagsnum=scanner.nextInt();
        double min=0.01;
        Random random=new Random();
        if(total/bagsnum==0.01){
            for(int i=0;i<bagsnum;i++){
                double money=min;
                total-=money;
                System.out.println("第"+i+"个红包"+String.format("%.2f",money)+
                        "元");
            }
        }else if(total/bagsnum<0.01){
            System.out.println("要保证每个人都能分到一分钱哦");
            return;
        }else{
            for(int i=1;i<bagsnum;i++){
                double max=total-(bagsnum-i)*min;
                double bound=max-min;
                double safe=(double)random.nextInt((int)(bound*100))/100;
                double money=safe+min;
                total=total-money;
                System.out.println("第"+i+"个红包"+String.format("%.2f",money)+"元");
            }
        }
        System.out.println("第"+bagsnum+"个红包"+String.format("%.2f",total)+"元");
        scanner.close();
    }
}
