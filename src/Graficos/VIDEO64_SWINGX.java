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
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.imageio.*;

/**
 *
 * @author Santy
 */
public class VIDEO64_SWINGX {
    public static void main(String[] args) {
        
        MarcoImagen1 ca = new MarcoImagen1();
        
       
    }
}

class MarcoImagen1 extends JFrame{
    public MarcoImagen1(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,200,400,400);
        setTitle("Marco Imagen");
        laminaImagen1 ca= new laminaImagen1();
        add(ca);
        ca.setBackground(new Color(180,210,255));
        setVisible(true);
    }
}

class laminaImagen1 extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g;
        
        //File MiImagen=new File("src/graficos/loro.jpg");
        try{
        imagen=ImageIO.read(new File("src/graficos/loro.jpg"));
        }catch(IOException e){
            System.out.println("no se encontro la imagen");
        }
        
        int alto=imagen.getHeight(this);
        int ancho=imagen.getWidth(this);
        System.out.println("ancho " + ancho + "alto" + alto);
        
        g.drawImage(imagen, 0, 0, null);
        
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                g2.copyArea(0, 0, ancho, alto, ancho*i,alto*j);
            }
        }
        
        
        
        
        
        
    }
    private Image imagen;
}
