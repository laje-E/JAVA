package tp1;

import java.util.Scanner;
public class ejercicio_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		do {
		System.out.println("ingrese el numero del que quiere tener la tabla de multiplicar (debe ser del 1 al 10)");
		numero = scanner.nextInt();
		}while(numero < 1 || numero > 10);
		int n = 10;
		int i = 1;
		int tabla;
		while(i <= n) {
			tabla = numero * i;
			System.out.println(i + "= | " + tabla + " |");
			i++;
		}
	}

}
