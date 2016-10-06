/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Random; 

/**
 *
 * @author Santy
 */
public class matriz_string {
    public static void main(String[] args) {
        
        String matriz[][]=new String[4][4];
        char diccionario[]=new char[123];
        
        for (char i = 'a'; i <= 'z'; i++) {
            diccionario[i]=i;
            System.out.println(diccionario[i]);
        }
        
       
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Random random = new Random( System.currentTimeMillis() ); 
                char cadena_aleatoria = diccionario[ random.nextInt( diccionario.length ) ]; 
                char caracter_aleatorio = (char) random.nextInt();
                System.out.println(caracter_aleatorio);
                if(i==j){
                    
                }
                
            }
        }
        System.out.println("");
        
        
    }
}
