import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MyImageIcon extends JFrame {
    public MyImageIcon(){
        Container c=getContentPane();
        //创建一个标签
        JLabel jl=new JLabel("这是一个JFrame窗体",JLabel.CENTER);
        //获取图片所在的URL
        URL url=MyImageIcon.class.getResource("pic.png");
        //创建Icon对象；
        Icon icon=new ImageIcon(url);
       //为标签设置图片
        jl.setIcon(icon);
        //设置文字放在标签中间
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        //设置标签为不透明状态
        jl.setOpaque(true);
        c.add(jl);
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyImageIcon();
    }
}
