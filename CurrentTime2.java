import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime2 extends JFrame {
    private JPanel contentPane;

    public CurrentTime2(){
        setResizable(false);
        setTitle("创建文件");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,100,160,120);

        contentPane=new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton jb=new JButton("按钮");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date=new Date();
                SimpleDateFormat deteFormat=new SimpleDateFormat("yyyMMHHmmssSSS");
                String getName=deteFormat.format(date);
                File file=new File(getName+".txt");
                try{
                    if(!file.exists()){
                        file.createNewFile();
                        JOptionPane.showMessageDialog(null, "文件创建", "文件", JOptionPane.INFORMATION_MESSAGE);
                    }
                }catch (IOException ex){
                    ex.printStackTrace();;
                }
            }
        });
        jb.setFont(new Font("宋体",Font.PLAIN,12));
        jb.setBounds(25,25,100,40);
        contentPane.add(jb);
    }

    public static void main(String[] args) {
        new CurrentTime2();
    }
}
