package Graficos;



import java.awt.event.*;

import javax.swing.*;



public class Examen1 extends JFrame implements ActionListener  {
    private JLabel label1,label2,label3,label4;
    private JTextField textfield1,textfield2,textfield3;
    private JButton boton1,boton2,boton3,boton4,boton5,boton6;
    
    private JMenuBar mb;
    private JMenu menu1, menu2;
    private JMenuItem mi1, mi2, mi3, m2q, m2w, m2e, m2r;
    
    
    public  Examen1(){
    
        
        setLayout(null);
        setVisible(true);
        
        
}
   
    
    
    public void formulario(){
       
        
        label1=new JLabel("Sistema Uniremington v1.0");
        label1.setBounds(200,20,300,30);
        add(label1);
        label2=new JLabel("Pimer valor");
        label2.setBounds(100,150,100,30);
        add(label2);
        label3=new JLabel("segundo valor");
        label3.setBounds(100,180,100,30);
        add(label3);
        label4=new JLabel("resultado valor");
        label4.setBounds(100,210,100,30);
        add(label4);
        
        textfield1=new JTextField();
        textfield1.setBounds(190,150,150,20);
        add(textfield1);
        textfield2=new JTextField();
        textfield2.setBounds(190,180,150,20);
        add(textfield2);
        textfield3=new JTextField();
        textfield3.setBounds(190,210,150,20);
        add(textfield3);
        
        boton1=new JButton("salir");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this);
        boton2=new JButton("acerca de");
        boton2.setBounds(300,290,100,30);
        add(boton2);
        boton2.addActionListener(this);
        boton3=new JButton("Restar");
        boton3.setBounds(400,120,100,30);
        add(boton3);
        boton3.addActionListener(this);
        boton4=new JButton("sumar");
        boton4.setBounds(400,150,100,30);
        add(boton4);
        boton4.addActionListener(this);
        boton5=new JButton("dividir");
        boton5.setBounds(400,180,100,30);
        add(boton5);
        boton5.addActionListener(this);
        boton6=new JButton("multiplicar");
        boton6.setBounds(400,210,100,30);
        add(boton6);
        boton6.addActionListener(this);
        
        
        
        
    }
    
     public void actionPerformed(ActionEvent e) {
       if (e.getSource()==boton1 ) {
            System.exit(0);
        }
       
       if (e.getSource()==boton2 ) {
            String texto="Bienvenido a la calculadora";
            textfield3.setText(texto);
            
        }
       
       if (e.getSource()==boton3 ) {
            String cad1=textfield1.getText();
            String cad2=textfield2.getText();
            int x1=Integer.parseInt(cad1);
            int x2=Integer.parseInt(cad2);
            int resta=x1-x2;
            String total=String.valueOf(resta);
            textfield3.setText(total);
        }
       
       if (e.getSource()==boton4 ) {
            String cad1=textfield1.getText();
            String cad2=textfield2.getText();
            int x1=Integer.parseInt(cad1);
            int x2=Integer.parseInt(cad2);
            int suma=x1+x2;
            String total=String.valueOf(suma);
            textfield3.setText(total);
        }
       
       if (e.getSource()==boton5 ) {
            String cad1=textfield1.getText();
            String cad2=textfield2.getText();
            int x1=Integer.parseInt(cad1);
            int x2=Integer.parseInt(cad2);
            double div=x1/x2;
            String total=String.valueOf(div);
            textfield3.setText(total);
        }
       
       if (e.getSource()==boton6 ) {
            String cad1=textfield1.getText();
            String cad2=textfield2.getText();
            int x1=Integer.parseInt(cad1);
            int x2=Integer.parseInt(cad2);
            double div=x1*x2;
            String total=String.valueOf(div);
            textfield3.setText(total);
        }
       
       
       
       
       
       
            


     }
      public static void main(String[] args) {
        
        Examen1 ca =new Examen1();
        ca.formulario();
        ca.setVisible(true);
        ca.setBounds(10,10,600,500);
        
        
        
    }
}
