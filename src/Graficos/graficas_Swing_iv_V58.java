package Graficos;

import javax.swing.*;
import java.awt.*;

public class graficas_Swing_iv_V58 {

    public static void main(String[] args) {
         MarcoTexto ca = new MarcoTexto();
         ca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
    }
    
}

class MarcoTexto extends JFrame {

    public MarcoTexto() {
        
        Toolkit mipantalla=Toolkit.getDefaultToolkit();
        setVisible(true);
        setSize(400,200);
        setLocation(400,200);
        setTitle("Texto");
        Image MiIcono=mipantalla.getImage("images.jpg");
        setIconImage(MiIcono);
        
        lamina milamina=new lamina();
        add(milamina);
        
        lamina1 milamina1=new lamina1();
        add(milamina1);
        
        
    }
}

class lamina extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        g.drawString("aprendiendo swing", 10, 10);
        g.drawString("aprendiendo swing", 10, 22);
    }
}

class lamina1 extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        g.drawString("aprendiendo swing1", 40, 10);
        g.drawString("aprendiendo swing1", 22, 22);
    }
}
