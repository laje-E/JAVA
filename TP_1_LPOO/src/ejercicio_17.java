package tp;

import java.util.Scanner;
public class ejercicio_17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String palabras;
		System.out.println("ingrese muchas palabras para que puedan ser contadas");
		palabras = scanner.nextLine();
		int n = palabras.length();	//se ve la longitud de la linea de caracteres.
									//para asi poder determinar cuales son todos los casilleros que se van a recorrer
		int i = 0;
		int cont_palabras = 1;		//se inicializa en 1 el contador, ya que se toma en cuenta la primer palabra, la cual no va a empezar por espacio
		String vacio = " ";
		while (i<n) {
			if (palabras.charAt(i) == vacio.charAt(0)) {		//se busca los espacios en blanco, y se suma 1 al contador de palabras
																//ya que asumimos que al poner un espacio inicia una nueva palabra
				cont_palabras++;
			}
			i++;
		}
		System.out.println("La cantidad de palabras es: " + cont_palabras);	//muestra la cantidad de palabras
		
		scanner.close();
		

	}

}
