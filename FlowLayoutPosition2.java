import javax.swing.*;
import java.awt.*;

public class FlowLayoutPosition2 extends JFrame {
    public FlowLayoutPosition2() {
        Container c = getContentPane();
        FlowLayout f = new FlowLayout(FlowLayout.CENTER, 10, 10);
        setLayout(f);
        c.add(new JButton("红灯"));
        c.add(new JButton("黄灯"));
        c.add(new JButton("绿灯"));
        setSize(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutPosition2();
    }

}
