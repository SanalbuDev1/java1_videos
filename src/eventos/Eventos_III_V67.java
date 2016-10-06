/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 *
 * @author Santy
 */
public class Eventos_III_V67 extends JFrame {

    public static void main(String[] args) {
        Eventos_III_V67 ca = new Eventos_III_V67();
        ca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public Eventos_III_V67() {

        setTitle("Eventos");
        setSize(400, 400);
        setLocation(100, 200);
        setVisible(true);
        Lamina1 ca = new Lamina1();
        add(ca);

    }
}

class Lamina1 extends JPanel {

    JButton BT, BT2, BT3;

    public Lamina1() {

        add(BT);

        add(BT2);

        add(BT3);
        
        colorFondo amarillo=new colorFondo(Color.yellow);
        colorFondo azul=new colorFondo(Color.blue);
        colorFondo rojo=new colorFondo(Color.red);
        
        BT.addActionListener(amarillo);
        BT2.addActionListener(azul);
        BT3.addActionListener(rojo);
        

    }

    private class colorFondo implements ActionListener {

        private Color ColorF;

        public colorFondo(Color c) {
            ColorF = c;
        }

        public void actionPerformed(ActionEvent e) {
            setBackground(ColorF);
        }

    }
}
