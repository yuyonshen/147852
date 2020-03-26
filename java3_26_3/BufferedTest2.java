package java3_26_3;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

public class BufferedTest2 {
    public static void main(String[] args) throws IOException {
        String content[]={"你不喜欢我,","我一点都不介意","因为我活下来,","不是为了取悦你"};
        File file=new File("yuzh,txt");
        if(!file.exists()){
            file.createNewFile();
            System.out.println("文件创建成功");
        }
       try {
           FileWriter fw = new FileWriter(file);
           BufferedWriter bufw = new BufferedWriter(fw);
           for (int i = 0; i < content.length; i++) {
               bufw.write(content[i]);
               bufw.newLine();
           }
           bufw.close();
           fw.close();
       }catch (IOException e){
           e.printStackTrace();
       }
       try{
           FileReader fr=new FileReader(file);
           BufferedReader bure=new BufferedReader(fr);
           String s=null;
           int i=0;
           while((s=bure.readLine())!=null){
               i++;
               System.out.println("第"+i+"行:"+s);
           }
           bure.close();
           fr.close();
       }catch(IOException e){
           e.printStackTrace();
       }
    }
}
