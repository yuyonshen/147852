import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date=new Date();
        long value=date.getTime();
        System.out.println("当前日期，时间："+date);
        System.out.println("以基准时间到当前时间所经过的毫秒数为："+value);
    }
}
