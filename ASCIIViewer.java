
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class ASCIIViewer extends JFrame {

    //面板
    private JPanel contentPane;
    //文本框组件
    private JTextField asciiTextField;

    private JTextField numberTextField;
    //标签组件
    private JLabel label3;
    private JLabel label6;

    public static void main(String[] args) {
        ASCIIViewer frame = new ASCIIViewer();
        frame.setVisible(true);
    }

    public ASCIIViewer() {
        //提示信息
        setTitle("十进制的ASCII编码查看器");
        //关闭方式
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗体大小
        setBounds(100, 100, 450, 150);
        //创建以恶搞JPanel面板对象。
        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout(0, 0));

        setContentPane(contentPane);
        //实例化一个JPanel对象
        JPanel panel = new JPanel();
        //
        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(2, 1, 5, 5));

        JPanel asciiPanel = new JPanel();
        asciiPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        panel.add(asciiPanel);
        asciiPanel.setLayout(new GridLayout(1, 5, 5, 5));

        JLabel label1 = new JLabel("�����ַ���");
        label1.setFont(new Font("字符", Font.PLAIN, 16));
        asciiPanel.add(label1);

        asciiTextField = new JTextField();
        asciiTextField.setFont(new Font("΢���ź�", Font.PLAIN, 16));
        asciiPanel.add(asciiTextField);
        asciiTextField.setColumns(3);

        JLabel label2 = new JLabel("ת�������");
        label2.setFont(new Font("΢���ź�", Font.PLAIN, 16));
        asciiPanel.add(label2);

        label3 = new JLabel("");
        label3.setFont(new Font("΢���ź�", Font.PLAIN, 16));
        asciiPanel.add(label3);

        JButton toNumberButton = new JButton("转换");
        toNumberButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                do_toNumberButton_actionPerformed(e);
            }
        });
        toNumberButton.setFont(new Font("΢���ź�", Font.PLAIN, 16));
        asciiPanel.add(toNumberButton);

        JPanel numberPanel = new JPanel();
        numberPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        panel.add(numberPanel);
        numberPanel.setLayout(new GridLayout(1, 5, 5, 5));

        JLabel label4 = new JLabel("�������֣�");
        label4.setFont(new Font("΢���ź�", Font.PLAIN, 16));
        numberPanel.add(label4);

        numberTextField = new JTextField();
        numberTextField.setFont(new Font("΢���ź�", Font.PLAIN, 16));
        numberPanel.add(numberTextField);
        numberTextField.setColumns(3);

        JLabel label5 = new JLabel("ת�������");
        label5.setFont(new Font("΢���ź�", Font.PLAIN, 16));
        numberPanel.add(label5);

        label6 = new JLabel("");
        label6.setFont(new Font("΢���ź�", Font.PLAIN, 16));
        numberPanel.add(label6);

        JButton toASCIIButton = new JButton("转换");
        toASCIIButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                do_toASCIIButton_actionPerformed(e);
            }
        });
        toASCIIButton.setFont(new Font("΢���ź�", Font.PLAIN, 16));
        numberPanel.add(toASCIIButton);
    }

    protected void do_toNumberButton_actionPerformed(ActionEvent e) {
        String ascii = asciiTextField.getText();
        if (ascii.length() == 1 ) {
            int i = Character.codePointAt(ascii, 0);
            label3.setText("" + i);
        } else {
            JOptionPane.showMessageDialog(null, "�ı����е��ַ��������ó���1����", "����", JOptionPane.WARNING_MESSAGE);
        }
    }

    protected void do_toASCIIButton_actionPerformed(ActionEvent e) {
        try {
            String number = numberTextField.getText();
            if (Integer.parseInt(number) <= 126) {
                char[] a = Character.toChars(Integer.parseInt(number));
                label6.setText(new String(a));
            } else {
                JOptionPane.showMessageDialog(null, "ʮ���Ʊ�����Ч��ΧΪ0~126��", "����", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e2) {
            JOptionPane.showMessageDialog(null, "�����ı���������0~126��Χ�ڵ�������", "����", JOptionPane.WARNING_MESSAGE);
        }
    }
}

