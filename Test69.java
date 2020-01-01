import java.util.Scanner;
public class Test69{
    public static void main(String[] args) {
            Scanner scanner=new Scanner (System.in);
            System.out.println("请输入你要博大的手机号：");
            int num=scanner.nextInt();
            if(num!=35677){
                System.out.println("对不起你拨打的电话号码不存在");
            }
    }
}