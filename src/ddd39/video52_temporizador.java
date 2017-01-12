
package ddd39;


import java.awt.Toolkit;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.*;
/**
 *
 * @author Santy
 */
public class video52_temporizador {
    public static void main(String[] args) {
        
        ActionListener oyente = new hora();
        Timer miTemporizador = new Timer(1000,oyente);
        miTemporizador.start();
        JOptionPane.showMessageDialog(null, "pulsa aceptar para detener");
        System.exit(0);
        
        
    }
   static class hora implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Date hora= new Date(); 
            System.out.println("Te pongo la hora cada 4 seg" + hora);
            Toolkit.getDefaultToolkit().beep();
        }
        
 }
   
}
