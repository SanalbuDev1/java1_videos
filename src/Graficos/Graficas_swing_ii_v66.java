/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.Frame;
import javax.swing.JFrame;

/**
 *
 * @author Santy
 */
public class Graficas_swing_ii_v66 {
    
    public static void main(String[] args) {
        miMarco1 marco1 = new miMarco1();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
    }
    
}

class miMarco1 extends JFrame{
    public miMarco1(){
        //setSize(500,350);
        //setLocation(100,100);
        setTitle("marco"); 
        setBounds(100,100,500,350);
        //setResizable(false);
        //setExtendedState(Frame.MAXIMIZED_BOTH);
       
    }   
}
