import book.BookList;

import user.NormalUser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookList bookList=new BookList();
        NormalUser user=login();
        while(true){
            int choice=user.menu();
            user.doAction(choice,bookList);
        }
    }

    public static NormalUser login(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("请登录系统");
        System.out.println("请输入你的姓名");
        String name=scanner.next();
        System.out.println("请输入你的身份：1。管理员 2.普通用户");
        int choice=scanner.nextInt();
        return new NormalUser(name);

    }
}
