package Graficos;
import java.awt.Cursor;
import javax.swing.*;
public class Formulario1 extends JFrame {
    private JLabel label1, label2;
    public Formulario1() {
        setLayout(null);
        label1=new JLabel("Sistema Uniremington.");
        label1.setBounds(10,20,300,30);
        label1.setCursor(Cursor.getPredefinedCursor(WIDTH));
        add(label1);
        label2=new JLabel("Vesión 1.0");
        label2.setBounds(10,100,100,30);
        add(label2);
        
    }
    public static void main(String[] arg) {
        Formulario1 formulario1=new Formulario1();
        formulario1.setBounds(0,0,300,200);
        formulario1.setResizable(false);
        formulario1.setVisible(true);
    }
}

