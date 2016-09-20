package Graficos;
import java.util.*;

public class dados1{
	public static void main(String []args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("escriba los numeros de jugadores");
		int jugadores=entrada.nextInt();
		
		int jugador[]=new int [jugadores];
		int mayor[]=new int [jugadores];
		String jugadorNombre[]=new String [jugadores];
		
		int tiro=0,tiro1,x=0,ganador=0;
		
		if(jugadores<=5){
			
			for(int i=0; i<jugadores ;i++){
				System.out.println("escriba el nombre del jugador numero " + (i+1));
				jugadorNombre[i]=entrada.next();
				
			}		
			
			for(int i=0; i<jugadores ;i++){
				System.out.println("es el turno del jugador " + (i+1)  );
                                System.out.println("");
				
				do{
					x+=1;
					System.out.println("tiro numero " + x);
					tiro1=(int)(Math.random()*6);
					System.out.println(tiro1 + "+");
					
					
					
					
					
					
					jugador[i]+=tiro1;
                                        
                                        System.out.println("puntaje acumulado " + i + " " + jugador[i]);
					
					if(jugador[i]>mayor[i]){
						mayor[i]=jugador[i];
                    
					}
					
					
					
					if(tiro1==1){
						jugador[i]=0;
						tiro=6;
                                                mayor[i]=0;
					}else{
						System.out.println("escriba 6 si quiere salir");
						tiro=entrada.nextInt();
					}
					
					
					
					
					
				}while(tiro!=6);			
			}
			
			int comparacion=0;
			
			for(int m=0; m<jugadores ;m++){
			
				if(mayor[m]>comparacion){
				comparacion=mayor[m];
				ganador=m;
			}	
				
			
			
			
			
                        }
                        System.out.println("el ganador es el jugador " + jugadorNombre[ganador] + "con puntaje de " + comparacion);	
		} else{
			System.out.println("no se permite mas de 5 jugadores");
		}
		
		
		
	}
}
