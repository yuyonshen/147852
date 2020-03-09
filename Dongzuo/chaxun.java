package Dongzuo;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class chaxun implements Dongzuo {
    @Override
    public void work(BookList bookList) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要查询的书名");
        String name=scanner.next();
        for(int i=0;i<bookList.getSize();i++){
            Book book=bookList.getBook(i);
            if(book.getName().equals(name)){
                System.out.println(book);
            }
        }
    }
}
