import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBoxTest extends JFrame {
    public JComboBoxTest(){
        setTitle("下拉列表框使用");
        setVisible(true);
        setBounds(100,100,317,147);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        //创建标签，确定大小坐标，及其标签内容
        JLabel a1=new JLabel("请选择证件：");
        a1.setBounds(28,14,80,15);
        getContentPane().add(a1);

        //创建一个下拉列表框
        JComboBox<String> combobox=new JComboBox<String>();
        //设置坐标大小
        combobox.setBounds(110,11,80,21);
        //为下拉列表框怎加选项
        combobox.addItem("身份证");
        combobox.addItem("军人证");
        combobox.addItem("学生证");
        combobox.addItem("工作证");
        //将下拉列表框组件增加到容器中
        getContentPane().add(combobox);
        //创建一个标签
        JLabel lblResult=new JLabel("");
        //设置标签的位置大小
        lblResult.setBounds(77,57,146,15);
        //将标签增加到容器中
        getContentPane().add(lblResult);
        //创建按钮
        JButton btnNewButton=new JButton("确定");
        //设置按钮位置大小
        btnNewButton.setBounds(200,10,67,23);
        //按钮放置在容器中
        getContentPane().add(btnNewButton);
        //为按钮增加监听事件
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取下拉列表中的选项
                lblResult.setText("你的选择："+combobox.getSelectedItem());
            }
        });
    }

    public static void main(String[] args) {
        new JComboBoxTest();
    }
}
