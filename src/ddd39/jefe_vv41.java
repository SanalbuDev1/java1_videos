
package ddd39;


public /*final*/  class jefe_vv41 extends empleado implements jefev50 {
    
    public static void main(String[] args) {
         
    }
    
    public String TomarDesiciones(String TomarDesiciones) {
        return "Un miembro de la direccion ha tomado la decision de" + TomarDesiciones;
    }
    public jefe_vv41(String nom , double sue , int agno , int mes , int dia){
        super(nom,sue,agno,mes,dia);
        
    }
    
    public void estableceInc(double b){
        incentivo=b;
    }
    public double dameSueldo(){
        double sueldoJefe=super.dameSueldo();
        return sueldoJefe + incentivo;
    }
    
    private double incentivo;

  
    public Double estableceBonus(Double estableceBonus) {
        double prima=2000;
        return Trabajadores.bonusBase+estableceBonus+prima;
    }

   

    
    
    
}
    class Director extends jefe_vv41{ // clase final jefatura .. public final class obje
        
        public Director(String nom , double sue , int agno , int mes , int dia){
            super(nom,sue,agno,mes,dia);
        }
                
        
    }
