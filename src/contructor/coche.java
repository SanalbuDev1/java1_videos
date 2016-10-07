/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contructor;

/**
 *
 * @author Santy
 */
public class coche {
         
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_final;
    private boolean asientos_cuero,climatizador;
    
    public coche(){
        ruedas=4;
        largo=3;
        ancho=2;
        motor=1600;
        peso_plataforma=500;
    }
    
    public String dime_largo(){ //getter
        return "el largo del coche es " + largo;
    }
    
    public String muestra_color(){
        return "el color del coche es " + color;
    }
    public void declara_color(){ //setter
        color="azul";
    }
    
}
