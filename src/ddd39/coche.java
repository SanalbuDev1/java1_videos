/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddd39;

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
    
    public String muestra_color(){ //getter
        return "el color del coche es  " + color;
    }
    public void declara_color(String color_coche){ //setter
        color=color_coche;
    }
    public void declara_largo(int largo_coche){ //setter
        largo=largo_coche;
    }
    public String dime_datos_generales(){//getter
        return "la plataforma tiene " + ruedas + " de largo " + largo
               +"\n"+ " de ancho "+ ancho+ "centimetros cubicos del motor " + motor 
               + "peso plataforma" + peso_plataforma;
    }
    public void configura_asientos(String asientos_cuero){ //setter
        if(asientos_cuero.equalsIgnoreCase("si")){
            this.asientos_cuero=true;
        }else{
            this.asientos_cuero=false;
        }
    }
    public String dime_asientos(){ //getter
        if(asientos_cuero){
            return "el coche tiene asientos de cuero";
        }else{
            return "el coche no tiene asientos de cuero";
        }
    }
    
    public void configura_climatizador(String climatizador){ //setter
        if(climatizador.equalsIgnoreCase("si")){
            this.climatizador=true;
        }else{
            this.climatizador=false;
        }
    }
    
    public String dime_climatizador(){ //getter
        if(climatizador){
            return "el coche tiene climatizador";
        }else{
            return "el coche no tiene climatizador";
        }
    }
    
    public String peso_coche(){
        int peso_carroceria=500;
        peso_final=peso_plataforma+peso_carroceria;
        
        if(climatizador){
            peso_final=peso_final+50;
        }if(asientos_cuero){
            peso_final=peso_final+20;
        }
        
        return "el peso final es de " +peso_final;
    }
    public int precio_coche(){
        int precio_final=10000;
        if(asientos_cuero){
            precio_final+=50;
        }if(climatizador){
            precio_final+=100;
        }
        
        return  precio_final;
    }
}
