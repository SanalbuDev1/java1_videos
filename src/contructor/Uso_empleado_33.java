/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contructor;

import java.util.*;

/**
 *
 * @author Santy
 */
public class Uso_empleado_33 {
    public static void main(String[] args) {
        /*empleado empleado1 = new empleado("paco gomez",8500,1990,12,17);
        empleado empleado2 = new empleado("Johana",28500,1998,12,17);
        empleado empleado3 = new empleado("sebastian",98500,1898,12,17);
        
        empleado1.aumentoSueldo(10);
        empleado2.aumentoSueldo(20);
        empleado3.aumentoSueldo(30);
        
        System.out.println("nombre :" + empleado1.dameNombre() + " sueldo" + empleado1.dameSueldo()+ " fecha de alta "
        + empleado1.dameContrato());
        System.out.println("nombre :" + empleado2.dameNombre() + " sueldo" + empleado2.dameSueldo()+ " fecha de alta "
        + empleado2.dameContrato());
        System.out.println("nombre :" + empleado3.dameNombre() + " sueldo" + empleado3.dameSueldo()+ " fecha de alta "
        + empleado3.dameContrato());
        */
        
        empleado[] misEmpleados=new empleado[3];
        //String miArray[]=new String[3];
        
        misEmpleados[0]=new empleado("paco gomez",123321,1998,12,12);
        misEmpleados[1]=new empleado("Johana",28500,1998,12,17);
        misEmpleados[2]=new empleado("sebastian",98500,1898,12,17);
        
        /*for (int i = 0; i < misEmpleados.length; i++) {
            misEmpleados[i].aumentoSueldo(10);
                  
        }
        for (int i = 0; i < misEmpleados.length; i++) {
            System.out.println("nombre :" +  misEmpleados[i].dameNombre() + " sueldo " +  misEmpleados[i].dameSueldo()+ " fecha de alta "
        +  misEmpleados[i].dameContrato());
        }*/
        
        for (empleado e:misEmpleados) {
            e.aumentoSueldo(10);
                  
        }
        for (empleado e:misEmpleados) {
            System.out.println("nombre :" +  e.dameNombre() + " sueldo " +  e.dameSueldo()+ " fecha de alta "
        +  e.dameContrato());
        
    }
        
    }
}

class empleado{
    public empleado(String nombre,double sueldo,int año_alta,int mes_alta ,int dia_alta){
        this.nombre=nombre;
        this.sueldo=sueldo;
        GregorianCalendar calendario=new GregorianCalendar(año_alta, mes_alta-1, dia_alta);
        altaContrato=calendario.getTime();
    }
    
    public String dameNombre(){ //getter
        return "el nombre es " + nombre;
    }
    public double dameSueldo(){//getter
        return sueldo;
    }
    public Date dameContrato(){//getter
        return altaContrato;
    }
    
    public void aumentoSueldo(double porcentaje){ //setter
        double aumento=(sueldo*porcentaje)/100;
        sueldo+=aumento;
    }
    
    
    private String nombre;
    private double sueldo;
    private Date altaContrato;
}