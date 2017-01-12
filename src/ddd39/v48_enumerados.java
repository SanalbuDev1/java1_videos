
package ddd39;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class v48_enumerados {
    
    enum talla{
        MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRNADE("XL");
        private talla(String ab){
            this.ab=ab;
        }
        public String DameAb(){
            return ab;
        }
        private String ab;
    }
    
   
   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        v48_enumerados ca = new v48_enumerados();
        System.out.println("escribe tu talla");
        String entrada_datos=JOptionPane.showInputDialog("escribe tu talla").toUpperCase();
        talla laTalla=Enum.valueOf(talla.class, entrada_datos);
        System.out.println("talla : " + laTalla);
        System.out.println("Abreviatura " + laTalla.DameAb());
        
    }
}
