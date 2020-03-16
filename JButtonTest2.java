import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonTest2 extends JFrame {
    public JButtonTest2(){
        Container container =getContentPane();
        Icon icon=new ImageIcon("scr/imageButtoo.jpg");
        setLayout(new GridLayout(3,2,5,5));
        JButton jb[]=new JButton[6];
        for(int i=0;i<6;i++){
            jb[i]=new JButton();
            container.add(jb[i]);
        }
        jb[0].setText("不可用");
        jb[0].setEnabled(false);
        jb[1].setText("有背景色");
        jb[1].setBackground(Color.YELLOW);
        jb[2].setText("无边框");
        jb[2].setBorderPainted(false);
        jb[3].setText("有边框");
        jb[3].setBorder(BorderFactory.createLineBorder(Color.red));
        jb[4].setIcon(icon);
        jb[4].setToolTipText("图片按钮");
        jb[5].setText("可点击");
        jb[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JButtonTest2.this,"点击按钮");

            }
        });
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("闯将不同样式的按钮");
        setBounds(100,100,400,200);
    }

    public static void main(String[] args) {
        new JButtonTest2();
    }
}
