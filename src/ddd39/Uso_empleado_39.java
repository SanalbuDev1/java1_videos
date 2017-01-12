/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddd39;


import java.util.*;

/**
 *
 * @author Santy
 */
public class Uso_empleado_39 {
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
        
       jefe_vv41[] jefe=new jefe_vv41[2];
          jefe[0]=new jefe_vv41("santiago", 400, 2000, 3, 9);
          
           jefe[0].estableceInc(10000);
           System.out.println(jefe[0].dameSueldo());
           
          System.out.println(jefe[0].dameNombre());
        
        
        empleado[] misEmpleados=new empleado[5];
        //String miArray[]=new String[3];
        
        misEmpleados[0]=new empleado("paco gomez",100,1998,12,12);
        misEmpleados[1]=new empleado("Johana",300,1998,12,17);
        misEmpleados[2]=new empleado("sebastian",200,1898,12,17);
       
        misEmpleados[3]=jefe[0]; //Polimorfismo en accion principio de susbtitucion
        misEmpleados[4]=new jefe_vv41("carlos",500,1005,9,3);
        jefe_vv41 jefa_finanzas =(jefe_vv41) misEmpleados[4];
        
        
        
        System.out.println("El empleado " + misEmpleados[0].dameNombre() + "tiene un bonus de " +  misEmpleados[0].estableceBonus(1234.23)) ;
        System.out.println(jefa_finanzas.TomarDesiciones("mas dias de vacaciones"));
      
        int contador=0;
        Arrays.sort(misEmpleados);
        
        for (empleado e:misEmpleados) {
            contador+=1;
            System.out.println("nombre :" +e.dameNombre() + " id: " + e.iden() +  " sueldo " +  e.dameSueldo()+ " fecha de alta "
        +  e.dameContrato());
        
            
            
    }
           System.out.println("el id siguiente sera " + empleado.identificador());
      
        
        
        
    }
}

class empleado implements Comparable,Trabajadores{

    
    
   public Double estableceBonus(Double estableceBonus) {
       double prima=1000;
        return Trabajadores.bonusBase+estableceBonus+prima;
    }
    public int compareTo(Object objecto){
        
        empleado otroem=(empleado) objecto;
        if(this.sueldo<otroem.sueldo){
            return -1;
        }
        if(this.sueldo>otroem.sueldo){
            return 1;
        }
  
            return 0;
       
        
    }
    
    public empleado(String nombre,double sueldo,int año_alta,int mes_alta ,int dia_alta){
        this.nombre=nombre;
        this.sueldo=sueldo;
        
        id1=idsigui;
        idsigui++;
        GregorianCalendar calendario=new GregorianCalendar(año_alta, mes_alta-1, dia_alta);
        altaContrato=calendario.getTime();
    }
    public empleado(String nom){
        this(nom,3000,2000,01,02);
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
    
    public static String identificador(){
        return "id :" + idsigui;
    }
    
    public int iden(){
        
        id++;
        return id;
    }
    
   
    private String nombre;
    private double sueldo;
    public  static int id;
    private int id1;
    private static int idsigui=1;
    private Date altaContrato;

    
    

   
    
}


