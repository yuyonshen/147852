import User.GuanLi;
import User.PuTong;
import book.BookList;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookList bookList=new BookList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请登录系统");
        System.out.println("请输入你的姓名");
        String name=scanner.next();
        System.out.println("请输入你身份:1.管理员,2.普通用户");
        int who=scanner.nextInt();

            if(who==1){
               GuanLi user=new GuanLi(name);
               while(true){
                   int choice=user.menu();
                   user.Dodongzuo(choice,bookList);
               }
            }else{
                PuTong user=new PuTong(name);
               while(true) {
                   int choice = user.menu();
                   user.Dodongzuo(choice, bookList);
               }

            }
        }

}
