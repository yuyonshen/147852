import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFeildTest3 extends JFrame {
    public JTextFeildTest3(){
        Container container =getContentPane();
        container.setLayout(new FlowLayout());
        JTextField jt=new JTextField("aaa");
        jt.setColumns(20);//设置文本框长度
        jt.setFont(new Font("宋体",Font.PLAIN,20));
        JButton jb=new JButton("清除");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("触发事件");
            }
        });
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(jt.getText());
                jt.setText("");
                jt.requestFocus();
            }
        });
        container.add(jt);
        container.add(jb);
        setBounds(100,100,250,110);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTextFeildTest3();
    }
}
