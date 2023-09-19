import javax.swing.*;
import java.awt.*;

public class StundenplanViz extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 10, 10);
        g.setColor(Color.RED);
        g.draw3DRect(20, 0, 10, 10, false);
        g.drawString("VL", 40, 0);
    }
}
