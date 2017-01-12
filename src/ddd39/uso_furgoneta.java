/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddd39;

/**
 *
 * @author Santy
 */
public class uso_furgoneta extends coche {
    
    private int Capacidad_c;
    private int cExtra;
        
    public uso_furgoneta(int Capacidad_C,int cExtra){
        
        super(); // llama costructor clase padre
        this.Capacidad_c=Capacidad_C;
        this.cExtra=cExtra;

    }
    
    public String dameDatosFurgon(){
        return " La capacudad de carga es " + Capacidad_c
                + "   La capacidad extra es " + cExtra;
    }
           
    
}
