/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_profesora;

import java.io.*;

/**
 *
 * @author Administrador
 */
public class LecturaArchivo {
    
    public  LecturaArchivo() throws FileNotFoundException, IOException {
        File archivo= new File("src/lectura/fichero_leer.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        System.out.println(linea); // solo sirve para una linea
    }
    public static void main(String[] args) throws IOException {
        LecturaArchivo ca =new LecturaArchivo();
        
    }
    
}
