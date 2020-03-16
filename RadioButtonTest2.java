import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonTest2 extends JFrame {
    public RadioButtonTest2(){
        Container  container = getContentPane();
        setTitle("单选按钮使用");
        setBounds(100,100,220,120);
        setVisible(true);
        getContentPane().setLayout(null);

        JLabel jl=new JLabel("选择发送方式");
        jl.setBounds(5,5,120,15);
        container.add(jl);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JRadioButton rb1=new JRadioButton("普通发送");
        rb1.setSelected(true);
        rb1.setFont(new Font("宋体",Font.PLAIN,12));
        rb1.setBounds(20,30,75,22);
        rb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(rb1.isSelected())
                JOptionPane.showMessageDialog(null,"你的选择"
                +rb1.getText(),"提醒",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        container.add(rb1);
        JRadioButton rb2=new JRadioButton("加密发送");
        rb2.setFont(new Font("宋体",Font.PLAIN,12));
        rb2.setBounds(100,30,75,22);
        rb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rb2.isSelected())
                    JOptionPane.showMessageDialog(null,"你的选择"
                    +rb2.getText(),"提醒",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        container .add(rb2);
        ButtonGroup  bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

    }

    public static void main(String[] args) {
        new RadioButtonTest2();
    }

}
