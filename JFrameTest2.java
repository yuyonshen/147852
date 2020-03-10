import javax.swing.*;
import java.awt.*;

public class JFrameTest2 extends JFrame {
   public void CreateJFrrame(String title){
       JFrame jf=new JFrame(title);
       Container container=jf.getContentPane();
       JLabel jl=new JLabel("这是一个窗体");
       jl.setHorizontalAlignment(SwingConstants.CENTER);
       container.add(jl);
       container.setBackground(Color.yellow);
       jf.setVisible(true);
       jf.setSize(1000,500);
       jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

   }

    public static void main(String[] args) {
        new JFrameTest2().CreateJFrrame("创建一个窗体");
    }
}
