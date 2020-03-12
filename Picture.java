import javax.swing.*;
import java.awt.*;

public class Picture extends JFrame {
    private JPanel contentPane;
    public Picture(){
        setTitle("查看图片");
        setVisible(true);
        setBounds(100,100,300,220);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container =getContentPane();
//        contentPane=new JPanel();
//        contentPane.setLayout(new BorderLayout(0,0));
//        container.add(contentPane);

        JScrollPane js=new JScrollPane();
//        contentPane.add(js,BorderLayout.CENTER);

        JLabel jl=new JLabel("");
        jl.setIcon(new ImageIcon(Picture.class.getResource("Snow.jpg")));
        js.setViewportView(jl);
        container.add(js);

    }

    public static void main(String[] args) {
        new Picture();
    }
}
