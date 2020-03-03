import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SleepMethodTest extends JFrame {
    private static final long serialVersionUID=1L;
    private Thread t;

    private static Color[] color={Color.BLACK,Color.BLUE,Color.CYAN,
    Color.GREEN,Color.ORANGE,Color.YELLOW,Color.RED,
    Color.PINK,Color.LIGHT_GRAY};
    private static final Random rand=new Random();
    private static Color getC(){
        return color[rand.nextInt(color.length)];
    }
    public SleepMethodTest(){
    t=new Thread(new Draw());
    t.start();
    }
    class Draw implements Runnable{
        int x=30;
        int y=50;
        public void run(){
            while(true){
                try{
                    Thread.sleep(100);

                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                Graphics graphics=getGraphics();
                graphics.setColor(getC());
                graphics.drawLine(x,y,100,y++);
                if(y>=80){
                    y=50;
                }
            }
        }
    }
    public static void init(JFrame frame,int width,int height){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(width,height);
    }

    public static void main(String[] args) {
        init(new SleepMethodTest(),100,100);

    }

}
