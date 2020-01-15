import java.util.Scanner;

public class Java1_15_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的密码");
        int possword=scanner.nextInt();
        boolean result=(possword==9999);
        System.out.println("你的密码输入"+result);
        scanner.close();
    }
}
