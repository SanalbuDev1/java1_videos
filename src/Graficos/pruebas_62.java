/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.GraphicsEnvironment;
import javax.swing.*;
import jdk.nashorn.internal.scripts.JO;
        
        

public class pruebas_62 {
    public static void main(String[] args) {
        
        boolean fuentei=false;
        String NombreFuente=JOptionPane.showInputDialog("escriba ña fuente");
        String []NombresF=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String nombres:NombresF) {
            if(nombres.equals(NombreFuente)){
               fuentei=true;
            }
        }
        if(fuentei){
            System.out.println("fuente instalada");
        }else{
            System.out.println("fuente no instalada");
        }
    }
}
