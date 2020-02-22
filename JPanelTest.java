import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;

import javax.swing.*;
import java.awt.*;

public class JPanelTest extends JFrame {
    public JPanelTest(){
        Container c=getContentPane();
        c.setLayout(new GridLayout(2,1,10,10));
        JPanel p1=new JPanel(new GridLayout(1,3,10,10));
        JPanel p2=new JPanel(new BorderLayout());
        JPanel p3=new JPanel(new GridLayout(1,2,10,10));
        JPanel p4=new JPanel(new GridLayout(2,1,10,10));
        p1.setBorder(BorderFactory.createTitledBorder("面板1"));
        p2.setBorder(BorderFactory.createTitledBorder("面板2"));
        p3.setBorder(BorderFactory.createTitledBorder("面板3"));
        p4.setBorder(BorderFactory.createTitledBorder("面板4"));
        p1.add(new JButton("b1"));
        p1.add(new JButton("b1"));
        p1.add(new JButton("b1"));
        p1.add(new JButton("b1"));
        p2.add(new JButton("b2"),BorderLayout.WEST);
        p2.add(new JButton("b2"),BorderLayout.EAST);
        p2.add(new JButton("b2"),BorderLayout.NORTH);
        p2.add(new JButton("b2"),BorderLayout.SOUTH);
        p2.add(new JButton("b2"));
        p3.add(new JButton("b3"));
        p3.add(new JButton("b3"));
        p4.add(new JButton("b4"));
        p4.add(new JButton("b4"));
        c.add(p1);
        c.add(p2);
        c.add(p3);
        c.add(p4);
        setTitle("在这个窗体中使用面板");
        setSize(500,300);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JPanelTest();
    }
}
