package tp;

import java.util.Scanner;
import java.util.Random;
public class ejercicio_20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int n;
		System.out.println("ingrese la cantidad de caracteres que desea que tenga su contrasenia");
		n = scanner.nextInt();
		String contraseña = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int longitud = contraseña.length();
		int i = 0;
		
		while (i<n) {
			contraseña.charAt(i) = random.nextLine(longitud);
			
			i++;
		}
		scanner.close();

	}

}
