import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MyImageIcon2 extends JFrame {
    public MyImageIcon2(){
        Container container =getContentPane();
        JLabel ji=new JLabel("这是一个JFrame窗体",JLabel.CENTER);
        URL url=MyImageIcon2.class.getResource("pic.png");
        Icon icon=new ImageIcon(url);
        ji.setIcon(icon);
        ji.setHorizontalAlignment(SwingConstants.CENTER);
        ji.setOpaque(true);
        container.add(ji);
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyImageIcon2();
    }
}
