package tp1;

import java.util.Scanner;
public class ejercicio_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String palabra;
		System.out.println("ingrese una palabra o frase para ser invertida");
		palabra = scanner.nextLine();
		int n = palabra.length();
		int i = 0;
		int j = n;
		System.out.print("La palabra invertida es: ");
		while (j > 0) {
			System.out.print(palabra.charAt(j));
			i++;
			j--;
		}
	}

}
