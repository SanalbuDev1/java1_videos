/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddd39;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Santy
 */
public class PERSONA_v46 {
    public static void main(String[] args) {
        persona[] person = new persona[2];
        person[0]= new empleado111("santiago", 1600000, 1998, 3, 29);
        person[1]= new alumno("santiago", "ing de sistemas");
        
        for(persona p : person){
            System.out.println(p.dameNombre() + "," + p.dameDescripcion());
        }
    }
   

}

abstract class persona {

    public persona(String nom) {
        nombre = nom;
    }

    public String dameNombre() {
        return "El nombre es " + nombre;
    }

    public abstract String dameDescripcion();
    private String nombre;

}

class empleado111 extends persona {

    public empleado111(String nombre, double sueldo, int año_alta, int mes_alta, int dia_alta) {

        super(nombre);
        this.sueldo = sueldo;

        id1 = idsigui;
        idsigui++;
        GregorianCalendar calendario = new GregorianCalendar(año_alta, mes_alta - 1, dia_alta);
        altaContrato = calendario.getTime();
    }

    public String dameDescripcion() {
        return "Este empleado tiene un id " + id + "Con un sueldo " + sueldo;
    }

    public double dameSueldo() {//getter
        return sueldo;
    }

    public Date dameContrato() {//getter
        return altaContrato;
    }

    public void aumentoSueldo(double porcentaje) { //setter
        double aumento = (sueldo * porcentaje) / 100;
        sueldo += aumento;
    }

    public static String identificador() {
        return "id :" + idsigui;
    }

    public int iden() {

        id++;
        return id;
    }

    private double sueldo;
    public static int id;
    private int id1;
    private static int idsigui = 1;
    private Date altaContrato;
}

class alumno extends persona {

    public alumno(String nombre, String carrera) {
        super(nombre);
        this.carrera = carrera;

    }
    private String carrera;

    public String dameDescripcion() {

        return "este alumno esta estudiando " + carrera;
    }

}
