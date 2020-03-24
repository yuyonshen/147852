import java.io.File;
import java.sql.SQLOutput;

public class FolderTest2 {
    public static void main(String[] args) {
        String path="c:\\Test";
        for(int i=1;i<=10;i++){
            File file=new File(path+"\\"+i);
            if(!file.exists()){
                file.mkdirs();
            }
        }
        System.out.println("文件夹创建成功,请打开c盘查看!");
        File file2=new File("c:\\");
        File[] files=file2.listFiles();
        for(File folder:files){
            if(folder.isFile()){
                System.out.println(folder.getName()+"文件");

            }else if(folder.isDirectory()){
                System.out.println(folder.getName()+"文件夹");
            }
        }
    }
}
