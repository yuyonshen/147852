//编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序 
import java.util.Scanner;
public class Test26{
    public static void main(String[] args) {
        int num=6666;
       
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("请输入密码");
            int Password=scanner.nextInt();
            if(Password!=num){
                System.out.println("密码输入错吴");
            }else if(Password==num){
                System.out.println("登录成功");
                break;
            }else if(i==2){
                System.out.println("登录失败");
            }
        }
    
    }
}