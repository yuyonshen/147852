import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;

public class JTextAreaTest extends JFrame {
    public JTextAreaTest(){
        setSize(200,200);
        setTitle("定义一个自动换行的文本域");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Container cp=getContentPane();
        JTextArea jt=new JTextArea("文本域",6,6);
        jt.setLineWrap(true);
        cp.add(jt);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JTextAreaTest();
    }
}
