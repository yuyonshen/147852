package java3_32_1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest2 {
    public static void main(String[] args) {
        //创建文件对象
        File file=new File("test.txt");
        if(!file.exists()){//文件不存在
            System.out.println("未在指定目录下找到文件名为text的文本文件");
            try{
                //当且仅当不存在指定文件名时,创建一个新的空文件
                file.createNewFile();
            }catch(IOException E){
                    E.printStackTrace();
            }
            System.out.println("文件创建成功");
        }else{//文件存在
            System.out.println("找到文件名为text的文本文件");
            if(file.isFile()&&file.canRead()){//判断该文件是否可读和是不是文件
                System.out.println("文件可读:正在读取文件信息.............");
                //获取文件名
                String fileName=file.getName();
                //获取文件路径
                String filePath=file.getAbsolutePath();
                //判断文件是否为隐藏文件
                boolean hidden=file.isHidden();
                //获取文件的长度
                long len=file.length();
                //获取文件最后修改时间
                long tempTime=file.lastModified();
                //格式化输出
                SimpleDateFormat sdf=new SimpleDateFormat("yyy/mm/dd HH:mm:ss");
                //获取修改时间
                Date date=new Date(tempTime);
                //指定格式
                String time=sdf.format(date);
                System.out.println("文件名:"+fileName);
                System.out.println("文件路径:"+filePath);
                System.out.println("文件是否为隐藏文件:"+hidden);
                System.out.println("文件中的字节数:"+len);
                System.out.println("文件最后修改时间:"+time);
                //查完该文件信息后,删除文件
                file.delete();
                System.out.println("这个文件使命结束了.");

            }else{
                System.out.println("文件不可读");
            }
        }
    }
}
