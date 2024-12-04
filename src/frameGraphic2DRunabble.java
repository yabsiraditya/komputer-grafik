import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class frameGraphic2DRunabble extends JPanel implements Runnable {
    int coloring = 0;
    Color lamer[] = {Color.RED,Color.YELLOW,Color.GREEN}; 

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
            int x = 100;
            int y = 100;
            int width = 120;
            int height = 340;
            
        g2d.setColor(Color.black);
        Shape s1 = new RoundRectangle2D.Float(x,y,width,height, 30,30);
        g2d.fill(s1);
        
        int lightDiameter = 80;
        int lightX = x + (width - lightDiameter) / 2; 
        int[] lightYPositions = {y + 20, y + 130, y + 240};

        for (int i = 0; i < 3; i++) {
            if (i == coloring) {
                g2d.setColor(lamer[i]);
            } else {
                g2d.setColor(Color.DARK_GRAY);
            }
            g2d.fillOval(lightX, lightYPositions[i], lightDiameter, lightDiameter);
        }  
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                if (coloring < 3) {
                    coloring++;
                } else {
                    coloring = 0;
                }
                repaint();
                Thread.sleep(800);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
    
    public static void main(String [] args) {
        JFrame frame = new JFrame("FRAME GRAPHIC 2D");
        frameGraphic2DRunabble ovalPanel = new frameGraphic2DRunabble();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(ovalPanel);
        frame.setVisible(true);
        Thread thread = new Thread(ovalPanel);
        thread.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}