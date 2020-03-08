package action;

import book.Book;
import book.BookList;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class BorrowAction implements IAction {
    @Override
    public void work(BookList bookList) {
        System.out.println("执行结束操作");
        System.out.println("请输入书名");
        Scanner scanner =new Scanner(System.in);
        String name=scanner.next();
        for(int i=0;i<bookList.getsize();i++){
            Book book=bookList.getBook(i);
            if (book.equals(name)) {
                continue;
            }else{
                book.setBorrowed(true);
                System.out.println("借书成功");
                return ;
            }
        }
        System.out.println("借书失败");
    }

}
