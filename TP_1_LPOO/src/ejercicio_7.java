package tp1;

import java.util.Scanner;
public class ejercicio_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String palabra;
		System.out.println("ingrese la palabra para buscar sus vocales");
		palabra = scanner.nextLine();
		
		int j = palabra.length() - 1;		//se inicia con la longitud -1 ya que las posiciones que tiene el string van de 0 a la longitud -1
											//osea que si es hola la palabra va de 0 a 3, ya que la longitud es 4.
		char letra;							//se inicia la variable letra, donde luego se va a explorar cada letra de la variable palabra.
		int cont_vocal = 0;					//esta variable va a indicar al final cuantasw vocales hay en la palabra
		String vocales;						
		vocales = "aeiouAEIOU"; 			//se asignan todas las vocales para compararlas con cada una de las letras
		int n = vocales.length() - 1;		//se le asigna la longitud de vocales -1 para recorrer todas sus posiciones y asi compararlo con letra
		
		while (j >= 0) {
			int i = 0;
			letra = palabra.charAt(j);		//se ingresa en la variable de la ultima letra a la primera para ser comparada 
			while (i <= n) {				//se hace un ciclo while para explorar todas las posiciones de "vocales"
				if (letra == vocales.charAt(i)) {		//verifica si hay una igualdad, si la hay se le suma 1 al contador
					cont_vocal ++;
				}
				i++;
			}
			j--;
		}
		System.out.println("la cantidad de vocales es: " + cont_vocal);		//se imprime la cantidad de vocales
		scanner.close();		//se cierra el scanner
	}

}
