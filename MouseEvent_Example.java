import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEvent_Example extends JFrame {
    private void mouseOper(MouseEvent e){
        int i=e.getButton();
        if(i==MouseEvent.BUTTON1){
            System.out.println("按下的是鼠标左键");
        }else if(i==MouseEvent.BUTTON2){
            System.out.println("按下的是鼠标滑轮");
        }else if(i==MouseEvent.BUTTON3){
            System.out.println("按下的是鼠标右键");
        }
    }
    public MouseEvent_Example(){
        super();
        setTitle("鼠标");
        setBounds(100,100,500,375);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        final JLabel label=new JLabel();
        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("光标移入组件");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.print("鼠标按键被按下，");
                mouseOper(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.print("鼠标按键被释放，");
                mouseOper(e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.print("单击鼠标按键，");
                mouseOper(e);
                int clickCount=e.getClickCount();
                System.out.println("单击次数为"+clickCount+"下");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("光标移出组件");
            }
        });
        getContentPane().add(label, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new MouseEvent_Example();
    }
}
