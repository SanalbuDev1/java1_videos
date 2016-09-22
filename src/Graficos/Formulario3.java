/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

/**
 *
 * @author UNIREMINGTON
 */
import java.awt.Graphics;
import javax.swing.*;
import java.awt.event.*;
public class Formulario3 extends JFrame implements ActionListener {
    JButton boton1,boton2;
    JLabel label1,label2;
    public void Formulario33() {
        setLayout(null);
        boton1=new JButton("Finalizar23");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this);
        boton2=new JButton("Finalizar1");
        add(boton2);
        boton2.setSize(100,30);
        boton2.setLocation(300,210);
       
        
        boton2.addActionListener(this);
        
        
    }
    public void Formulario() {
        setLayout(null);
        label1=new JLabel("Sistema Uniremington.");
        label1.setBounds(10,20,300,30);
        add(label1);
        label2=new JLabel("Vesión 1.0");
        label2.setBounds(10,100,100,30);
        add(label2);
      
    }
    
     public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1 || e.getSource()==boton2) {
            System.exit(0);
        }
    }
    
    public static void main(String[] ar) {
        Formulario3 formulario1=new Formulario3();
        formulario1.setBounds(0,0,450,350);
        formulario1.setVisible(true);
        formulario1.Formulario();
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formulario1.Formulario33();
        
        
       
    }
    
   
    
}

 class lineas33 extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawRect(100, 200, 100, 200);
            setVisible(true);
        }
    }
    
