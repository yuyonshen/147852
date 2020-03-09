import Book.BookList;
import User.PuTong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookList bookList=new BookList();
        PuTong user=along();
        while(true){
            int choice=user.menu();
            user.doDongzuo(choice ,bookList);
        }
    }
    public static PuTong along(){
        System.out.println("====================");
        Scanner scanner=new Scanner(System.in);
        System.out.println("亲登录系统");
        System.out.println("请输入你的姓名");
        String name=scanner.next();
        System.out.println("请输入你的省份：1，管理员。2，普通用户");
        int choice=scanner.nextInt();
        return new PuTong(name);

    }
}
