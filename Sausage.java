abstract class FreshkeepingFilm{
    abstract void pack();
}

public class Sausage {
    public static void main(String[] args) {
        new FreshkeepingFilm(){
            void pack(){
                System.out.println("缠上保鲜膜为香肠保鲜");

            }
        }.pack();//匿名内部类FreshkeepingFilm的对象调用重写抽象的包装方法
    }
}
