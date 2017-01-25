
package ddd39.Interfaz_grafica;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Graficas_swing_1 extends JFrame implements ActionListener{
    
    JLabel escrito;
    JButton boton;
    
    public Graficas_swing_1(){
        setVisible(true);
        setLayout(null);
        setBounds(200,200,400,200);
        escrito= new JLabel("hola");
        escrito.setBounds(3,0,100,20);
        add(escrito);
        
        boton=new JButton("clickeame");
        boton.setBounds(100,0,100,20);
        add(boton);
        boton.addActionListener(this);
        
        
        
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton ) {
            System.exit(0);
        }
     }
    
    
    public static void main(String[] args) {
        
        Graficas_swing_1 ca = new Graficas_swing_1();
        ca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ca.setTitle("hola");
        //ca.setExtendedState(6);
        
        
    }
}
