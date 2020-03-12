package Dongzuo;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class zengjia implements Dongzuos {
    @Override
    public void work(BookList bookList) {
        System.out.println("增加书籍操作");
        Scanner scanner=new Scanner(System.in);
        System.out.println("增加行的书籍");
        System.out.println("请输入书名:");
        String name=scanner.next();
        System.out.println("请输入作者:");
        String zuozhe=scanner.next();
        System.out.println("请输入价格:");
        int jiage=scanner.nextInt();
        System.out.println("请输入类型:");
        String leixing=scanner.next();
        Book book=new Book(name,zuozhe,jiage,leixing,false);
        int size=bookList.getSize();
        bookList.setBook(size,book);
        bookList.setSize(size+1);
        System.out.println("增加图书成功");
    }
}
