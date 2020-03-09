package Book;

public class BookList {
    private Book[] books=new Book[100];
    private int size=0;

    //增加书记
    public BookList(){
        books[0]=new Book("三国演义","罗贯中",100,"古典名著"
        ,false);
        books[1]=new Book("西游记","吴承恩",120,"古典名著"
        ,false);
        books[2]=new Book("零基础学Java","吉林大学",69,"计算机类"
        ,false);
        books[3]=new Book("c语言","清华大学",70,"计算机类",
                false);
    }
    public void setBooks(int pos,Book book){
        books[pos]=book;
    }
    public Book getBook(int pos){
        return books[pos];
    }
    public void setSize(int size){
        this.size=size;
    }
    public int  getSize(){
        return size;
    }
}
