import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonTest extends JFrame {
    public RadioButtonTest(){

        JRadioButton rbtnNormal=new JRadioButton("普通发送");
        rbtnNormal.setSelected(true);
        rbtnNormal.setFont(new Font("宋体",Font.PLAIN,12));
        rbtnNormal.setBounds(20,30,75,22);
        rbtnNormal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if(rbtnNormal.isSelected());
                JOptionPane.showMessageDialog(null,"你的选择是："+
                        rbtnNormal.getText(),"提醒",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        getContentPane().add(rbtnNormal);
        JRadioButton rbtnPwd=new JRadioButton("加密发送");
        rbtnPwd.setFont(new Font("宋体",Font.PLAIN,12));
        rbtnPwd.setBounds(100,30,75,22);
        rbtnPwd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rbtnPwd.isSelected())
                    JOptionPane.showMessageDialog(null,"你的选择是："+
                            rbtnPwd.getText(),"提醒",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        getContentPane().add(rbtnPwd);
        ButtonGroup group=new ButtonGroup();
        group.add(rbtnNormal);
        group.add(rbtnPwd);
        Container c=getContentPane();

        getContentPane().setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("单选按钮的使用");
        setBounds(100,100,220,120);
        JLabel jl=new JLabel("请选择发送方式");
        c.add(jl);

    }

    public static void main(String[] args) {
        RadioButtonTest frame=new RadioButtonTest();
        frame.setVisible(true);
    }
}
