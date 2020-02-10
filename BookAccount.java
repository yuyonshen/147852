import java.util.Scanner;

public class BookAccount {
    public static double rate=0.0265;

    public void  sum(){
      Scanner scanner=new Scanner(System.in);
        System.out.println("请输入存款本金：");
        int sum=scanner.nextInt();
        System.out.println("请输入需要存款时间：");
        int year=scanner.nextInt();
        System.out.println(year+"年后，存入"+sum+"元所获取利息为"+sum*year*rate);
    }

    public static void main(String[] args) {
    BookAccount bookAccount=new BookAccount() ;
    bookAccount.sum();
    }




}
