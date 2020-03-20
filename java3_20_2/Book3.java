package java3_20_2;

public class Book3<T> {
    private T[] bookInfo;

    public Book3(T[] bookInfo){
        this.bookInfo=bookInfo;
    }
    public void showBookInfo(){
        System.out.println("书名\t\t作者\t价格\t是否携带光盘");
        System.out.println("-------------------------------------");
        for(int i=0;i<bookInfo.length;i++){
            System.out.print(bookInfo[i]+"\t" );
        }
    }

    public static void main(String[] args) {
        String[] info={"<<零基础学java>>","明日科技","67.6","赠送光盘"};
        Book3<String> book=new Book3<>(info);
        book.showBookInfo();
    }
}
