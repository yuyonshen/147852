import javax.swing.*;
import java.awt.*;

public class FlowLayoutPosition extends JFrame {
    public FlowLayoutPosition(){
        setTitle("本窗体使用流布局管理器");
        Container c=getContentPane();
        setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
        for(int i=0;i<10;i++){
            c.add(new JButton("button"+i));
        }
        setSize(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutPosition();
    }
}
