public class Book<T> {
    private T bookInfo;
    public Book(T bookInfo){
        this.bookInfo=bookInfo;
    }
    public T getBookInfo(){
        return bookInfo;
    }

    public static void main(String[] args) {
        Book<String> bookName=new Book<String>("《零基础学java》");
        Book<String> bookAuthor=new Book<String>("明日科技");
        Book<Double> bookPrice=new Book<Double>(69.8);
        Book<Boolean> hasCD=new Book<Boolean>(true);
        System.out.println("书名："+bookName.getBookInfo());
        System.out.println("作者："+bookAuthor.getBookInfo());
        System.out.println("价格："+bookPrice.getBookInfo());
        System.out.println("是否赠送光盘："+hasCD.getBookInfo());

    }
}
