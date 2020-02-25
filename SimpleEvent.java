import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleEvent extends JFrame {
    private JButton jb=new JButton("我是按钮，点击我");
    public SimpleEvent() {
        setLayout(null);
        setSize(200,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        Container cp = getContentPane();
        cp.add(jb);
        jb.setBounds(10, 10, 100, 30);
        jb.addActionListener(new jbAction());
    }
    class jbAction implements ActionListener{
        public void actionPerformed(ActionEvent age0){
            jb.setText("我被点击了");
        }
    }

    public static void main(String[] args) {
        new SimpleEvent();
    }
}
