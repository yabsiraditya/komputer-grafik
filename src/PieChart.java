import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

public class PieChart extends JApplet {
    
    public void paint(Graphics g) {
        this.setSize(600, 600);
        g.setColor(Color.BLUE);
        g.fillArc(50, 50, 500, 500, 20, -210);
        g.setColor(Color.RED);
        g.fillArc(50, 50, 500, 500, 240, -80);
        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(50, 50, 500, 500, 160, -40);
        g.setColor(Color.ORANGE);
        g.fillArc(50, 50, 500, 500, 120, -30);
    }
   
}