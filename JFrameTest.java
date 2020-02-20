import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Callable;

public class JFrameTest extends JFrame {
    public void CreateJFrame(String title){
        JFrame jf=new JFrame(title);
        Container container=jf.getContentPane();
       //创建一个JFrame标签
        JLabel j1=new JLabel("这是一个JFrame窗体");
        //是标签上的文字居中
        j1.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(j1);
        //设置容器背景颜色
        container.setBackground(Color.white);
        jf.setVisible(true);
        jf.setSize(200,150);
       //设置窗体关闭方式
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JFrameTest().CreateJFrame("创建一个JFrame窗体");
    }

}
