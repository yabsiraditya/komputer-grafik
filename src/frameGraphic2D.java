import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class frameGraphic2D extends javax.swing.JPanel {

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLUE);
            int x = 50;
            int y = 50;
            int width = 100;
            int height = 100;
            
        for (int i = 0; i < 10; i++) {
            g2d.drawOval(x, y, width, height);
            Shape s1 = new RoundRectangle2D.Float(x,y,width,height, 20,20);
            g2d.draw(s1);
            x += width+20;
            y += 5;
            width -= 10;
            height -= 10;
        }
        
    }
    
    public static void main(String [] args) {
        JFrame frame = new JFrame("FRAME GRAPHIC 2D");
        frameGraphic2D ovalPanel = new frameGraphic2D();
        frame.setSize(800, 600);
        frame.add(ovalPanel);
        frame.setVisible(true);
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
