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
    
    int x=50;
    int y=50;
    int width = 500;
    int height = 500;
    
    private int move1;
    private int move2;
    private int move3;
    private int move4;

  @Override
    public void run() {
        while (move1 < 210) {   
            move1 += 10;
            try {
                if (move1 == 210) {
                    break;
                }
                repaint();
                Thread.sleep(200);
            } catch (InterruptedException ex) {
            }
        }
        while (move2 < 80) {   
            move2 += 10;
            try {
                if (move2 == 80) {
                    break;
                }
                repaint();
                Thread.sleep(200);
            } catch (InterruptedException ex) {
            }
        }
        while (move3 < 40) {   
            move3 += 10;
            try {
                if (move3 == 40) {
                    break;
                }
                repaint();
                Thread.sleep(200);
            } catch (InterruptedException ex) {
            }
        }
        while (move4 < 40) {   
            move4 += 10;
            try {
                if (move4 == 40) {
                    break;
                }
                repaint();
                Thread.sleep(200);
            } catch (InterruptedException ex) {
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillArc(x, y, width, height, 90, -move1);
        g.setColor(Color.RED);
        g.fillArc(x, y, width, height, 240, -move2);
        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(x, y, width, height, 160, -move3);
        g.setColor(Color.ORANGE);
        g.fillArc(x, y, width, height, 120, -move4); 
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
        JFrame frame = new JFrame();
        ChartAnimate chart = new ChartAnimate();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.add(chart);
        frame.setVisible(true);
        
        Thread t = new Thread(chart);
        t.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}