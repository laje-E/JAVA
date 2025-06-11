package tp;

import java.util.Scanner;
public class ejercicio_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		System.out.println("ingrese la cantidad de numeros que quiere ver");
		n = scanner.nextInt();
		
		int[] fibonacci = new int[n];
		int i = 0;
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		System.out.println("la secuencia fibonacci es: ");
		while (i<=n && i < 2){
			System.out.print("|" +fibonacci [i] + "|");
			i++;
		}
		while (i<=n) {
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
			System.out.print("|" + fibonacci[i] + "|");
			i++;
		}
		scanner.close();
	}

}
