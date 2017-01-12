package ddd39;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;



class Inner_Class_53 {
    public static void main(String[] args) {
        
        Relog1 ca = new Relog1(5000,true);
        System.out.println(ca.Mostrar());
        ca.Marcha1();
        JOptionPane.showMessageDialog(null,"aceptar");
        System.exit(0);
        
        
        
    }
}

class Relog1{
    public Relog1(int Intervalo , boolean sonido){
        this.Intervalo=Intervalo;
        this.sonido=sonido;
    }
    
    public int Mostrar(){
        return Intervalo;
    }
    
    public void Marcha1(){
        ActionListener oyente = new DameLaHora2();
        Timer miTemporizador = new Timer(Intervalo,oyente);
        miTemporizador.start();
      
    }
    
    private int Intervalo;
    private boolean sonido;
    
    private class DameLaHora2 implements ActionListener{
        public void actionPerformed(ActionEvent evento){
            Date ahora = new Date();
            System.out.println("hora" + ahora);
            if(sonido){
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}