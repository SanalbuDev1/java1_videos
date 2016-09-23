/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class swingvi_video60 {
    
    public static void main(String[] args) {
        marco1 ca = new marco1(); 
        
    }
   
    
    
  
}

class marco1 extends JFrame{    
    public marco1(){
       setTitle("prueba de dibujo");
       setSize(400,400); 
        setVisible(true);
       LaminaconFiguras ca1 = new LaminaconFiguras();
        add(ca1);
       
       
    }       
}

class LaminaconFiguras extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        
        
        Graphics2D g2=(Graphics2D) g;
        Rectangle2D rectangulo= new Rectangle2D.Double(100,100,200,150);
        g2.draw(rectangulo);
        
        
        
        Ellipse2D elipse=new Ellipse2D.Double(100,100,200,150);
        g2.draw(elipse);
        
        
        g2.draw(new Line2D.Double(100,100,300,250));
        
        double centerx=rectangulo.getCenterX();
        double centery=rectangulo.getCenterY();
        double radio=150;
        Ellipse2D circulo=new Ellipse2D.Double();
        circulo.setFrameFromCenter(centerx, centery, centerx+radio, centery+radio);
        g2.draw(circulo);
    }
    
}
