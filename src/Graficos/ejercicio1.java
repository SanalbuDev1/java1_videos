/*
*Confeccionar una ventana que contenga tres objetos de la clase Jbutton con lasetiquetas "1","2","3"
*al prescionarse cambiar el titulo del JFrame indicando cual boton se preciono
*/

import javax.swing.*;
import java.awt.event.*;

public class ejercicio1 extends JFrame implements ActionListener {
    JButton boton1,boton2,boton3;
    public ejercicio1(){
		setLayout(null);
		boton1=new JButton("1");
		boton1.setBounds(10,20,100,50);
		add(boton1);
		boton1.addActionListener(this);
		
		boton2=new JButton("2");
		boton2.setBounds(10,80,100,50);
		add(boton2);
		boton2.addActionListener(this);
		
		boton3=new JButton("3");
		boton3.setBounds(10,140,100,50);
		add(boton3);
		boton3.addActionListener(this);
		
	}
	
	 public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            setTitle("1");
        }
        if (e.getSource()==boton2) {
            setTitle("2");
        }
        if (e.getSource()==boton3) {
            setTitle("3");
        }
    }
    
    public static void main(String []args){
	
		ejercicio1 ca = new ejercicio1();
		ca.setVisible(true);
		ca.setBounds(0,0,500,500);
		ca.setTitle("inicio");
		
	}
}