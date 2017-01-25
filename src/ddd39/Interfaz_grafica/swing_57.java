
package ddd39.Interfaz_grafica;


import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;


public class swing_57 {
    public static void main(String[] args) {
        MarcoCentrado ca = new MarcoCentrado();
        ca.setVisible(true);
        
        
        
        
    }
}

class MarcoCentrado extends JFrame{
    
    public MarcoCentrado(){
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension mipantalla = pantalla.getScreenSize();
        
        
        escribir=new JLabel(String.valueOf(pantalla.getScreenSize()));
        escribir.setBounds(0, 0, 100, 50);
        add(escribir);
        
        setBounds(0,0,mipantalla.height,mipantalla.width);
        
        
    }
    JLabel escribir;
    String Resolucion;
}
