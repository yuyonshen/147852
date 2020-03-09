package Dongzuo;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class huanshu implements Dongzuo {
    @Override
    public void work(BookList bookList) {
        System.out.println("执行还书操作");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书的名字");
        String name=scanner .next();
        for(int i=0;i<bookList.getSize();i++){
            Book book=bookList.getBook(i);
            if(book.getName().equals(name)){
                if(book.isZaibuzai()){
                    book.setZaibuzai(false);
                    System.out.println("还书成功");
                    return ;
                }
            }

        }
        System.out.println("还书失败");

    }
}
