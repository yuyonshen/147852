import javax.swing.*;
import java.awt.*;

public class FlowLayoutPosition2 extends JFrame {
    public FlowLayoutPosition2(){
        setTitle("本窗体使用流布局管理器");
        Container container = getContentPane();
        setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
        for(int i=0;i<10;i++){
            container.add(new JButton("button"+i));
        }
        setSize(500,500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutPosition2();
    }
}
