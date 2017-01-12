/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddd39;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Santy
 */
public class inner_class_54 {
    
public static void main(String[] args) {
        
        Relog2 ca = new Relog2();
        ca.Marcha2(5000, true);
        JOptionPane.showMessageDialog(null, "aceptar");
        System.exit(0);
        
    }
}

class Relog2{
      
    
    
    public void Marcha2( int Intervalo ,final boolean sonido){
        class DameLaHora3 implements ActionListener{
        public void actionPerformed(ActionEvent evento){
            Date ahora = new Date();
            System.out.println("hora" + ahora);
            if(sonido){
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
        ActionListener oyente = new DameLaHora3();
        Timer miTemporizador = new Timer(Intervalo,oyente);
        miTemporizador.start();
      
    }
    
   
    
    
}