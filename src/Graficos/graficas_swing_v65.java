
package Graficos;

import javax.swing.*;
public class graficas_swing_v65 {

    
    public static void main(String[] args) {
      
        miMarco marco1 = new miMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
    }
}

class miMarco extends JFrame{
    public miMarco(){
        setBounds(200,200,300,200);
        setTitle("marco");
    }
}
    
