import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReaderAndWriter {
    public static void main(String[] args) {
        while(true){
           try {
               File file = new File("word.txt");
               if (!file.exists()) {
                   file.createNewFile();
               }
               System.out.println("请输入要执行的操作（1.写入文件。2.读取文件）");
               Scanner sc = new Scanner(System.in);
               int choice = sc.nextInt();
               switch (choice) {
                   case 1:
                       System.out.println("请输入要写入的文件的内容");
                       String tempStr = sc.next();
                       FileWriter fw = null;
                       try {
                           fw = new FileWriter(file, true);
                           fw.write(tempStr + "\r\n");

                       } catch (IOException e) {
                           e.printStackTrace();
                       } finally {
                           fw.close();
                       }
                       System.out.println("上述内容以写入文本文件中！");
                       break;
                   case 2:
                       FileReader fr = null;
                       if (file.length() == 0) {
                           System.out.println("文本中的字符长度为零!");

                       } else {
                           try {
                               fr = new FileReader(file);
                               char[] cbuf = new char[1024];
                               int hasread = -1;
                               while ((hasread = fr.read(cbuf)) != -1) {
                                   System.out.println("文件“word。txt”中的内容为：\n"
                                           + new String(cbuf, 0, hasread));
                               }
                           } catch (IOException e) {
                               e.printStackTrace();
                           }finally {
                               fr.close();
                           }
                       }
                       break;
                   default:
                       System.out.println("请输入符合要求的有效数字！");
                       break;
               }
           }catch (InputMismatchException imexc){
               System.out.println("输入文本格式不正确！亲重新输入.....");
           }catch (IOException e){
               e.printStackTrace();
           }
        }
    }
}
