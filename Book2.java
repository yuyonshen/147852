public class Book2<T> {
    private T[] bookInfo;
    public Book2(T[] bookInfo){
        this.bookInfo=bookInfo;
    }
    public void showBookInfo(){
        System.out.println("书名\t\t作者\t价格\t是否附赠光盘");
        System.out.println("-------------------------------------");
        for(int i=0;i<bookInfo.length;i++){
            System.out.print(bookInfo[i]+"\t");
        }
    }
    public static void main(String[] args) {
        String[] info={"《零基础学java》","明日科技","69.80","附赠光盘"};
        Book2<String> book=new Book2<String>(info);
      book.showBookInfo();
    }
}