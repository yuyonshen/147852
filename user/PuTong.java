package User;

import Dongzuo.*;
import book.BookList;

import java.util.Scanner;

public class PuTong extends User {
    public PuTong(String name){
        this.name=name;
        dongzuo=new Dongzuos[]{
                new chaxun(),
                new jieshu(),
                new huanshu(),
                new tuichu()
        };

    }
    @Override
    public int menu() {
        System.out.println("===========================");
        System.out.println(this.name+"欢迎进入图书馆系统");
        System.out.println("0.查询书籍");
        System.out.println("1.借书");
        System.out.println("2.还书");
        System.out.println("3.退出");
        System.out.println("请输入你的选项");
        Scanner scanner =new Scanner(System.in);
        int choice=scanner.nextInt();
        System.out.println("=============================");
        return choice;
    }
    public void Dodongzuo(int choice, BookList bookList){
        dongzuo[choice].work(bookList);
    }
}
