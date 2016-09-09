/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_profesora;



import java.io.*;


public class ejercicio2_profesora {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File archivo= new File("src/lectura/fichero_leer.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        
        String CadenaTexto;
        while((CadenaTexto = br.readLine())!=null){
            System.out.println(CadenaTexto); 
        }
        br.close();
       
    }
        
}
