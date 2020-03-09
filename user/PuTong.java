package User;

import Book.BookList;
import Dongzuo.*;

import java.util.Scanner;

public class PuTong {
    private String name;
    private  Dongzuo[] dongzuo=new Dongzuo[]{
            new chaxun(),
            new jieshu(),
            new huanshu(),
            new tuichu()
    };
    public PuTong(String name){
        this.name=name;
    }

    public int menu(){
        System.out.println("======================");
        System.out.println("欢迎"+this.name+"请入图书馆系统");
        System.out.println("0.查询书籍");
        System.out.println("1.借书");
        System.out.println("2.还书");
        System.out.println("3.退出");
        Scanner scanner=new Scanner(System.in);
        System.out.println("亲输入你的选项");
        int choice=scanner.nextInt();
        return choice;
    }
    public void doDongzuo(int choice, BookList bookList){
        dongzuo[choice].work(bookList);
    }
}
