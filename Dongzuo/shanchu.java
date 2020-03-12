package Dongzuo;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class shanchu implements  Dongzuos{
    @Override
    public void work(BookList bookList) {
        System.out.println("执行删除操作");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要删除的书名");
        String name=scanner.next();
        int i=0;
        for(i=0;i<bookList.getSize();i++){
            Book book=bookList.getBook(i);
            if(book.getName().equals(name)){
                break;
            }
        }
        if(i>=bookList.getSize()){
            System.out.println("删除失败");
            return;
        }
        int size=bookList.getSize();
        bookList.setBook(i,bookList.getBook(i+1));
        bookList.setSize(size-1);
    }
}
