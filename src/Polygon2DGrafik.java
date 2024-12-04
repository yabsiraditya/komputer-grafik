import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Polygon2DGrafik extends javax.swing.JPanel {
    Color lamer[] = {Color.RED,Color.YELLOW,Color.GREEN}; 

    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int x[] = {100,180,180,160,160,240,240,40,40,120,120,100};
        int y[] = {100,100,320,320,560,560,580,580,560,560,320,320};
        
        g2d.setColor(Color.BLACK);
        g2d.fill(new Polygon(x, y, x.length));  
        
        int lightDiameter = 50;
        int lightX = 115;
        int[] lightYPositions = {125, 185, 245};
        
        for (int i = 0; i < 3; i++) {
            g2d.setColor(lamer[i]);
            Arc2D.Float arc = new Arc2D.Float(lightX, lightYPositions[i], lightDiameter, lightDiameter, 0, 360, Arc2D.PIE);
            g2d.fill(arc);
        }  
            
    }
    
    public static void main(String [] args) {
        JFrame frame = new JFrame("2D Polygon");
        Polygon2DGrafik ovalPanel = new Polygon2DGrafik();
        frame.setSize(500, 600);
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
