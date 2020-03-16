import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;

public class JTextAreaTest3 extends JFrame {
    public JTextAreaTest3(){
        Container container = getContentPane();
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextArea jt=new JTextArea("文本域",6,6);
        jt.setLineWrap(true);
        container.add(jt);


    }

    public static void main(String[] args) {
        new JTextAreaTest3();
    }
}
