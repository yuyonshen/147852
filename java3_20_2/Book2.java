package java3_20_2;

public class Book2<T> {
    private T bookInfo;

    public Book2(T bookInfo) {
        this.bookInfo = bookInfo;
    }

    public T getBookInfo() {
        return bookInfo;
    }

    public static void main(String[] args) {
        Book2<String> bookName=new Book2<>("<<零基础学java>>");
        Book2<String> bookAuthor=new Book2<>("明日科技");
        Book2<Double> bookPrice=new Book2<>(69.5);
        Book2<Boolean> hasCD=new Book2<>(true);

        System.out.println("书名"+bookName.getBookInfo());
        System.out.println("作者"+bookAuthor.getBookInfo());
        System.out.println("价格"+bookPrice.getBookInfo());
        System.out.println("是否怎送光盘"+hasCD.getBookInfo());
    }
}
