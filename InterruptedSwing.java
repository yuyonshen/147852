import javax.swing.*;
import java.awt.*;

public class InterruptedSwing extends JFrame {
    Thread thread;
    public InterruptedSwing(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(100,100);
        final JProgressBar progressBar=new JProgressBar();
        getContentPane().add(progressBar, BorderLayout.NORTH);
        progressBar.setStringPainted(true);
        thread=new Thread(){
            int count=0;
            public void run(){
                while(true){
                    progressBar.setValue(++count);
                    try{
                        if(count==90){
                            interrupt();
                        }
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        System.out.println("当前进度条被中断");
                        break;
                    }
                }
            }
        };
        thread.start();
    }

    public static void main(String[] args) {
        new InterruptedSwing();
    }
}
