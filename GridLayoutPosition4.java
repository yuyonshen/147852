import javax.swing.*;
import java.awt.*;

public class GridLayoutPosition4 extends JFrame {
    public GridLayoutPosition4(){
        Container container =getContentPane();
        setLayout(new GridLayout(7,3,5,5));
        for(int i=0;i<20;i++){
            container .add(new JButton("button"+i));
        }
        setSize(300,300);
        setTitle("这是一个网格布局管理器窗口");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GridLayoutPosition4();
    }
}
