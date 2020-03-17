import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ConcurrentNavigableMap;

public class JComboBoxTest2 extends JFrame {
        public JComboBoxTest2(){
            setTitle("下拉列表框的使用");
            setVisible(true);
            setSize(500,500);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setLayout(null);
            Container container =getContentPane();
            JLabel jl2=new JLabel("请选择证件:");
            jl2.setBounds(28,14,80,15);
            container.add(jl2);

            JComboBox<String> comboBox=new JComboBox<String>();
            comboBox.addItem("身份证");
            comboBox.addItem("军人证");
            comboBox.addItem("学生证");
            comboBox.addItem("工作证");
            comboBox.setBounds(110,11,80,21);
            container.add(comboBox);
            JLabel lb=new JLabel("");
            lb.setBounds(77,57,146,15);
            container.add(lb);
            JButton jb=new JButton("确定");
            jb.setBounds(200,10,67,23);
            container.add(jb);
            jb.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    lb.setText("你的选择是:"+comboBox.getSelectedItem());
                }
            });
        }

    public static void main(String[] args) {
        new JComboBoxTest2();
    }
}
