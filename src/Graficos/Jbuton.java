/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;



import javax.swing.*;
import java.awt.event.*;
public class Jbuton extends JFrame implements ActionListener {
    JButton boton1;
    public  Jbuton() {
        setLayout(null);
        boton1=new JButton("Finalizar");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this);
        
    }
    
     public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            System.exit(0);
        }
    }
    
    public static void main(String[] ar) {
        Jbuton formulario1=new Jbuton();
        formulario1.setBounds(0,0,450,350);
        formulario1.setVisible(true);
    }
}