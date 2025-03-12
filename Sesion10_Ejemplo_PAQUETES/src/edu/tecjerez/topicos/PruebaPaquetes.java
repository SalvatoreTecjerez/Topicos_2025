
/*
 *	PAQUETES EN JAVA
 *
 * 	Son directorios (carpetas o folder) que pueden estar o no comprimidos (JAR) y que
 * 	se encuentran dentro de un proyecto. Contienen muchos tipos de archivos inluyendo
 * 	BYTECODE, codigo fuente (opcional), assets (imagenes, sonido, iconos), y otros
 * 	archivos (documentos, etc.)
 * 
 * 
 * 	Para crear una estructura de directorios dentro de un paquete se sigue la siguiente
 * 	convencion:
 * 
 * 		- Se utiliza el DOMINIO WEB de la empresa/institucion, pero a la inversa:
 * 
 * 			Por ejemplo: www.tecjerez.edu.mx
 * 
 * 			Paquete quedaria: edu.tecjerez.otraCarpeta......
 * 
 * 							  edu.tecjerez.topicos.vista
 * 
 * 
 * 		Para indicar la creacion de un paquete, debe hacerse con la palabra RESERVADA
 * 		PACKAGE y esta debe ser la primer linea de codigo de una archivo JAVA
 * 
 */

package  edu.tecjerez.topicos;

import java.util.Scanner;
import javax.swing.SwingUtilities;
import edu.tecjerez.topicos.vista.VentanaInicio;

public class PruebaPaquetes {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new VentanaInicio();
				
			}
		});

	}

}
