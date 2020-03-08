package user;

import action.*;
import book.BookList;

import java.util.Scanner;

public class NormalUser {
    private String name;
    private IAction[] actions=new IAction[]{
            new ExitAction(),//查询
            new FindAction(),//借书
            new BorrowAction(),//还书
            new ReturnAction(),//退出
    };
    public NormalUser(String name){

        this.name=name;
    }
    public int menu(){
        System.out.println("===============================");
        System.out.println("欢迎"+this.name+"使用图书馆管理系统");
        System.out.println("1.查询书籍");
        System.out.println("2.借书");
        System.out.println("3.还书");
        System.out.println("4退出");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的选择");
        int choice=scanner.nextInt();
        return choice;
    }
    public void   doAction(int choice, BookList bookList){
         actions[choice].work(bookList);
    }
}
