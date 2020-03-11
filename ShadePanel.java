import javax.swing.*;
import java.awt.*;

public class ShadePanel extends JPanel {
    public ShadePanel(){
        super();
        setLayout(null);
    }
    protected void paintComponent(Graphics g1) {
        Graphics2D g = (Graphics2D) g1;
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        // �������ģʽ����
        GradientPaint paint = new GradientPaint(0, 0, Color.CYAN, 0, height,
                Color.MAGENTA);
        g.setPaint(paint);
        g.fillRect(0, 0, width, height);
    }
}
