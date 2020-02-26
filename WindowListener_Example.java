import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListener_Example extends JFrame {
    public WindowListener_Example(){
        super();
        addWindowListener(new MyWindowListener());
        setTitle("捕获窗体事件");
        setBounds(100,100,500,375);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    class MyWindowListener implements WindowListener {
        public void windowActivated(WindowEvent e){
            System.out.println("窗体被激活");
        }
        public void windowOpened(WindowEvent e){
            System.out.println("窗口被打开");
        }
        public void windowIconified(WindowEvent e){
            System.out.println("窗体最小化");
        }
        public void windowDeiconified(WindowEvent e){
            System.out.println("窗体非最小化");
        }
        public void windowClosing(WindowEvent e){
            System.out.println("窗体将要被关闭");
        }
        public void windowDeactivated(WindowEvent e){
            System.out.println("窗体不再处于激活状态");
        }
        public void windowClosed(WindowEvent e){
            System.out.println("窗体已被关闭");
        }
    }

    public static void main(String[] args) {
        new WindowListener_Example();
    }
}
