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
class Empleados1{
    private final String nombre;
    private String seccion;
    private int id;
    private static int idSiguiente=0;

    Empleados1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
    public String GetSeccion(){
        return "el nombre es " + nombre + " esta en la seccion " +seccion + "el id es " + id;
    }
    public void SetSeccion(String Seccion){
        this.seccion=Seccion;
    } 

    
    public Empleados1(String nom){
        
        
        this.nombre=nom;
        seccion="Administracion";
        idSiguiente++;
        id=idSiguiente;
        
        
    }

    
    
    public String GetNombre(){
        return "el nombre es " + nombre + " esta en la seccion " +seccion;
    }
    
   
    
    //public void SetNombre(String Nom){
      //  this.nombre=Nom;
   // }
    
    
}
