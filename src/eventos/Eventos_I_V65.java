/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Santy
 */
public class Eventos_I_V65 extends JFrame{
    public static void main(String[] args) {
        Eventos_I_V65 ca = new Eventos_I_V65();
        ca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    public Eventos_I_V65() {
        
        setTitle("Eventos");
        setSize(400,400);
        setLocation(100, 200);
        setVisible(true);
        
        Lamina ca = new Lamina();
        add(ca);
       
        
    }
}

class Lamina extends JPanel implements ActionListener{
    
    JButton BT,BT2,BT3; 
    
    public Lamina(){
        
       setLayout(null);
        BT=new JButton("azul");
        BT.setBounds(10,10,100,100);
        BT.addActionListener(this);
        add(BT);
        
        BT2=new JButton("rojo");
        BT2.setBounds(10,100,100,100);
        BT2.addActionListener(this);
        add(BT2);
        
        BT3=new JButton("Amarillo");
        BT3.setBounds(10,200,100,100);
        BT3.addActionListener(this);
        add(BT3);
        
        
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==BT){
            setBackground(new Color(0,255,255));
        }
        if(e.getSource()==BT2){
            setBackground(Color.red);
        }
        if(e.getSource()==BT3){
            setBackground(new Color(255,255,0));
        }
    }
}
