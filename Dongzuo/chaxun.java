package Dongzuo;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class chaxun implements Dongzuos {
    @Override
    public void work(BookList bookList) {
        System.out.println("执行查询操作");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要查询的书名");
        String name = scanner.next();
        for (int i = 0; i < bookList.getSize(); i++) {
            Book books = bookList.getBook(i);
            if (books.getName().equals(name)) {
                System.out.println(books);
            }
        }
    }

}
