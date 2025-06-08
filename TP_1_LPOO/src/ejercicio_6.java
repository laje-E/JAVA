package tp1;

import java.util.Scanner;
public class ejercicio_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String palabra;
		System.out.println("ingrese una palabra o frase para ser invertida");
		palabra = scanner.nextLine();
		int n = palabra.length();						//se guarda el valor de la longitud de la palabra ingresada por el usuario. 
														//para luego poder trabajar con ella.
		int i = 0;
		int j = n;
		System.out.print("La palabra invertida es: ");
		while (i <= n) {
			System.out.print(palabra.charAt(j));	//lo que se va a hacer es: se va a imprimir cada letra desde la ultima hasta la primera
													//esto va a producir que la palabra este dada vuelta ya que las ultimas palabras son las primeras en ser imprimidas
													//esto se va a producir durante el ciclo while y con print solo para no generar un salto de linea y que asi esten todas las letras juntas
			i++;
			j--;									//se le reduce en 1 el valor a j para que llegue a 0 y asi se impriman todas las ubicaciones de la palabra
		}
	}

}
