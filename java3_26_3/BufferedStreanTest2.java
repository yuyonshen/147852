package java3_26_3;

import java.io.*;

public class BufferedStreanTest2 {
    public static void main(String[] args) throws IOException {
        String content[]={"你不喜欢你,","我一点都不介意","因为我活下来,",
        "不是为了取悦你."};
        File file=new File("word1.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fos=null;
        BufferedOutputStream bos=null;
        FileInputStream fis=null;
        BufferedInputStream bis=null;
        try{
             fos=new FileOutputStream(file);
             bos=new BufferedOutputStream(fos);
            byte[] bContent=new byte[1024];
            for(int k=0;k<content.length;k++){
                bContent=content[k].getBytes();
                bos.write(bContent);
            }
            System.out.println("写入成功!\n");
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try {
                bos.close();
                fos.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        try{
            fis=new FileInputStream(file);
            bis=new BufferedInputStream(fis);
            byte[] bContent=new byte[1024];
            int len=bis.read(bContent);
            System.out.println("文件中的信息是:"+new String(bContent,0,len));
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                fis.close();
                bis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
