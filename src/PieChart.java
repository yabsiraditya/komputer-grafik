import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

public class PieChart extends JApplet implements Runnable{
    
     @Override
    public void run() {
        try {
            while(true) {
//                x+= 10;
////                y += 10;
//                if (x == 90) {
//                    x +=10;
////                    y=80;
//                } else if (x >= 90) {
//                    x = 90;
//                    y += 10;
//                }
//                else if (y == 90) {
//                    x -=10;
//                    y =90;
//                }
//                
                if (y < 225) {
                    y+=10;
                }
                else if (y == 225) {
                    y-=10;
                }
                repaint();
                Thread.sleep(500);
                
            }
//            Thread.sleep(500);
        }
        catch(Exception e){
            
        }
    }
    private int x = 10;
    private int y = 15;
    
    public void paint(Graphics g) {
        this.setSize(600, 600);
        g.setColor(Color.BLUE);
        g.fillArc(50, 50, 500, 500, 90, -210);
        g.setColor(Color.RED);
        g.fillArc(50, 50, 500, 500, 240, -80);
        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(50, 50, 500, 500, 160, -40);
        g.setColor(Color.ORANGE);
        g.fillArc(50, 50, 500, 500, 120, -30);
    }
   
}
