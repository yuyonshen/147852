import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;

public class DateFormatTest {
    public static void main(String[] args) {
       //创建了一个日期
        Date date=new Date();
        //创建不同日期格式
        DateFormat df1=DateFormat.getInstance();
       DateFormat df2=new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss EE");
       DateFormat df3=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒 EE", Locale.CHINA);
        System.out.println(df1.format(date));
        System.out.println(df2.format(date));
        System.out.println(df3.format(date));

    }
}
