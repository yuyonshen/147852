 class bass{

    public bass(String s){

        System.out.print("B");

    }

}
public class Derived extends bass{

    public Derived (String s) {
        super(s);

    }

    public static void main(String[] args){

        new Derived("C");

    }

}
