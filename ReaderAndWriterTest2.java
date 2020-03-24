import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReaderAndWriterTest2 {
    public static void main(String[] args) {
        while(true){
            try {
                File file = new File("word.txt");
                if (!file.exists()) {
                    file.createNewFile();
                }
                    System.out.println("请输入你要执行的操作序号(1)写入文件(2)读取文件");
                    Scanner scanner = new Scanner(System.in);
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("请输入你要写入的内容");
                            String temp = scanner.next();
                            FileWriter fw = null;
                            try {
                                fw = new FileWriter(file, true);
                                fw.write(temp + "\r\n");
                            } catch (IOException e) {
                                e.printStackTrace();
                            } finally {
                                fw.close();
                            }
                            System.out.println("上述内容以写入到文件中");
                            break;
                        case 2:
                            FileReader fr = null;
                            if (file.length() == 0) {
                                System.out.println("文本中的字符数为零");

                            } else {
                                try {
                                    fr = new FileReader(file);
                                    char[] cubf = new char[1024];
                                    int hasread = -1;
                                    while ((hasread = fr.read(cubf)) != -1) {
                                        System.out.println("文件word.txt中的内容:\n"
                                                + new String(cubf, 0, hasread));
                                    }
                                } catch (IOException e) {
                                    e.printStackTrace();
                                } finally {
                                    fr.close();
                                }
                            }
                            break;
                        default:
                            System.out.println("请输入符合要求的数字");
                            break;
                    }
                } catch (InputMismatchException imexc) {
            System.out.println("输入文本格不正确");
        } catch (IOException e) {
            e.printStackTrace();
        }


        }
    }
}
