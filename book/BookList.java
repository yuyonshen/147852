package book;

public class BookList {
    private Book[] books=new Book[100];
    private int size=0;

    public BookList( ){
        books[0]=new Book("三国演义","罗贯中",100,"古典名著",false);
        books[1]=new Book("西游记","吴承恩",110,"古典名著",false);
        books[2]=new Book("金瓶梅","南岭小小先生",90,"古典名著",false);

        size=3;

    }
    public Book getBook(int pos){

        return books[pos];
    }
    public void setBook(int pos,Book book){
        books[pos]=book;
    }
    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size=size;
    }

}
