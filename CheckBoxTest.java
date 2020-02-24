import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxTest extends JFrame {
    public CheckBoxTest(){
        //获取窗口容器
        Container c=getContentPane();
        //容器使用流布局管理器
        c.setLayout(new FlowLayout());
        //设置窗口大小，坐标位置
        setBounds(100,100,170,110);
        //设置窗口关闭方式
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置窗口可见
        setVisible(true);
        //创建复选框
        JCheckBox c1=new JCheckBox("1");
        JCheckBox c2=new JCheckBox("2");
        JCheckBox c3=new JCheckBox("3");
        //容器增加复选框
        c.add(c1);
        c.add(c2);
        c.add(c3);
        //创建按钮
        JButton btn=new JButton("打印");
        //打印按钮事件
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //在控制台输出复选框的选中状态
                System.out.println(c1.getText()+"按钮选中状态："+c1.isSelected());
                System.out.println(c2.getText()+"按钮选中状态："+c2.isSelected());
                System.out.println(c3.getText()+"按钮选中状态："+c3.isSelected());
            }
        });
        //容器添加打印按钮
        c.add(btn);

    }

    public static void main(String[] args) {
        new CheckBoxTest();
    }
}
