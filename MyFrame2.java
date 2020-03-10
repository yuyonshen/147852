import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyJDialog2 extends JDialog{
    public MyJDialog2(MyFrame2 frame){
        super(frame,"《java编程字典》",true);
        Container container=getContentPane();
        container.add(new JLabel("《***************************》"));
        setBounds(120,120,500,500);
    }
}



public class MyFrame2 extends JFrame {
    public MyFrame2(){
        Container container=getContentPane();
        setTitle("信息提示对话框");
        container.setLayout(null);
        JButton jb=new JButton("《编程字典》");
        jb.setBounds(10,10,100,21);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyJDialog2 dialog=new MyJDialog2(MyFrame2.this);
                dialog.setVisible(true);
            }
        });
        container.add(jb);
        container.setBackground(Color.black);
        setSize(600,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new MyFrame2();
    }
}
