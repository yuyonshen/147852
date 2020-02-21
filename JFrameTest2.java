import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import javax.swing.*;
import java.awt.*;

public class JFrameTest2 extends JFrame {
   public void CreateJFrane(String title){
        //先创建窗体对象
       JFrame jf=new JFrame(title);
       //获取一个容器
       Container container=jf.getContentPane();
       //创建一个标签
       JLabel jl=new JLabel("这是一个JFrame窗体");
       container.add(jl);
       container.setBackground(Color.black);
       jf.setVisible(true);
       jf.setBounds(123,234,200,150);
       jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JFrameTest2().CreateJFrane("创建一个JF窗体");
    }
}
