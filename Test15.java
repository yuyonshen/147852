import java.util.Scanner;
public class Test15{
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("请输入一个大于1的数字：");
    int num=scanner. nextInt();
    int i;
    for(i=2;i<num;i++){
        if(num%i!=0){
            System.out.println("是素数");
        }else{
            System.out.println("不是素数");
                break;
        }
    }

    }
}