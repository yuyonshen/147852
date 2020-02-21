import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJDialog extends JDialog {//创建一个自定义对话框。
    public MyJDialog(MyFrame frame){
        //实例化一个JDialog类对象，指定对话框的父窗体，窗体标题和类型。
        super(frame,"第一个JDialog窗体",true);
        Container container=getContentPane();//创建一个容器
        container.add(new JLabel("这是一个对话框"));
        setBounds(120,120,120,120);
    }
}
 class MyFrame extends JFrame{//创建一个父窗体类
    public MyFrame(){
        Container container=getContentPane();
        container.setLayout(null);//容器使用null布局
        //定义一个按钮
        JButton bl=new JButton("弹出对话框");
        //定义按钮在容器中的坐标和大小
        bl.setBounds(10,10,100,21);
        //为按钮怎加事件
        bl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //创建MyJDialog对话框
                MyJDialog dialog = new MyJDialog(MyFrame.this);
                dialog.setVisible(true);
            }
        });
           container.add(bl);
           container.setBackground(Color.WHITE);
           setSize(200,200);
           setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
           setVisible(true);
    }

     public static void main(String[] args) {
         new MyFrame();
     }
}
