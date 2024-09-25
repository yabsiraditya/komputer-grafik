/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author yabsiraditya
 */

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class ChartAnimate extends JPanel implements Runnable {

    @Override
    public void run() {
        try {
            while(true) {
//                x+= 10;
//                y += 10;
//                if (x == 90) {
//                    x +=10;
//                    y=80;
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

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
//        g.setColor(Color.red);
//        g.fillRect(x,y,40,40);
        g.drawString("Sales",40,40);
        g.setColor(Color.BLUE);
        g.fillArc(50, 50, 500, 500, 90, -y);
        g.setColor(Color.RED);
        g.fillArc(50, 50, 500, 500, 240, -80);
        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(50, 50, 500, 500, 160, -40);
        g.setColor(Color.ORANGE);
        g.fillArc(50, 50, 500, 500, 120, -30);    
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

    public static void main(String[] args) {
        JFrame fr = new JFrame("line");
        ChartAnimate ln = new ChartAnimate();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(600,600);
        fr.add(ln);
        fr.setVisible(true);
        
        Thread t = new Thread(ln);
        t.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
