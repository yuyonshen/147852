import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TraficLights extends JFrame {
    //成员面板组件
    private JPanel contentPane;
    //成员标签组件
    private JLabel lblImage;
    public TraficLights(){
    //设置窗口大小不可变
        setResizable(false);
        setTitle("模拟红绿灯");
        //窗口关闭方式
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置窗体大小坐标位置
        setBounds(100,100,220,300);
        //实例化面板类对象
        JPanel contentPane=new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(1,0,0,0));

        JPanel panel=new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBorder(new TitledBorder(null, "交通信号灯", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        contentPane.add(panel);
        panel.setLayout(new BorderLayout(0, 0));

        lblImage = new JLabel("");
        lblImage.setBackground(Color.WHITE);
        lblImage.setIcon(new ImageIcon(TraficLights.class.getResource("green.png")));
        panel.add(lblImage, BorderLayout.CENTER);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new TitledBorder(null, "按钮", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JRadioButton rbtnRed = new JRadioButton("红灯");
        rbtnRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblImage.setIcon(new ImageIcon(TraficLights.class.getResource("red.png")));
            }
        });
        rbtnRed.setBounds(20, 51, 60, 20);
        panel_1.add(rbtnRed);

        JRadioButton rbtnYellow = new JRadioButton("黄灯");
        rbtnYellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblImage.setIcon(new ImageIcon(TraficLights.class.getResource("yellow.png")));
            }
        });
        rbtnYellow.setBounds(20, 117, 60, 20);
        panel_1.add(rbtnYellow);

        JRadioButton rbtnGreen = new JRadioButton("绿灯");
        rbtnGreen.setSelected(true); //
        rbtnGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblImage.setIcon(new ImageIcon(TraficLights.class.getResource("green.png")));
            }
        });
        rbtnGreen.setBounds(20, 182, 60, 20);
        panel_1.add(rbtnGreen);

        ButtonGroup group = new ButtonGroup();
        group.add(rbtnRed);
        group.add(rbtnYellow);
        group.add(rbtnGreen);
    }
    public static void main(String[] args) {
        TraficLights frame = new TraficLights();
        frame.setVisible(true);
    }
}
