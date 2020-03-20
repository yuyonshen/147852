package java3_20_1;

public class Test2 {
    public static int func(){
        try{
            return 10;
        }finally {
            return 20;
        }
    }

    public static void main(String[] args) {
        System.out.println(func());
    }
}
//finally执行的时机是在方法返回之前(try或者catch中如果有return会在这个return之前执行finally).但是如果finally中也存在return
//语句,那么就会执行finally中的return,从而不会执行到try中原有的return.