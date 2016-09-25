/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Santy
 */
public class Swing_vii_video62i {
    public static void main(String[] args) {
        MarcoFuente ca=new MarcoFuente();
        
    }
}

class MarcoFuente extends JFrame{
    public MarcoFuente(){
        
        setTitle("Marco con fuente");
        setLocation(400, 100);
        setSize(400,400);
        laminaF ca = new laminaF();
        add(ca);
        ca.setBackground(new Color(0,255,255));
        setVisible(true);
        
    }
}

class laminaF extends JPanel{
    public void paintComponent(Graphics g){
       super.paintComponent(g);
       g.setColor(Color.pink);
       g.drawString("hola", 80, 20);
       
       
       Graphics2D g2=(Graphics2D) g;
       g2.drawString("HOLA QUE MAS ",40,40);
       Font mifuente=new Font("Arial", Font.BOLD,26);
       g2.setFont(mifuente);
       Color color=new Color(255,0,255);
       g2.setColor(color);
       g2.drawString("HOLA QUE MAS ",40,80);
       
       g2.setFont(new Font("Bell MT",Font.BOLD,100));
       g2.setColor(Color.blue);
       g2.drawString("hola que mas ",40,120);
       
       g2.setBackground(new Color(0,255,255));
       
       Rectangle2D rectangulo=new Rectangle2D.Double(0,200,100,100);
       g2.setColor(new Color(255,255,255));
       g2.fill(rectangulo);
       g2.setFont(new Font("Arial",Font.BOLD,10));
       
       g2.setColor(new Color(0,0,0));
       g2.drawString("cuadrado 100x100", 0, 250);
       
    }
}