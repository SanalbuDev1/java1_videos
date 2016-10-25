/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.*;
import javax.swing.*;

public class swing_v_video_59 {
    
    public static void main(String[] args) {
        marco ca = new marco(); 
        
    }
   
    
    
  
}

class marco extends JFrame{    
    public marco(){
       setTitle("prueba de dibujo");
       setSize(400,400); 
        setVisible(true);
       LaminaConFiguras ca1 = new LaminaConFiguras();
        add(ca1);
        
       
       
    }       
}

class LaminaConFiguras extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.drawRect(50, 50, 200, 200);
        g.drawOval(200, 200, 50, 50);
        g.drawLine(10, 10, 370, 10);
        g.drawArc(150, 100, 150, 80, 150, 150);
       
    }
    
}
