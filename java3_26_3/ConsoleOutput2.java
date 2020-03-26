package java3_26_3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ConsoleOutput2 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("src/ConsokeOutput2.java");
        char[] c=new char[1024];
        int hasread=0;
        while((hasread=reader.read(c))>0){
            System.out.println(new String(c,0,hasread));
        }
        reader.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
