import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ConcurrentNavigableMap;

public class JChectBoxTest2 extends JFrame {
    private JPanel contentPane;
    private JCheckBox jc1;
    private JCheckBox jc2;
    private JCheckBox jc3;
    private JCheckBox jc4;
    private JLabel label;

    public JChectBoxTest2(){
       Container container =getContentPane();
       setTitle("浏览图片");
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       setVisible(true);
       setBounds(100,100,250,150);
       contentPane=new JPanel();
       contentPane.setBorder(new EmptyBorder(5,5,5,5));
       container.add(contentPane);
       contentPane.setLayout(new GridLayout(1,2,5,5));

       JPanel jp1=new JPanel();
       jp1.setLayout(new GridLayout(0,1,0,0));
       contentPane.add(jp1);

       jc1=new JCheckBox("ͼƬ1");
       jc1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               do_jc1_actionPerformed(e);
           }
       });
       jp1.add(jc1);

       jc2=new JCheckBox("ͼƬ2");
       jc2.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               do_jc2_actionPerformed(e);
           }
       });
       jp1.add(jc2);

       jc3=new JCheckBox("ͼƬ3");
       jc3.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               do_jc3_actionPerformed(e);
           }
       });
       jp1.add(jc3);

       jc4=new JCheckBox("ͼƬ4");
       jc4.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               do_jc4_actionPerformed(e);
           }
       });
       jp1.add(jc4);
        JPanel  jp2=new JPanel();
       contentPane.add(jp2);
        jp2.setLayout(new BorderLayout(0,0));


      label=new JLabel("");
       jp2.add(label,BorderLayout.CENTER);


    }
    protected void do_jc1_actionPerformed(ActionEvent e){
        if (jc1.isSelected()) {
            ImageIcon icon = new ImageIcon("src/1.png");
            label.setIcon(icon);
        }
        jc2.setSelected(false);
        jc3.setSelected(false);
        jc4.setSelected(false);
    }

    protected void do_jc2_actionPerformed(ActionEvent e){
        if (jc1.isSelected()) {
            ImageIcon icon = new ImageIcon("src/2.png");
            label.setIcon(icon);
        }
        jc1.setSelected(false);
        jc3.setSelected(false);
        jc4.setSelected(false);
    }
    protected void do_jc3_actionPerformed(ActionEvent e){
        if (jc1.isSelected()) {
            ImageIcon icon = new ImageIcon("src/3.png");
            label.setIcon(icon);
        }
        jc2.setSelected(false);
        jc1.setSelected(false);
        jc4.setSelected(false);
    }
    protected void do_jc4_actionPerformed(ActionEvent e){
        if (jc1.isSelected()) {
            ImageIcon icon = new ImageIcon("src/4.png");
            label.setIcon(icon);
        }
        jc2.setSelected(false);
        jc3.setSelected(false);
        jc1.setSelected(false);
    }

    public static void main(String[] args) {
        new JChectBoxTest2();

    }
}
