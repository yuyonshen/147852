import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;

import javax.swing.*;
import java.awt.*;

public class JPanelTest5 extends JFrame {
    public JPanelTest5(){
        Container container =getContentPane();
        container.setLayout(new GridLayout(2,1,10,10));
        JPanel p1=new JPanel(new GridLayout(1,3,10,10));
        JPanel p2=new JPanel(new BorderLayout());
        JPanel p3=new JPanel(new GridLayout(1,2,10,10));
        JPanel p4=new JPanel(new GridLayout(2,1,10,10));

        p1.setBorder(BorderFactory.createTitledBorder("面板1"));
        p2.setBorder(BorderFactory.createTitledBorder("面板2"));
        p3.setBorder(BorderFactory.createTitledBorder("面板3"));
        p3.setBorder(BorderFactory.createTitledBorder("面板4"));

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

        container.add(p1);
        container.add(p2);
        container.add(p3);
        container.add(p4);
        setVisible(true);
        setTitle("这个窗体使用了面板");
        setSize(500,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JPanelTest5();
    }
}
