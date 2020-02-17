import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class GetCon {
    public static void main(String[] args) {
//        int maxint=Integer.MAX_VALUE;
//        int minint=Integer.MIN_VALUE;
//        int intsize=Integer.SIZE;
//        System.out.println("int类型取最大值："+maxint);
//        System.out.println("int类型取最小值："+minint);
//        System.out.println("int类型的二进制位数："+intsize);
        //判断大小
        int maxint=Integer.MAX_VALUE+1;
        int minint=Integer.MIN_VALUE;
        System.out.println(Integer.compare(maxint,minint));
    }
}
