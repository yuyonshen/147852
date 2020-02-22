import javax.swing.*;
import java.awt.*;

public class BorderLayoutPosition extends JFrame {
    public BorderLayoutPosition(){
        setTitle("《射雕英雄传》");
        Container c=getContentPane();
        setLayout(new BorderLayout());
        JButton a=new JButton("西毒");
        JButton b=new JButton("东邪");
        JButton f=new JButton("南帝");
        JButton d=new JButton("北丐");
        JButton e=new JButton("中神通");
        c.add(a,BorderLayout.NORTH );
        c.add(b,BorderLayout.SOUTH);
        c.add(f,BorderLayout.EAST);
        c.add(d,BorderLayout.WEST);
        c.add(e,BorderLayout.CENTER);
        setSize(350,200);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BorderLayoutPosition();
    }

}
