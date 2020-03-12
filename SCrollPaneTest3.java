import javax.swing.*;
import java.awt.*;

public class SCrollPaneTest3 extends JFrame {
    public SCrollPaneTest3(){
        Container container= getContentPane();
        JTextArea ta=new JTextArea(20,50);
        JScrollPane sp=new JScrollPane(ta);
        container.add(sp);
        setTitle("带滚动条的文本编译器");
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SCrollPaneTest3();
    }
}
