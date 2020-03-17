import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChectBoxTest2 extends JFrame {
    public ChectBoxTest2(){
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        setBounds(100,100,170,110);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        JCheckBox jc1=new JCheckBox("1");
        JCheckBox jc2=new JCheckBox("2");
        JCheckBox jc3=new JCheckBox("3");
        container.add(jc1);
        container.add(jc2);
        container.add(jc3);
        JButton jb=new JButton("打印");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(jc1.getText()+"按钮选中状态:"+jc1.isSelected());
                System.out.println(jc2.getText()+"按钮选中状态:"+jc2.isSelected());
                System.out.println(jc3.getText()+"按钮选中状态:"+jc3.isSelected());
            }
        });
        container.add(jb);

    }

    public static void main(String[] args) {
        new ChectBoxTest2();
    }
}
