import java.io.*;

public class BufferedTest {
    public static void main(String[] args) {
        String content[]={"你喜欢我,","我一点都不介意。","因为我活下来,","不是为了取悦你。"};
        File file=new File("word.txt");
        try{
            FileWriter fw=new FileWriter(file);
            BufferedWriter bufw=new BufferedWriter(fw);
            for(int i=0;i<content.length;i++){
                bufw.write(content[i]);

            }
            bufw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            FileReader fr=new FileReader(file);
            BufferedReader bufr=new BufferedReader(fr);
            String s=null;
            int j=0;
            while((s=bufr.readLine())!=null){
                j++;
                System.out.println("第"+j+"行"+s);
            }
            bufr.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
