public class BorrowABook2 {
    String name;
    //构造方法
    public BorrowABook2(String name){
        this.name=name;
    }
    public void borrow(){
        System.out.println("请前往借阅登记处领取"+name+".");
    }

    public static void main(String[] args) {
        BorrowABook2 book=new BorrowABook2("《战争与和平》");
        book.borrow();
    }
}
