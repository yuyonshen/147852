public class Hello {
    public String toString(){
        return "Say "+getClass().getName()+" to java";
    }

    public static void main(String[] args) {
        Hello hello=new Hello();
        System.out.println(hello.toString());
    }
}
