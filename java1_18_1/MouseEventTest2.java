package java1_18_1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MouseEventTest2 extends JFrame {
    private void mouseOper(MouseEvent e){
        int i=0;
        if(i==MouseEvent.BUTTON1) {
            System.out.println("按下的鼠标左键");
        }else if(i==MouseEvent.BUTTON2){
            System.out.println("按下的鼠标滑轮");
        }else if(i==MouseEvent.BUTTON3){
            System.out.println("按下的鼠标右键");
        }
    }
    public MouseEventTest2(){
        super();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setBounds(100,100,500,375);
        setTitle("这个窗体使用的是鼠标按钮");

        final JLabel label = new JLabel();
        label.addMouseListener(new MouseListener(){
            public void mouseEntered(MouseEvent e){
                System.out.println("光标移入组件");
            }
               public void mousePressed(MouseEvent e){
                   System.out.println("鼠标安检被按下,");
                   mouseOper(e);
               }
               public void mouseReleased(MouseEvent e){
                   System.out.println("鼠标按键被释放,");
                   mouseOper(e);
               }
               public void mouseClicked(MouseEvent e){
                   System.out.println("单击了鼠标按键,");
                   mouseOper(e);
                   int clickCount=e.getClickCount() ;
                   System.out.println("单击次数:"+clickCount+"下");
            }
            public void mouseExited(MouseEvent e) {
                System.out.println("光标移出组件");
            }

        });
        getContentPane().add(label, BorderLayout.CENTER);
    }

    public static void main(String[] args) {

        new MouseEventTest2();
    }
}
