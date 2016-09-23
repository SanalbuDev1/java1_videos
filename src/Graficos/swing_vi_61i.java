/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

public class swing_vi_61i extends JFrame {
    public swing_vi_61i(){
        setTitle("Marco con color");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lamina4 ca=new lamina4();
        ca.setBackground(new Color(87,23,54));
        add(ca);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        
        swing_vi_61i ca1= new swing_vi_61i();
        
        
    }
}

class lamina4 extends JPanel{
    public void paintComponent(Graphics g){
         super.paintComponent(g);
         Graphics2D g2=(Graphics2D) g;
         Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
         g2.setPaint(Color.WHITE);
         g2.draw(rectangulo);
         g2.setPaint(Color.BLACK);
         g2.fill(rectangulo);
         
         Ellipse2D circulo=new Ellipse2D.Double();
         circulo.setFrame(rectangulo);
         g2.setPaint(Color.WHITE);
         g2.draw(circulo);
         g2.setPaint(new Color(99,99,99).brighter());
         g2.fill(circulo);
         
         Ellipse2D circulo2= new Ellipse2D.Double(0,0,100,100);
         g2.setPaint(Color.WHITE);
         g2.draw(circulo2);
         Color color1=new Color(255,155,55);
         g2.setPaint(color1);
         g2.fill(circulo2);    
    }
      
      
    }
