import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest2 {
    public static void main(String[] args) {
        File file = new File("word.txt");
        try {
            FileOutputStream out = new FileOutputStream(file);
            String content = "你见过洛杉矶凌晨4点的样子吗";
            byte[] buy = content.getBytes();
            out.write(buy);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            FileInputStream in = new FileInputStream(file);
            byte[] byt = new byte[1024];
            int len = in.read(byt);
            System.out.println("文件中的信息:" + new String(byt, 0, len));
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
