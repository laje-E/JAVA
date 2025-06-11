package tp;

import java.util.Scanner;
import java.util.Random;
public class ejercicio_19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int dado_1;
		dado_1 = random.nextInt(6) + 1;
		int dado_2;
		dado_2 = random.nextInt(6) + 1;
		System.out.println("el valor del dado 1 es: " + dado_1);
		System.out.println("el valor del dado 1 es: " + dado_2);
		int resultado = 0;
		resultado = dado_1 + dado_2;
		System.out.println("la suma de los dos dados es: " + resultado);
		
		scanner.close();
	}

}
