import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class FileTest {
    public static void main(String[] args) {
        File file=new File("test.txt");
        if(!file.exists()){//文件不存在（程序第一次运行时，执行的语句块
            System.out.println("未在指定目录中找到以下文件名为test。txt的文本文件！正在创建。。。。。");
            try{
                file.createNewFile();
            }catch(IOException e){
                e.printStackTrace();
            }
            System.out.println("文件创建成功！");
        }else{
            System.out.println("找到文件名为test的文本文件");
            if(file.isFile()&&file.canRead()){
                System.out.println("文件可读！正在读取信息。。。。");
                String fineName=file.getName();
                String filePath=file.getAbsolutePath();
                boolean hidden=file.isHidden();
                long len=file.length();
                long tempTime=file.lastModified();
                SimpleDateFormat sdf=new SimpleDateFormat("yyy/MM/dd hh:mm:ss");
                Date date=new Date(tempTime);
                String time=sdf.format(date);
                System.out.println("文件名"+fineName);
                System.out.println("文件的绝对路径"+filePath);
                System.out.println("文件是否隐藏"+hidden);
                System.out.println("文件中的字节"+len);
                System.out.println("文件最后修改的时间"+time);
                file.delete();
                System.out.println("这个文件夹的使命结束了。已被删除");
            }
        }
    }
}
