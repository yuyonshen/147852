public class Book {
    private int add(int shelf,int box){
        box=box+shelf;
        return box;
    }

    public static void main(String[] args) {
        Book book=new Book();
        int shelf=30;
        int box=40;
        System.out.println("把书架上的书全部放在箱子后，箱子里书的总和："+book.add(shelf,box));
    }
}
