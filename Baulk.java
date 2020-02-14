public class Baulk {
    public static void main(String[] args) {
        int result=3/0;
        System.out.println(result);
    }
}
//运行实例时，产生了算术异常ArithmeticException，导致了算术异常的根源在于算术表达式”3/0“中
//0作为除数出现，所以正在执行的程序被中断（第三行以后的的代码都i不会被执行）
