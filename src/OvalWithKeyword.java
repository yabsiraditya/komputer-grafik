
import java.awt.Color;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.event.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author yabsiraditya
 */
public class OvalWithKeyword extends JPanel implements KeyListener{
    
    private int x = 100;
    private int y = 100;
    private int x1 = 270;
    private int y1 = 100;
    private int x2 = 280;
    private int y2 = 105;
    private int x3 = 280;
    private int y3 = 130;
    private int width = 60;
    private int height = 60;
    private int deltax = 0;
    private int deltay = 0;
 
    public OvalWithKeyword() {
        setFocusable(true);
        addKeyListener(this);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    
        g.setColor(Color.yellow);
        g.fillRect(x, y, 200, 50);
        g.setColor(Color.WHITE);
        g.fillArc(x1, y1, 20, 20, 0, 360);
        g.setColor(Color.BLACK);
        g.fillArc(x2, y2, 10, 10, 0, 360);
        g.setColor(Color.red);
        g.fillRect(x3, y3, 20,5);
    }

    
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        
        switch (keyCode) {
        case KeyEvent.VK_LEFT:
            deltax = -5;
            break;
        case KeyEvent.VK_RIGHT:
            deltax = 5;
            break;
        case KeyEvent.VK_UP:
            deltay = -5;
            break;
        case KeyEvent.VK_DOWN:
            deltay = 5;
            break;
        }   
        
        x += deltax;
        y += deltay;
        x1 += deltax;
        y1 += deltay;
        x2 += deltax;
        y2 += deltay;
        x3 += deltax;
        y3 += deltay;
        
        if (x < 0) x = 0;
        if (x > getWidth() - width) x = getWidth() - width;
        if (y < 0) y = 0;
        if (y > getWidth() - height) y = getWidth() - height;
        
        if (x1 < 0) x1 = 0;
        if (x1 > getWidth() - width) x1 = getWidth() - width;
        if (y1 < 0) y1 = 0;
        if (y1 > getWidth() - height) y1 = getWidth() - height;
        
        if (x2 < x) x2 = 0;
        if (x2 > getWidth() - width) x2 = getWidth() - width;
        if (y2 < 0) y2 = 0;
        if (y2 > getWidth() - height) y2 = getWidth() - height;
        
        if (x3 < 0) x3 = 0;
        if (x3 > getWidth() - width) x3 = getWidth() - width;
        if (y3 < 0) y3 = 0;
        if (y3 > getWidth() - height) y3 = getWidth() - height;

        repaint();
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        deltax = 0;
        deltay = 0;
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

    public static void main(String[] args){
        JFrame frame = new JFrame("OVAl WITH KEYOARD CONTROL");
        OvalWithKeyword ovalPanel = new OvalWithKeyword();
        frame.setSize(800, 600);
        frame.add(ovalPanel);
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
