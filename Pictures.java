import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Pictures extends JFrame {
    private JPanel contentPane;

    public Pictures(){
        //设置整体窗体的大小关闭方式
        Container container = getContentPane();
        setTitle("背景图片");
        setBounds(100,100,500,336);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(true);
        //在容器中增加面板,设置面板的布局
        contentPane=new JPanel();
        container.add(contentPane);
        contentPane.setLayout(null);

        JLabel jl=new JLabel("");
        Random random=new Random();
        int num=random.nextInt(3);

        switch (num){
            case 0:
                jl.setIcon(new ImageIcon(Pictures.class.getResource("Birds.jpg")));
                break;
            case 1:
                jl.setIcon(new ImageIcon(Pictures.class.getResource("Snow.jpg")));
                break;
            case 2:
                jl.setIcon(new ImageIcon(Pictures.class.getResource("Birds.jpg")));
                break;
        }
        jl.setBounds(0,0,494,308);
        contentPane.add(jl);

    }

    public static void main(String[] args) {
        new Pictures();
    }
}
