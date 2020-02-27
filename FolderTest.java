import java.io.File;

public class FolderTest {
    public static void main(String[] args) {
        String path="D:\\Test";
        for(int i=1;i<=10;i++){
            File folder=new File(path+"\\"+i);
            if(!folder.exists()){
                folder.mkdirs();
            }
        }
        System.out.println("文件夹创建成功，请打开c盘查看！");
        File file=new File("D:\\");
        File[] files=file.listFiles();
        for(File folder:files){
            if(folder.isFile()){
                System.out.println(folder.getName()+"文件");
            }else if(folder.isDirectory()){
                System.out.println(folder.getName()+"文件夹");
            }
        }

    }
}
