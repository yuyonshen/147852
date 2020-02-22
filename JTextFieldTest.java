import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldTest extends JFrame {
    public JTextFieldTest(){
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        //设置文本框的初始值
        JTextField jt=new JTextField("aaa");
        //文本框的长度
        jt.setColumns(20);
        //设置字体
        jt.setFont(new Font("宋体",Font.PLAIN,20));
        JButton jb=new JButton("清除");
        jt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("触发事件");
            }
        });
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println(jt.getText());//输出当前文本框的值
                //将文本置空
                jt.setText("");
                //焦点回到文本框
                jt.requestFocus();
            }
        });
        c.add(jt);
        c.add(jb);
        setBounds(100,100,250,110);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE );

    }

    public static void main(String[] args) {
        new JTextFieldTest();
    }
}
