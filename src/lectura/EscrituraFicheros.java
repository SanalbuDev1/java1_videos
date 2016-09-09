/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura;

import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class EscrituraFicheros {

	public static void main(String[] args) {
                Scanner entrada = new Scanner (System.in);
                System.out.println("escriba numeros a crear");
                int numero=entrada.nextInt();
            
		String[] lineas = new String[numero];
                for (int i = 0; i < lineas.length; i++) {
                    System.out.println("numero " + i);
                    lineas[i]=entrada.next();
            }

		/** FORMA 1 DE ESCRITURA **/
		FileWriter fichero = null;
		try {

			fichero = new FileWriter("src/lectura/fichero_escritura.txt");

			// Escribimos linea a linea en el fichero
			for (String linea : lineas) {
				fichero.write(linea + "\n");
			}

			fichero.close();

		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
	}
}