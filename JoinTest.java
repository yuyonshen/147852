import javax.swing.*;
import java.awt.*;

public class JoinTest extends JFrame {
    private static  final long serialVersionUID=1L;
    private Thread threadA;
    private Thread threadB;
    final JProgressBar progressBar=new JProgressBar();
    final JProgressBar progressBar2=new JProgressBar();
    int count=0;

    public JoinTest(){
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(100,100);
        setVisible(true);
        getContentPane().add(progressBar, BorderLayout.NORTH);
        getContentPane().add(progressBar2,BorderLayout.SOUTH);
        progressBar.setStringPainted(true);
        progressBar2.setStringPainted(true);
        threadA=new Thread(new Runnable(){
            int count=0;
            public void run(){
                while(true){
                    progressBar.setValue(++count);
                    try{
                        Thread.sleep(100);
                        if(count==20){
                            threadB.join();
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
        threadA.start();
        threadB=new Thread(new Runnable(){
            int count=0;
            public void run(){
                while(true){
                    progressBar2.setValue(++count);
                    try{
                        Thread.sleep(100);

                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    if(count==100){
                        break;
                    }
                }
            }
        });
        threadB.start();
    }

    public static void main(String[] args) {
        new JoinTest();
    }
}
