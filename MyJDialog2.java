import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJDialog2 extends JDialog {
    public MyJDialog2(MyFrame2 frame){
        super(frame,"第一个JDialog窗体",true);
        Container container=getContentPane();
        container.add(new JLabel("《java编程字典》珍藏版软件是有明日科技公司组织近百人java资深技术专家历经多年的累计为广大的编程设计人员开发的高效的编程学习软件"
                ));
        setBounds(120,120,100,100);
    }
}
    class MyFrame2 extends JFrame{
    public MyFrame2(){
        Container container=getContentPane();
        container.setLayout(null);
        JButton bl=new JButton("《Java编程字典》");
        bl.setBounds(10,10,100,21);
        bl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyJDialog2 dialog=new MyJDialog2(MyFrame2.this);
                dialog.setVisible(true);
            }
        });
        container.add(bl);
        container.setBackground(Color.WHITE);
        setSize(200,200);

    }

        public static void main(String[] args) {
            new MyFrame2();
        }
}