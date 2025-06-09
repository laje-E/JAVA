package tp1;

import java.util.Scanner;
public class ejercicio_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		System.out.println("ingrese un numero entero no negativo");
		numero = scanner.nextInt();
		int aux = numero;
		int factorial = 1;
		
		while(aux > 0) {
			factorial = factorial * aux;
			aux--;
		}
		
		System.out.println("el resultado del factorial es: " + factorial);
		scanner.close();
		
	}

}