import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;

/**
 *
 * @author yabsiraditya
 */

public class forLoopCube extends JApplet {

    public void paint(Graphics g) {
    this.setSize(500, 200);
    Color c[] = {Color.green,Color.blue,Color.yellow,Color.red,Color.cyan}; 
    int x = 10;
    int y = 10;
    int xPts[] = {5, 25, 50, 30, 15, 5};
    int yPts[] = {10, 35, 20, 65, 40, 10};
        for (int i = 0; i < 2; i++) {
            x = 10;
            for (int j = 0; j < 5; j++) {
                g.setColor(c[j]);
                g.drawPolygon(xPts, yPts, xPts.length);
                g.drawRect(x, y, 60, 60);
                g.fillRoundRect(x,y,60,60,100,100);
                x += 70;   
            }
         y += 70;
        }
    }
}