import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutPosition3 extends JFrame {
    public BorderLayoutPosition3(){
        setTitle("这个窗体使用边界布局管理器");
        Container container = getContentPane();
        setLayout(new BorderLayout());
        JButton jb1=new JButton("中");
        jb1.setBackground(Color.white);
        JButton jb2=new JButton("北");
        jb2.setBackground(Color.BLACK);
        JButton jb3=new JButton("南");
        jb3.setBackground(Color.BLACK);
        JButton jb4=new JButton("西");
        jb4.setBackground(Color.BLACK);
        JButton jb5=new JButton("东");
        jb5.setBackground(Color.BLACK);
        container.add(jb1,BorderLayout.CENTER);
        container.add(jb2,BorderLayout.NORTH);
        container.add(jb3,BorderLayout.SOUTH);
        container.add(jb4,BorderLayout.WEST);
        container.add(jb5,BorderLayout.EAST);
        setSize(350,200);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BorderLayoutPosition3();
    }
}
