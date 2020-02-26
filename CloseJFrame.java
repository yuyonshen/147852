import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.nio.channels.ClosedSelectorException;

public class CloseJFrame extends JFrame {
    private JPanel contantPane;

    public CloseJFrame(){
        setTitle("关闭窗体时");
        addWindowListener( (WindowListener) new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                String[] options = { "确定", "取消" };

                int flag = JOptionPane.showOptionDialog(null, "关闭窗口吗", "关闭窗口吗", JOptionPane.YES_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                if (flag == 0) {
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    dispose();//�ͷ���Դ
                } else
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }
        });
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,450,300);
        contantPane=new JPanel();
        contantPane.setLayout(new BorderLayout(0,0));
        setContentPane(contantPane);

        JLabel lblImage = new JLabel();
        lblImage.setIcon(new ImageIcon(CloseJFrame.class.getResource("1.jpg")));
        contantPane.add(lblImage, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        CloseJFrame frame = new CloseJFrame();
        frame.setVisible(true);
    }
}
