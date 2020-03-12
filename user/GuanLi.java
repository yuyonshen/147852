package User;

import Dongzuo.*;
import book.BookList;

import java.util.Scanner;

public class GuanLi extends User {
    public GuanLi(String name){
        this.name=name;

         dongzuo=new Dongzuos[]{
                new chaxun(),
                new zengjia(),
                new shanchu(),
                new daying(),
                new tuichu()
        };
    }

    @Override
    public int menu() {
        System.out.println("===============================");
        System.out.println(this.name+"欢迎使用图书馆管理系统");
        System.out.println("0.查询图书");
        System.out.println("1.增加图书");
        System.out.println("2.删除图书");
        System.out.println("3.打印图书");
        System.out.println("4.退出系统");
        System.out.println("================================");
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入你的选项");
        int choice=scanner.nextInt();
        return choice;

    }
    public void Dodongzuo(int choice, BookList bookList){
        dongzuo[choice].work(bookList);
    }
}
