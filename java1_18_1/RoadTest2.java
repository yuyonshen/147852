package java1_18_1;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RoadTest2 extends JFrame {
    private JPanel contentPane;
    private JLabel lblMap;
    private JLabel btnDirection;
    private JButton btnGo;

    public RoadTest2(){
        setTitle("查看十字路口的情况");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setBounds(300,150,499,409);
        //setResizable(false);
        Container container =getContentPane();

        contentPane =new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(null);
        container.add(contentPane);

        lblMap = new JLabel("");
        lblMap.setHorizontalAlignment(SwingConstants.CENTER);
        lblMap.setIcon(new ImageIcon(RoadTest2.class.getResource("5.png")));
        lblMap.setBounds(0, 0, 493, 280);
        contentPane.add(lblMap);

        String strDirect = "地图";
        btnGo = new JButton("按钮");
        btnGo.addMouseListener(new MouseAdapter() { // ��ť�������¼��ļ���
            @Override
            public void mouseClicked(MouseEvent e) {
                btnGo.setText("北十字口");
                lblMap.setIcon(new ImageIcon(RoadTest2.class.getResource("1.png")));
                btnDirection.setHorizontalAlignment(SwingConstants.CENTER);
                btnDirection.setText("十字口" + strDirect);
            }
        });
        btnGo.addKeyListener(new KeyAdapter() { // ��ť�����¼��ļ���
            @Override
            public void keyPressed(KeyEvent e) {
                String strDirect = "地图";
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        lblMap.setIcon(new ImageIcon(RoadTest2.class.getResource("1.png")));
                        btnDirection.setHorizontalAlignment(SwingConstants.CENTER);
                        strDirect = "南";
                        break;
                    case KeyEvent.VK_DOWN:
                        lblMap.setIcon(new ImageIcon(RoadTest2.class.getResource("2.png")));
                        btnDirection.setHorizontalAlignment(SwingConstants.CENTER);
                        strDirect = "·西";
                        break;
                    case KeyEvent.VK_LEFT:
                        lblMap.setIcon(new ImageIcon(RoadTest2.class.getResource("3.png")));
                        btnDirection.setHorizontalAlignment(SwingConstants.CENTER);
                        strDirect = "东";
                        break;
                    case KeyEvent.VK_RIGHT:
                        lblMap.setIcon(new ImageIcon(RoadTest2.class.getResource("4.png")));
                        btnDirection.setHorizontalAlignment(SwingConstants.CENTER);
                        strDirect = "北";
                        break;
                }
                btnDirection.setText("查看" + strDirect);
            }
        });
        btnGo.setFont(new Font("宋体", Font.PLAIN, 14));
        btnGo.setBounds(180, 290, 150, 35);
        contentPane.add(btnGo);

        btnDirection = new JLabel("");
        btnDirection.setFont(new Font("宋体", Font.PLAIN, 14));
        btnDirection.setBounds(150, 335, 209, 35);
        contentPane.add(btnDirection);

    }

    public static void main(String[] args) {
        new RoadTest2();
    }
}