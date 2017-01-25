/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddd39.Interfaz_grafica;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Santy
 */
public class Swing_58 {
    public static void main(String[] args) {
        marco2 ca = new marco2();
        ca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

class marco2 extends JFrame{
    marco2(){
        setTitle("video 58");
        Toolkit panta=Toolkit.getDefaultToolkit();
        Dimension mipanta = panta.getScreenSize();
        setBounds(300,150,mipanta.width/2,mipanta.height/2);
        setVisible(true);
        
        lamina1 ca2 = new lamina1();
        add(ca2);
    }
}

class lamina1 extends JPanel{
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        g.drawString("Repasando", 300, 120);
    }
            
}