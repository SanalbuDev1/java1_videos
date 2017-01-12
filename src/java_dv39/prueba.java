/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_dv39;

/**
 *
 * @author Santy
 */
public class prueba {
    public static void main(String[] args) {
        
        int fila[][]= new int[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i==j){
                    fila[i][j]=1;
                }
                System.out.print(fila[i][j]);
            }
            System.out.println("");
        }
        System.out.println("for each");
        int contador=0;
        for (int i = 0; i < 5; i++) {
           for(int[] n:fila){
            System.out.print(n[contador]);
            
        } 
           contador+=1;System.out.println("");
        }
        
        
        
    }
}
