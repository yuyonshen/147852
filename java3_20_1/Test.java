package java3_20_1;

public class Test {
    public static int divide(int x,int y){
        if(y==0){
            throw new ArithmeticException("抛出一个除0异常");
        }
        return x/y;
    }

    public static void main(String[] args) {
        System.out.println(divide(10,0));
    }
}
