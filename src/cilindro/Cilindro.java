/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cilindro;

import java.util.Scanner;
import misfunciones.Acciones;
import static misfunciones.Acciones.*;

/**
 *  Clase para el cálculo de áreas de cilindros
 * 	@version 1.0, 26/09/2011
 * 	@author Curro
 *      
 */
public class Cilindro {
	

	
	public static void main (String args[]) {
		double radio, altura, area;
		
		System.out.println("Área de un cilindro");
		radio=Acciones.pedirDato("\n\n Introduce el radio en cm");
                System.out.println();
		altura=Acciones.pedirDato("Ahora la altura en cm");
		area=areaCilindro(radio, altura);
		mostrarResultado(area);		
	}
}
