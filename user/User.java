package User;

import Dongzuo.Dongzuos;
import book.BookList;

abstract class User {
    protected  String name;
    protected Dongzuos[] dongzuo=null;


    abstract public int menu();

    public void Dodongzuo(int choice, BookList bookList){
        dongzuo[choice].work(bookList);
    }
}
