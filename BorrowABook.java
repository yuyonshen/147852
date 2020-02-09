public class BorrowABook {
    public BorrowABook(){

    }
    public void borrow(String name){
        System.out.println("请前往借阅登记处领取"+name+".");
    }

    public static void main(String[] args) {
        BorrowABook book=new BorrowABook();//创建一个借书类的对象；
        book.borrow("《战争与和平》");
    }
}
