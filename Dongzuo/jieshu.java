package Dongzuo;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class jieshu implements Dongzuos {
    @Override
    public void work(BookList bookList) {
        System.out.println("执行借书操作");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要借的书名");
        String name=scanner.next();
        for(int i=0;i<bookList.getSize();i++){
            Book book=bookList.getBook(i);
            if(book.getName().equals(name)) {
                if (book.isZaibuzai()) {
                    continue;
                } else {
                    book.setZaibuzai(true);
                    System.out.println("借书成功");
                    return ;
                }
            }
        }

    }
}
