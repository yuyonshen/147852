import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import javax.swing.*;
import java.awt.*;

public class JPanelTest2 extends JFrame {
    public JPanelTest2(){
        Container c=getContentPane();
        c.setLayout(new GridLayout(3,0,10,10));
        setSize(500,300);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JPanelTest2();
    }
}
