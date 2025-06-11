package tp;

import java.util.Scanner;
public class ejercicio_22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = 5;		//la cantidad de calificaciones que hay
		double[] calificaciones = new double[n];	// se declara el array de calificaciones, con casillas n, osea 5
		int i = 0;
		while (i<n) {													//se hace un while para abrcar todas las casillas
			System.out.println("ingrese su calificacion n°" + (i+1));	//ingresa la calificacion de la posicion i
			calificaciones[i] = scanner.nextDouble();
			i++;
		}
		double acum = 0;
		double promedio = 0;
		for (double calificacion:calificaciones) {	//se exploran todos las casillas de calificaciones con calificacion , que va a ser lo que ingreso el usuario.
													//donde calificacion representa cada una de las casillas del array en particular
			acum += calificacion;					//se guardan las sumas de cada calificacion en acum
		}
		promedio = acum / n;
		System.out.println("el promedio es: " + promedio);	//se imprime el promedio
	}

}
