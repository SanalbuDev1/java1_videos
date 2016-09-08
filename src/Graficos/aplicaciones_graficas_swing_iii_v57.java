
package Graficos;


import java.awt.*;
import javax.swing.*;


public class aplicaciones_graficas_swing_iii_v57 {
    
    public static void main(String[] args) {
        
        MarcoCentrado ca=new MarcoCentrado();
        ca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ca.setVisible(true);
        
    }
    
}

class MarcoCentrado extends JFrame{
    
    public MarcoCentrado(){
        
        Toolkit mipantalla=Toolkit.getDefaultToolkit();
        Dimension TamanoPantalla=mipantalla.getScreenSize();
        int ALTURAPANTALLA=TamanoPantalla.height;
        int ANCHOPANTALLA=TamanoPantalla.width;
        
        setSize(ANCHOPANTALLA/2,ALTURAPANTALLA/2);
        setLocation(ANCHOPANTALLA/4 , ALTURAPANTALLA/4);
        setTitle("Marco Centrado");
        Image MiIcono=mipantalla.getImage("images.jpg");
        setIconImage(MiIcono);
    }
    
}