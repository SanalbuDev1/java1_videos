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
public class Constantes_v36 {
    public static void main(String[] args) {
        
        /*Empleados1 miEmple=new Empleados1("paco");
        
        Empleados1 miEmple2=new Empleados1("Juan");
        
        
        System.out.println(miEmple.GetSeccion());
        miEmple.SetSeccion("Programacion");
        System.out.println(miEmple.GetSeccion());
        System.out.println("");
        
        Empleados1.id++;
        System.out.println(miEmple2.GetSeccion());*/
        
       
        
        
        
        
        
        
        
        Empleados1[] emple = new Empleados1[3];
        emple[0]=new Empleados1("Rana");
        
        emple[1]=new Empleados1("Sapo");
        
        emple[2]=new Empleados1("ranita");
        
        //emple[0].SetNombre("Ranita");
        
        
        System.out.println(emple[0].GetSeccion());
              
        System.out.println(emple[1].GetSeccion());
       
        System.out.println(emple[2].GetSeccion());
        
    }
}

