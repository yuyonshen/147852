package Dongzuo;

import book.Book;
import book.BookList;

public class daying implements  Dongzuos {
    @Override
    public void work(BookList bookList) {
        System.out.println("执行打印操作");
        for(int i=0;i<bookList.getSize();i++){
            Book book=bookList.getBook(i);
            System.out.println(book.toString());
        }
    }
}
