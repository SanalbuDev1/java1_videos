package ddd39;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class hora implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Date hora= new Date(); 
            System.out.println("Te pongo la hora cada 4 seg" + hora);
        }
        
 }