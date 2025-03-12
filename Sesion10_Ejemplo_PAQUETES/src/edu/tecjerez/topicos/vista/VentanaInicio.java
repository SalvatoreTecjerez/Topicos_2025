package edu.tecjerez.topicos.vista;

import javax.swing.JFrame;

import edu.tecjerez.topicos.figuras.Figuras;
import edu.tecjerez.topicos.figuras.Figuras.Rectangulo;
import edu.tecjerez.topicos.figuras.Triangulo;

//import edu.tecjerez.topicos.figuras.Circulo;

import javax.swing.*;



public class VentanaInicio extends JFrame{

	//NO SE PUEDE UTILIZAR YA QUE TIENEN UN MODIFICADOR DE ACCESO
	//QUE IMPIDE SU VISUALIZACION (DEFAULT)
	//Circulo c1 = new Circulo();  
	
	Triangulo t1 = new Triangulo();
	
	Figuras f1 = new Figuras();
	
	//Rectangulo r1 = new Rectangulo(); NO SE PUEDE INSTANCIAR UNA CLASE INERNA
	
	//Forma CORRECTA de instanciar una clase interna
	Figuras.Rectangulo r1 = new Figuras().new Rectangulo();
	
	
	public VentanaInicio() {
		setSize(400, 400);
		setVisible(true);
	}
	
}
