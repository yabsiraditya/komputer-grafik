import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;

/**
 *
 * @author yabsiraditya
 */

public class forLoopCube extends JApplet {

    public void paint(Graphics g) {
    Color c[] = {Color.green,Color.blue,Color.yellow,Color.red,Color.cyan}; 
    int x = 10;
    int y = 10;
        for (int i = 0; i < 2; i++) {
            x = 10;
            for (int j = 0; j < 5; j++) {
                g.setColor(c[j]);
                g.fillRoundRect(x, y, 60, 60,100,100);
                x += 70;   
            }
         y += 70;
        }
    }
}