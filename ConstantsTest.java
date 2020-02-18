import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
interface Constants {//将常量放在接口中
    public static final int Constants_A=1;
    public static final int Constants_B=12;
}
public class ConstantsTest {
    enum Constants2{//将常量放置在枚举类型中
        Constants_A,Constants_B
    }
    public static void doit(int c){
        switch(c){
            case Constants.Constants_A:
                System.out.println(Constants.Constants_A);
                break;

            case Constants.Constants_B:
                System.out.println(Constants.Constants_B);
        }
            }
    public static  void doit2(Constants2 c) {
        switch(c){
            case Constants_A:
                System.out.println(Constants2.Constants_A);
                break;
            case Constants_B:
                System.out.println(Constants2.Constants_B);
                break;
        }
    }

    public static void main(String[] args) {
        ConstantsTest.doit(Constants.Constants_A);
        ConstantsTest.doit(Constants.Constants_B);
        ConstantsTest.doit2(Constants2.Constants_A);
        ConstantsTest.doit2(Constants2.Constants_B);
    }
}
