import com.sun.javafx.geom.ShapePair;

import javax.swing.*;
import java.awt.*;
import java.awt.font.ShapeGraphicAttribute;

public class ShadeBackgroundImage extends JFrame {
    private JPanel contentPane;

    public static void main(String[] args) {
        ShadeBackgroundImage frame = new ShadeBackgroundImage();
        frame.setVisible(true);
    }

    public ShadeBackgroundImage() {
        setTitle("背景");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();// �����������
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
     ShadePanel shadePanel = new ShadePanel();
        contentPane.add(shadePanel, BorderLayout.CENTER);
    }
}
