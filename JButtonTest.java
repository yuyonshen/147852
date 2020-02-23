import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonTest extends JFrame {
    public JButtonTest(){
        //获取图片文件
        Icon icon=new ImageIcon("scr/imageButton.jpg");
        //设置网格布局管理器
        setLayout(new GridLayout(3,2,5,5));
        //创建容器
        Container c=getContentPane();
        //创建按钮数组
        JButton btn[]=new JButton[6];
        for(int i=0;i<btn.length;i++){
            //实例化数组对象
            btn[i]=new JButton();
            //将按钮增加到容器中
            c.add(btn[i]);
        }
        //设置按钮
        btn[0].setText("不可用");
        btn[0].setEnabled(false);
        btn[1].setText("有背景颜色");
        btn[1].setBackground(Color.YELLOW);
        btn[2].setText("无边框");
        btn[2].setBorderPainted(false);
        btn[3].setText("有边框");
        //增加红线边框
        btn[3].setBorder(BorderFactory.createLineBorder(Color.RED));
       //为按钮设置图标
        btn[4].setText("icon");
        //设置鼠标悬停时，提示的信息
        btn[4].setToolTipText("图片按钮");
        btn[5].setText("可点击");
        //为按钮增加监听事件
        btn[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //弹出对话框
                JOptionPane.showMessageDialog(JButtonTest.this,"点击按钮");
            }
        });
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("创建不一样的按钮");
        setBounds(100,100,400,200);

   }

    public static void main(String[] args) {
        new JButtonTest();
    }
}
