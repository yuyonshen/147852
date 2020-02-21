import javax.swing.*;
import java.awt.*;

public class BorderLayoutPosition3 extends JFrame {
    public BorderLayoutPosition3(){
        setTitle("这个窗口使用边界管理器");
        Container c=getContentPane();
        setLayout(new BorderLayout());
        JButton a=new JButton("中");
        JButton b=new JButton("北");
        JButton f=new JButton("南");
        JButton d=new JButton("西");
        JButton e=new JButton("东");
        c.add(a,BorderLayout.CENTER);
        c.add(b,BorderLayout.NORTH);
        c.add(f,BorderLayout.SOUTH);
        c.add(d,BorderLayout.WEST);
        c.add(e,BorderLayout.EAST);
        setSize(350,200);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BorderLayoutPosition3();
    }
}
