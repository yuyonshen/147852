class Calculator{
    private int num1;
    private int num2;

    public Calculator(){
        this.num1=10;
        this.num2=20;
    }

    public void show(){
        System.out.println(num1+num2);
    }
    public void show1(){
        System.out.println(num1-num2);
    }
    public void show2(){
        System.out.println(num1*num2);
    }
    public void show3(){
        System.out.println(num1/num2);
    }
}
public class Test83 {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        cal.show();
        cal.show1();
        cal.show2();
        cal.show3();
    }
}


