package Graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;

public class Jmenu1 extends JFrame implements ActionListener {

    private JMenuBar mb;
    private JMenu menu1, menu2;
    private JMenuItem mi1, mi2, mi3, m2q, m2w, m2e, m2r;
    

    public Jmenu1() {
        setTitle("hola");
        
       
        
        setLayout(null);
        setResizable(false);
        mb = new JMenuBar();
        setJMenuBar(mb);
        menu1 = new JMenu("Opciones");
        mb.add(menu1);
        mi1 = new JMenuItem("Rojo");
        mi1.addActionListener(this);
        menu1.add(mi1);
        mi2 = new JMenuItem("Verde");
        mi2.addActionListener(this);
        menu1.add(mi2);
        mi3 = new JMenuItem("Azul");
        mi3.addActionListener(this);
        menu1.add(mi3);

        menu2 = new JMenu("colores");
        mb.add(menu2);

        m2q = new JMenuItem("negro");
        m2q.addActionListener(this);
        menu2.add(m2q);

        m2w = new JMenuItem("blanco");
        m2w.addActionListener(this);
        menu2.add(m2w);

        m2e = new JMenuItem("gris");
        m2e.addActionListener(this);
        menu2.add(m2e);

        m2r = new JMenuItem("cuadrado");
        m2r.addActionListener(this);
        menu2.add(m2r);

    }

    public void actionPerformed(ActionEvent e) {
        Container f = this.getContentPane();

        if (e.getSource() == mi1) {
            f.setBackground(new Color(255, 0, 0));
            

        }
        if (e.getSource() == mi2) {
            f.setBackground(new Color(0, 255, 0));
        }
        if (e.getSource() == mi3) {
            f.setBackground(new Color(0, 0, 255));
        }
        if (e.getSource() == m2q) {
            f.setBackground(new Color(0, 0, 0));
        }
        if (e.getSource() == m2w) {
            f.setBackground(new Color(255, 255, 255));
        }
        if (e.getSource() == m2e) {
            f.setBackground(Color.GRAY);
        }

    }

    public static void main(String[] ar) {
        Jmenu1 formulario1 = new Jmenu1();
        formulario1.setBounds(10, 20, 500, 500);
        formulario1.setVisible(true);

    }
}

