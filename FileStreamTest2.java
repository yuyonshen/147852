import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {
    public static void main(String[] args) {
        File file=new File("word.txt");
        try{//输出流写入文件
            FileOutputStream out=new FileOutputStream(file);
            String content="你见过凌晨四点的洛杉矶吗？";
            byte buy[]=content.getBytes();
            out.write(buy);
            out.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        try{//输入流，读取文件的内容
            FileInputStream in=new FileInputStream(file);
            byte[] byt=new byte[1024];
            int len=in.read(byt);
            System.out.println("文件中的信息是："+new String(byt,0,len));
            in.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
