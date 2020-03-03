import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class SwingAndThread extends JFrame {
    private JLabel jl=new JLabel();
    private static Thread t;
    private int x=0;
    private Container container=getContentPane();

    public SwingAndThread(){
        setBounds(300,200,25,100);
        container.setLayout(null);
        try{
            URL url=SwingAndThread.class.getResource("java.png");
            Icon icon=new ImageIcon(url);
            jl.setIcon(icon);
        }catch (NullPointerException ex){
            System.out.println("图片不存在，请将java。png拷贝到当前目录下！");
            return ;
        }
        jl.setBounds(10,10,200,50);
        t=new Thread(new Roll());
        t.start();
        container.add(jl);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    class Roll implements Runnable{
        public void run(){
            while(x<=200){
                jl.setBounds(x,10,200,50);
                try{
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }
                x+=4;
                if(x>=200){
                    x=10;
                }
            }
        }

    }

    public static void main(String[] args) {
        new SwingAndThread();
    }

}
