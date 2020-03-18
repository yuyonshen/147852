package java1_18_1;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoveCarTest2 extends JFrame {
    private JPanel contentPane;
    private JLabel lblCarImage;

    public MoveCarTest2(){
        setResizable(false);
        setTitle("图标动起来");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,100,590,300);
        Container container=getContentPane();

        contentPane=new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        container.add(contentPane);
        contentPane.setLayout(null);

        JButton jb1=new JButton("前进");
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblCarImage.setHorizontalAlignment(SwingConstants.TRAILING);
            }
        });
        jb1.setFont(new Font("宋体",Font.PLAIN,14));
        jb1.setBounds(10,229,108,23);
        contentPane.add(jb1);

        JButton jb2=new JButton("后退");
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblCarImage.setHorizontalAlignment(SwingConstants.LEADING);
            }
        });
        jb2.setFont(new Font("宋体",Font.PLAIN,14));
        jb2.setBounds(165,229,108,23);
        contentPane.add(jb2);

        JButton jb3=new JButton("上移");
        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblCarImage.setVerticalAlignment(SwingConstants.TOP);
            }
        });
        jb3.setFont(new Font("宋体",Font.PLAIN,14));
        jb3.setBounds(318,229,108,23);
        contentPane.add(jb3);

        JButton jb4=new JButton("下移");
        jb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblCarImage.setVerticalAlignment(SwingConstants.BOTTOM);
            }
        });
        jb4.setFont(new Font("宋体",Font.PLAIN,14));
        jb4.setBounds(466,229,108,23);
        contentPane.add(jb4);

        lblCarImage=new JLabel("");
        lblCarImage.setHorizontalAlignment(SwingConstants.LEFT);
        lblCarImage.setIcon(new ImageIcon(MoveCarTest2.class.getResource("car.png")));
        lblCarImage.setBounds(10, 10, 564, 209);
        contentPane.add(lblCarImage);
    }

    public static void main(String[] args) {
        new MoveCarTest2();
    }
}
