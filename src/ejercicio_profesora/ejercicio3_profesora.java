/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_profesora;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class ejercicio3_profesora {
    public static void main(String[] args) throws FileNotFoundException {
        
        File archivo = new File("src/ejercicio_profesora/NUMEROS.txt");
        FileReader numero = new FileReader(archivo);
        BufferedReader numero1 = new BufferedReader(numero);
        
        int NumeroFichero,mayor=0;
        Scanner entrada = null;
        entrada = new Scanner(archivo);
        while((entrada.hasNextInt())){
            NumeroFichero=entrada.nextInt();
            System.out.println(NumeroFichero);
            if(mayor<NumeroFichero){
                mayor=NumeroFichero;
            }
            
        }
        System.out.println("");
        System.out.println("el numero mayor es " +mayor);
    }
}
