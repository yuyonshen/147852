package java1_18_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleEventTest2 extends JFrame {
    private JButton jb=new JButton("我是一个按钮");
    public SimpleEventTest2(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("这是一个动作监听器");
        setSize(200,100);
        Container container =getContentPane();
        container.add(jb);
        jb.setBounds(10,10,100,30);
        jb.addActionListener(new jbAction());
        setVisible(true);
    }
    class jbAction implements ActionListener{
        public void actionPerformed(ActionEvent arg0){
            jb.setText("我被单击了");
        }
    }

    public static void main(String[] args) {
        new SimpleEventTest2();
    }
}
